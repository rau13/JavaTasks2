package com.company;

public class Lesson4_1 {

    public static void main(String[] args) {
        int total = 1000;

        int water = 100;
        int waterCount = 1;

        int banana = 150;
        int bananaCount = 1;

        int chocolate = 200;
        int chocolateCount = 1;

        bananaCount++; //инкремент
        bananaCount++; //инкремент
        chocolateCount++; //инкремент
        bananaCount--; // декремент

        total-= waterCount*water;
        System.out.println("После покупки осталось: " + total);

        total-= bananaCount*banana;
        System.out.println("После покупки осталось: " + total);

        total-= chocolateCount*chocolate;
        System.out.println("После покупки осталось: " + total);


    }
}

