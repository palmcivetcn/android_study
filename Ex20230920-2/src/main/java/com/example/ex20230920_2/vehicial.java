package com.example.ex20230920_2;

public class vehicial {
    private String name;
    private double price;

    public vehicial(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private vehicial() {
    }

    public String getvehicialinfor() {
        return "型号：" + name + "\n价格：" + price;
    }
}
