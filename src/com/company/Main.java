package com.company;

import java.util.ArrayList;

class intClass {
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(55));

        Integer integer = new Integer(55);
        Double doubleValue = new Double(222.5);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // autoboxinng
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -----> " + intArrayList.get(i).intValue()); // unboxing
        }

        Integer myIntValue= 56; //Integer.valueOf(55)
        int myInt = myIntValue.intValue();

    }
}
