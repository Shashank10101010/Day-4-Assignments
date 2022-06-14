package com.bridgelab;

import java.util.Random;

public class UC4Repeatation {
    public static void main(String[] args) {

        int zeroPosition = 0;
        Random random = new Random();
        int diceValue = 1 + random.nextInt(6);
        System.out.println("this + " + diceValue);

        while (diceValue < 101) {
            if (diceValue == 100) {
                System.out.println("Dice is reached :- "+diceValue);
            }
            diceValue++;
        }

    }
}
