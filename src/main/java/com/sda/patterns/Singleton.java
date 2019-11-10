package com.sda.patterns;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstace() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Create instance");
        }
        return instance;
    }
}
