package com.zeecity.guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class MethodTwo {
    //using while loop

    public static void main(String[] args) {

        System.out.println("Welcome");

        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Would you like to play a game?");
        System.out.println("1)yes");
        System.out.println("2)No ");
        int option = scanner.nextInt();

        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println("Guess the number");
        int userNo = scanner.nextInt();

        int chances = 4;

        if(option == 1) {
            while (chances <= 4 && chances != 0) {
                if (userNo == number) {
                    System.out.println("Congratulations! you win");
                    break;
                } else if (userNo > number) {
                    System.out.println("Guess a lower number");
                    userNo = scanner.nextInt();
                    chances--;
                } else if (userNo < number) {
                    System.out.println("Guess a higher number");
                    userNo = scanner.nextInt();
                    chances--;
                }
            }
            System.out.println("Game Over");

        } else if (option == 2) {
            System.out.println("The End");

        }else{
            System.out.println("Wrong Input");
        }
    }
}
