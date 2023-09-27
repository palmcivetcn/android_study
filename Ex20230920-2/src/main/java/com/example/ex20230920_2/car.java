package com.example.ex20230920_2;

public class car extends vehicial {
    private int doors;

    public car(String name, double price, int doors) {
        super(name, price);
        this.doors = doors;
    }

    public String getcarinfo() {
        return "轿车信息:\n" + getvehicialinfor() + "\n车有几个门:" + doors + "\n";
    }
}
