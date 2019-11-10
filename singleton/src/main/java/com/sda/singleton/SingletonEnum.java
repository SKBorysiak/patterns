package com.sda.singleton;

public enum SingletonEnum {

    INSTANCE;

    public void connection(){
        System.out.println("INSTANCE singleton enum = " + INSTANCE);
    }
}
