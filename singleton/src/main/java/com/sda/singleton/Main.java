package com.sda.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
        System.out.println("singletonEnum = " + singletonEnum);
    }
}
