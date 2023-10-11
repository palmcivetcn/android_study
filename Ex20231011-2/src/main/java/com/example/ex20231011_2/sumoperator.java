package com.example.ex20231011_2;

import java.util.ArrayList;

public class sumoperator {
    private ArrayList<String> arr1 = new ArrayList<>();
    private ArrayList<String> arr2 = new ArrayList<>();
    private int num1, num2;
    private String str1 = "扑克牌A的结果为：";
    private String str2 = "扑克牌B的结果为：";
    private int i = 0;
    private int j = 0;

    public sumoperator() {
    }

    public String getArr1() {
        num1 = (int) (Math.random() * 12) + 1;
        arr1.add(Integer.toString(num1));
        if (i > 0) {
            str1 += ",";
        }
        str1 += arr1.get(i);
        i++;
        return str1;
    }


    public String getArr2() {
        num2 = (int) (Math.random() * 12) + 1;
        arr2.add(Integer.toString(num2));
        if (j > 0) {
            str2 += ",";
        }
        str2 += arr2.get(j);
        j++;
        return str2;
    }


    public int getNum1() {
        return num1;
    }


    public int getNum2() {
        return num2;
    }

}
