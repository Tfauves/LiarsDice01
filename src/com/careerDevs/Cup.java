package com.careerDevs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cup {
    List<Die> dice = new ArrayList<>();
    //Map<Integer, Integer> dice = new HashMap<>();

    public Cup() {
        while(dice.size() < 5) {
            dice.add(new Die());

        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }


    public String displayCup() {
        String output = "";
        for (Die die : dice) {
            output += die.faceUpValue + " ";
        }
        return output.trim();
    }

    public void loseADie() {

    }


}
