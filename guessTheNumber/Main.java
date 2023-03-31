package com.zeecity.guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //using for loop

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

        if(option == 1){
            Random random = new Random();
            int number = random.nextInt(10);

            System.out.println("Guess the number");
            int userNo = scanner.nextInt();

            for(int i=1; i<5; i++) {
                if (userNo == number) {
                    System.out.println("Congratulations! you win");
                    break;
                } else if (userNo < number) {
                    System.out.println("Guess a higher number");
                    userNo = scanner.nextInt();
                } else if (userNo > number) {
                    System.out.println("Guess a lower number");
                    userNo = scanner.nextInt();
                }
            }

            System.out.println("Game over");

            }else if(option == 2){
            System.out.println("The End");
        }else{
            System.out.println("Wrong input");
        }
    }
}
