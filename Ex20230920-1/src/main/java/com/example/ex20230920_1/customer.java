package com.example.ex20230920_1;

public class customer {
    private String name;
    private String address;
    private int age;

    public customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getlableldata() {
        String str = "";
        str += "姓名:" + name;
        str += "地址:" + address;
        str += "年龄:" + age;
        str += "\n------------";
        return str;
    }
}
