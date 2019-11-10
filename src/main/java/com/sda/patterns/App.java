package com.sda.patterns;


public class App {
    static class Task1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstace();
            System.out.println("singleton = " + singleton);

        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstace();
            System.out.println("singleton = " + singleton);
        }
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstace();

        System.out.println(singleton);

        Thread thread1= new Thread(new Task1());
        thread1.start();

        Thread thread2= new Thread(new Task2());
        thread2.start();

    }
}
