package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        // generate a random number and allow the user to put in a number in
//        // we will then tell the user if the number is too high or too low
//        // allow for five chances, if the number isnt guessed after these tries then tell the user what the number is and ask the user if they want to play again
//        // if the get it right, congradulate them, and then ask them if they want to play again
//
//
//        Scanner input = new Scanner(System.in);
//        int numberOfGuess = 0;
//        final int Max_GUESS_Count = 4;
//        System.out.println("Enter your guess;");
//
//
//        int userGuess = input.nextInt();
//
//
//        int generateNumber = (int) Math.ceil(Math.random() * 100);
//
//        while (numberOfGuess < +5)
//            ;
//        if (userGuess > generateNumber) {
//            System.out.println("your number is too high");
//            numberOfGuess++;
//        } else if (userGuess < generateNumber) {
//            System.out.println("your number is too low");
//            numberOfGuess++;
//
//        else if (userGuess == generateNumber) {
//                System.out.println("you guessed the correct number");
//            } else if (numberOfGuess == Max_GUESS_Count) {
//
//
//            }
//
//
//            if (numberOfGuess == 5)
//
//            {
//                System.out.println("you have run out of guesses");
//
//
//            }
//
//
//        }
//    }

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


class Main {
    public static void main(String[] args) {

        System.out.println("Guess a number 1 through 100 you have five chances so make them count!");
        // ask for user to think of a number.


        while (true) {

            int u = 0;
            Scanner input = new Scanner(System.in);

            // int u;
            // Scanner input = new Scanner(System.in);


            int r;
            Random rand = new Random();
            r = rand.nextInt();
            int Min = 1;
            int Max = 100;

            int showMe = Min + rand.nextInt(Max);
            // this above is generating a random nmber if you want to see it system.println "showMe"


            int numberOfGuess = 0;
            int n = numberOfGuess;
            // making the number of guesses "n"


            ///// showing the number
            //System.out.println(showMe);


            // int u;
            // Scanner input = new Scanner(System.in);

            do {
                try {

                    for (n = 0; n < 5; n++) {

                        u = input.nextInt();

                        if (u == showMe) {
                            System.out.println("That was the correct number do you want to play again?");
                            break;


                        } else if (n == 3 && u < showMe) {
                            System.out.println("Your number is too low and It's your last guess, good luck!");
                        } else if (n == 3 && u > showMe) {
                            System.out.println("Your number is too high and It's your last guess good luck!");
                        } else if (n == 4) {
                            System.out.println("your out of guesses the answer was " + showMe + " would you like to try again? yes//no ?" +
                                    "");
                        } else if (u > showMe && n != 3 && n != 4) {
                            System.out.println("your number is too high,try again !");
                        } else if (u < showMe && n != 3 && n != 4) {
                            System.out.println("your number is too low,try again ! ");


                        }
                    }


                } catch (InputMismatchException ime) {
                    System.out.println("You didnt type a number in try again");
                    input.nextLine();
                    n++;


                }

            } while (n != 5 && u != r);

            String yes = "yes";
            String no = "no";
            Scanner approval = new Scanner(System.in);
            String approval1 = approval.nextLine();


            if (approval1.equals(yes)) {
                System.out.println("You want to play again okay pick another number!");

            }
            if (approval1.equals(no)) {
                System.out.println("Okay thanks for playing!");
                break;
            }


        }
    }
}


