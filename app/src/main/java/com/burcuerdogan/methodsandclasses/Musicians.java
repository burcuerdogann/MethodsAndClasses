package com.burcuerdogan.methodsandclasses;

public class Musicians {

    //Attribute

    String name;
    String instrument;
    int age;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
    }
}