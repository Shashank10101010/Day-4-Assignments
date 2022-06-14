package com.bridgelab;

import java.util.Random;

public class UC3CheckingOption {
    public static void main(String[] args) {

        int zeroPosition = 0;
        int ladder = 2;
        int snake = 3;


        Random random = new Random();

        int diceValue = 1 + random.nextInt(6);

        int chance = 1 + random.nextInt(3);

        switch(chance)
        {
            case 1:
                System.out.println("Start position");
                zeroPosition = 0;
                System.out.println("The position is " + zeroPosition);
                break;


            case 2:
                System.out.println("Forward move");

                String currentPosition;
                if((diceValue + zeroPosition) > 100)
                {
                    zeroPosition = zeroPosition - diceValue;
                    System.out.println("The position is " + zeroPosition);
                }
                else {
                    zeroPosition = zeroPosition + diceValue;
                    System.out.println("The current position is  " + zeroPosition);
                }

                break;


            case 3:
                System.out.println("Backward move");
                zeroPosition = zeroPosition - diceValue;
                if(zeroPosition <= 0) {
                    zeroPosition = 0;
                    System.out.println("The position is " + zeroPosition);
                }
                else
                    System.out.println("The position is " + zeroPosition);


        }


    }
}
