package com.jsi.drool.sample.domain.v1;

public class Cat {

    private String name;
    private int meowTimes;
    private boolean inside;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeowTimes() {
        return meowTimes;
    }

    public void setMeowTimes(int meowTimes) {
        this.meowTimes = meowTimes;
    }

    public boolean isInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside = inside;
    }
}
