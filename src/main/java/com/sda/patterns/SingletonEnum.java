package com.sda.patterns;

public enum SingletonEnum {

    INSTANCE;

    public void connection(){
        System.out.println("INSTANCE singleton enum = " + INSTANCE);
    }
}
