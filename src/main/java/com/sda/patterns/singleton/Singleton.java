package com.sda.patterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public synchronized static Singleton getInstace() { //trzeba pamietac o synchronized
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Create instance");

        }
        return instance;
    }
}
