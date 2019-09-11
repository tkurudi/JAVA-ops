package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3

        System.out.println("1 + 2 = " + result);

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("code block");
        }

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("You have the highest score");
        }

        int secondTopScore = 60;

        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }


    }
}
