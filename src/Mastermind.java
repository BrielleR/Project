/*Brielle Roze
Proj 5
chapter 7 pg 499
Requirement sourced from: https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet05.md
Write a program that plays a variation of the game Mastermind with a user. The program should generate a four-digit
number. User allowed to guess until she gets the number correct. Clues are given to the user indicating how many
digits are correct and in the correct place. (BJP Ch 7 Proj 3) You should output two things after the user guesses.
The number of digits that are correct AND in the correct location. The number of digits that are correct BUT not in
the correct location. These are mutually exclusive. A digit cannot be both in the correct location and not in the
correct location. Below is a test case to test your code. Make sure that your "Secret" is the given number (6684)
and then use the guesses to check your outputs to see that they match up with the test. By the way, traditional
Mastermind had only 4 pins which could have 6 different colors (we are using 4 pins with 10 colors/digits). One
player put in the secret and the other player guessed based on feedback. Feedback was given in terms of black and
white pegs. A black peg signified that the guesser had gotten a pin of the correct color in the correct position.
A white peg signified that the guesser had gotten a pin of the correct color in the wrong location.
Secret number: 6684
  For the rest & examples: https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet05.md
    Personal Notes:
 Using what I do in Wordle would very helpful just instead of any random five-letter word their guessing must be
 the four-digit NUMBER (6684)
 426 - arrays and more array info
pg 438 - Random access with arrays
pg 694:
"
HashSet is the general-purpose set class, while
TreeSet offers a few advantages that will be discussed later. If you wanted to store a
set of String values, you could write code like the following:
Set<String> stooges = new HashSet<String>();
stooges.add("Larry");
stooges.add("Moe");
stooges.add("Curly");
stooges.add("Moe"); // duplicate, won't be added
stooges.add("Shemp");
stooges.add("Moe"); // duplicate, won't be added
"
Those things:
-import java.io.*;
-import java.util.*;
-import java.io.File;
-import java.util.ArrayList;
-import java.util.Collections;
-import java.util.List;
-import java.util.Scanner;
-import java.util.Arrays;
-import java.util.Random;
-import java.util.Scanner;
 11/8/23 - began working on Wordle completed it on 1/28/24
 1/29/24 - need to make an array of numbers
 1/30/24 - okay so similar to Wordle but different as idea is if it's in the correct position and is the correct
 number it will be marked as a black nob and if it's the correct number but in the wrong position, but its important
 doubles of the same number and how each thing will be marked and told to the user, we know the final answer has
 two sixes so if the user only enters one six in one of the correct locations it should only be marked as black not
 black and white, so each entered number needs to be either only one black or one white.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Mastermind
{

    public static void main(String[] args) {
        String[] wordList = {"6684"}; //list of four digit number
        String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
        int chances = 6; //player has 6 chances to guess the word
        char[] guess = new char[4];
        int retry = 0;
        int start;
        int num = 1;
        System.out.println("Welcome to Mastermind."); //Intro
        System.out.println(""); //explain
        System.out.println("\nIf you would like to play please type 1 if not enter 0)");
        Scanner reset = new Scanner(System.in);
        start = Integer.parseInt(reset.nextLine());
        if (start == 1)
        {
            while (chances > 0 && !Arrays.equals(guess, answer.toCharArray())) {
                System.out.println("\nPlease enter your guess(must be a four digit number): ");
                Scanner game = new Scanner(System.in);
                String input = game.next();
                if (input.length() != 4) {
                    System.out.println("\nYour guess was not a four digit number!");
                    continue;
                }
                guess = input.toCharArray();
                //time to give the user input, check the users guess as well as give feedback through coloring the letters to let them know how accurate their guess is
                for (int i = 0; i < 4; i++) {
                    if (guess[i] == answer.charAt(i))
                    {
                        System.out.print("\033[1;30m" + guess[i] + "\033[0m"); // if is correct number in correct place number turns black
                    //make in black pegs and add to it
                    }
                    else if (answer.contains(Character.toString(guess[i])))
                    {
                        System.out.print("\033[1;29m" + guess[i] + "\033[0m"); // if it is the correct number in the wrong position turns white
                        //make in white pegs and add to it
                    }
                    //6684
                    //32 = green   33 = yellow  34 =blue 31 =red  30 = BLACK 35 = purple 29 = WHITE 36 = light blue 37 = grey
                }
                System.out.println();
                chances--;
                System.out.println("\nYou have " + chances + "/6 chances left!");
            }
            if (chances > 0) {
                System.out.println("\nCONGRATULATIONS! You have successfully guessed the four digit number: " + answer);
            } else {
                System.out.println("\nOh no! you are out of chances to guess the four digit number. The number was: " + answer);
            }
            //Lets user choose if they would like to retry
            System.out.println("\nWould you like to play again? if not enter 1 if so please enter 0.");
            Scanner choice = new Scanner(System.in);
            retry = Integer.parseInt(choice.nextLine());
        } else
        {
            retry = 1;
        }
    }
/*
    public static void main(String[] args) {

        //String[] wordList = {"mends", "ratio", "lucky", "later", "guess", "build", "debug", "adieu", "found", "paper", "bloat", "watch"}; //list of five-letter words
        //String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
       // char[] guess = new char[5];
        int[] IntList = {6684, 6684, 6684, 6685};
        int answer = IntList[new Random().nextInt(IntList.length)]; //picks random number from the list there's only one in it
        int chances = 6; //player has 6 chances to guess the word
        int[] guess = new int[4];
        int retry = 0;
        int num = 1;
        System.out.println(""); //Intro
        System.out.println(""); //explain
        System.out.println("\nIf you would like to play please type 0 if not enter 1)");
        Scanner reset = new Scanner(System.in);
        int start = Integer.parseInt(reset.nextLine());
        if (start == 0)
        {
            while (chances > 0 && !Arrays.equals(guess, answer.IntArray())) {
                System.out.println("\nPlease enter your guess(must be a five-letter word): ");
                Scanner game = new Scanner(System.in);
                String input = game.next();
                if (input.length() != 4) {
                    System.out.println("\nYour guess was not a four digit number!");
                    continue;
                }
                guess = input.toIntList();
                //time to give the user input, check the users guess as well as give feedback through coloring the letters to let them know how accurate their guess is
                for (int i = 0; i < 4; i++) {
                    if (guess[i] == answer.intAt(i)) {
                        System.out.println("\033[1;32m" + guess[i] + "\033[0m"); //changes correct letter/place Green, change to if is correct number in correct number turns black
                    } else if (answer.contains(Int.toInt(guess[i]))) {
                        System.out.println("\033[1;33m" + guess[i] + "\033[0m"); //changes correct letter wrong place Yellow, change to if it is the correct number in the wrong position turns white
                    } else {
                        System.out.println("\033[1;34m" + guess[i] + "\033[0m"); //changes wrong letter wrong place Blue get rid of
                    }
                }
                System.out.println();
                chances--;
                System.out.println("\nYou have " + chances + "/6 chances left!");
            }
            if (chances > 0) {
                System.out.println("\nCONGRATULATIONS! You have successfully guessed the five-letter word: " + answer);
            } else {
                System.out.println("\nOh no! you are out of chances to guess the word. The word was: " + answer);
            }
            //Lets user choose if they would like to retry
            System.out.println("\nWould you like to play again? if not enter 1 if so please enter 0.");
            Scanner choice = new Scanner(System.in);
            retry = Integer.parseInt(choice.nextLine());
        } else
        {
            retry = 1;
        }
    }
    }
        */



}
