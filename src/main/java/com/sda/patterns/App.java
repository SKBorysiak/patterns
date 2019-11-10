package com.sda.patterns;


import com.sda.patterns.singleton.Singleton;
import com.sda.patterns.singleton.SingletonEnum;

public class App {
    static class Task1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstace();
            System.out.println("singleton = " + singleton);

        }
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstace();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        System.out.println("singletonEnum = " + singletonEnum);
        System.out.println(singleton);

        Thread thread1 = new Thread(new Task1());
        thread1.start();

    }
}
