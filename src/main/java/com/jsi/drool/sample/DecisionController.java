package com.jsi.drool.sample;

import com.jsi.drool.sample.domain.v1.House;
import com.jsi.drool.sample.domain.v2.Basket;
import com.jsi.drool.sample.domain.v2.Line;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecisionController {


    private final KieContainer kieContainer;

    public DecisionController(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @PostMapping("/house")
    private House isTheCatInside(@RequestBody House house) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(house);
        kieSession.insert(house.getDog());
        kieSession.fireAllRules();
        kieSession.dispose();
        return house;
    }

    @PostMapping("/basket")
    private Basket calculate(@RequestBody Basket basket) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(basket);
        for (Line line : basket.getLines()) {
            kieSession.insert(line);
        }
        //kieSession.startProcess("RF1");
        kieSession.fireAllRules();
        kieSession.dispose();
        return basket;
    }
}
