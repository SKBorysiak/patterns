package com.sda.patterns;


public class App {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstace();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        System.out.println("singletonEnum = " + singletonEnum);
        System.out.println(singleton);



    }
}
