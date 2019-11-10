package com.sda.patterns;


import com.sda.singleton.Singleton;
import com.sda.singleton.SingletonEnum;

public class App {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstace();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        System.out.println("singletonEnum = " + singletonEnum);
        System.out.println(singleton);



    }
}
