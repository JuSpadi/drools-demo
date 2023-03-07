package com.jsi.drool.sample.domain.v1;

public class Cat {

    String name;
    Integer meowTimes = 0;
    boolean inside;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMeowTimes() {
        return meowTimes;
    }

    public void setMeowTimes(Integer meowTimes) {
        this.meowTimes = meowTimes;
    }

    public boolean isInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside = inside;
    }
}
