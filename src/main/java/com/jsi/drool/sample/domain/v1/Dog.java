package com.jsi.drool.sample.domain.v1;

public class Dog {

    private String name;
    private int woufTimes;
    private boolean houseKeeper;
    private boolean inside;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWoufTimes() {
        return woufTimes;
    }

    public void setWoufTimes(int woufTimes) {
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
