package com.careerDevs;

import java.util.Random;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }

    public void roll() {
//        faceUpValue = (int) ((Math.random() * numberOfSides) + 1);
        Random dieFaceValues = new Random();
        int maxDieFaceValue = 6;
        int minDieFaceValue = 1;
        faceUpValue = dieFaceValues.nextInt(maxDieFaceValue) + minDieFaceValue;
    }

//    public Die(int numberOfSides) {
//        this.numberOfSides = numberOfSides;
//    }

}
