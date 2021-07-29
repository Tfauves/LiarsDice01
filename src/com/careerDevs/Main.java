package com.careerDevs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Game liarsDice = new Game();

        Cup cup1 = new Cup();
        cup1.roll();
        System.out.println(cup1.displayCup());

    }
}
