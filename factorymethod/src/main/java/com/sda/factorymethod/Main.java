package com.sda.factorymethod;

public class Main {
    public static void main(String[] args) {
        RobotFactory robotFactory=new RobotFactory();
        robotFactory.makeRobot("BAD_JOKE_ROBOT");
    }
}
