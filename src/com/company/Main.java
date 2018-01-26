package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // generate a random number and allow the user to put in a number in
        // we will then tell the user if the number is too high or too low
        // allow for five chances, if the number isnt guessed after these tries then tell the user what the number is and ask the user if they want to play again
        // if the get it right, congradulate them, and then ask them if they want to play again


        Scanner input = new Scanner(System.in);
        int numberOfGuess = 0;
        final int Max_GUESS_Count = 4;
        System.out.println("Enter your guess;");


        int userGuess = input.nextInt();


        int generateNumber = (int) Math.ceil(Math.random() * 100);

        while (numberOfGuess < +5)
            ;
        if (userGuess > generateNumber) {
            System.out.println("your number is too high");
            numberOfGuess++;
        } else if (userGuess < generateNumber) {
            System.out.println("your number is too low");
            numberOfGuess++;

        else if (userGuess == generateNumber) {
                System.out.println("you guessed the correct number");
            } else if (numberOfGuess == Max_GUESS_Count) ;


        } while {
            numberOfGuess <= 4;
        }


     if(numberOfGuess ==5)

    {
        System.out.println("you have run out of guesses");


    }




    }
}
