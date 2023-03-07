package com.jsi.drool.sample.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsSpringConfiguration {

    private final KieServices kieServices = KieServices.Factory.get();


    @Bean
    public KieContainer getKieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        //kieFileSystem.write(ResourceFactory.newClassPathResource("v1/houseKeep.drl"));
        //kieFileSystem.write(ResourceFactory.newClassPathResource("v2/rf.bpmn"));
        kieFileSystem.write(ResourceFactory.newClassPathResource("v2/basket.drl"));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}
