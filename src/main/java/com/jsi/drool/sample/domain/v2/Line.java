package com.jsi.drool.sample.domain.v2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Line {


    public String number;
    public BigDecimal quantity;
    public BigDecimal unitaryAmount;
    public BigDecimal amount;
    public List<Discount> discounts = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitaryAmount() {
        return unitaryAmount;
    }

    public void setUnitaryAmount(BigDecimal unitaryAmount) {
        this.unitaryAmount = unitaryAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void reduce(BigDecimal reduction){
        this.amount = this.getAmount().subtract(reduction);
    }
}
