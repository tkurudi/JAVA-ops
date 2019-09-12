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

        if((topScore > secondTopScore) && (topScore < 100)) {

            System.out.println("Greater than second top score and less than 100");
        }


        double var1 = 20.00;
        double var2 = 80.00;

        double var3 = (var1 + var2) * 100.00;
        double var4 = var3 % 40.00;

        boolean var5 = (var4 == 0) ? true : false;
        System.out.println(var5);
        if(!var5) {
            System.out.println("got remainder  ");
        }
    }
}
