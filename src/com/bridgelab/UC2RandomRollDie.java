package com.bridgelab;

import java.util.Random;

public class UC2RandomRollDie {

    public static void main(String[] args) {
        int roll;
        Random random = new Random();
        roll = random.nextInt(7);
        System.out.println(roll);
    }
}
