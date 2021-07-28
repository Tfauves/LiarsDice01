package com.careerDevs;
import java.util.Random;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

//    //public void roll() {
//        faceUpValue = (int) ((Math.random() * numberOfSides) + 1);
//    }
//


    public void roll() {
       Random dieFaceValue = new Random();
       int dieMaxSide = 6;
       int dieMinSide = 1;
       faceUpValue = dieFaceValue.nextInt(dieMaxSide) + dieMinSide;
    }
}