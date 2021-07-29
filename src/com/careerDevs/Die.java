package com.careerDevs;
import java.util.Random;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }

    public void roll() {
       Random dieFaceValue = new Random();
       int dieMaxSide = 6;
       int dieMinSide = 1;
       faceUpValue = dieFaceValue.nextInt(dieMaxSide) + dieMinSide;
    }


}