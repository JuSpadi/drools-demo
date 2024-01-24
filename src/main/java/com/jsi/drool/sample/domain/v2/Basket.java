package com.jsi.drool.sample.domain.v2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Line> lines;
    private BigDecimal totalAmount;
    private List<BasketError> errors = new ArrayList<>();

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<BasketError> getErrors() {
        return errors;
    }

    public void setErrors(List<BasketError> errors) {
        this.errors = errors;
    }
}
