package com.sda.factorymethod;

import java.awt.*;

public class RobotFactory {

    public Robot makeRobot (String robotType){
        if (robotType== "DRILLING_ROBOT"){
            return new DrillingRobot();
        }
        if (robotType=="BAD_JOKE_ROBOT"){
            return new BadJokeRobot();
        }
        return null;
    }


}
