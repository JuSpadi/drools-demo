package com.jsi.drool.sample.domain;

public class Dog {

    String name;
    Integer woufTimes = 0;
    boolean houseKeeper;
    boolean inside;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWoufTimes() {
        return woufTimes;
    }

    public void setWoufTimes(Integer woufTimes) {
        this.woufTimes = woufTimes;
    }

    public boolean isHouseKeeper() {
        return houseKeeper;
    }

    public void setHouseKeeper(boolean houseKeeper) {
        this.houseKeeper = houseKeeper;
    }

    public boolean isInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside = inside;
    }
}
