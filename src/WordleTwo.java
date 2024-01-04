import java.util.Scanner;

/*Brielle Roze
(Same as previous Wordle Proj except this one has a different approach)
Date: 12/5/23
Notes: I think rather than trying to randomly select the five letter word from a file (Can read a file and stuff but
don't know how to base on their location search for one, just randomly select a word from an array or list and hav
that be the word
//pg 651 lets you compare two strings
 */

import java.io.*;
import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class WordleTwo
{
    private int word;
    public WordleTwo(int word)
    {
        this.word = word;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Word-le! You will get five tries to guess a word. Please input a 5 letter word:");
        //get user input and evaluates it
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[] array = s1.split(" "); //puts input into an array
        //Check if user input has 5 characters
        int r = array.length;     //length by # of words: r * use this and add the users new input
                                  // every time into the array and once the array reaches a total of
                                 // 5 words GAME OVER, essentially counting the number of guesses
                    //Ex: do{~~~}while (r!>5) --> Game over
        int l = s1.length();      //length by # of characters: r
        System.out.println(s1.length());
        //counts 1,2,3,4,5 NOT 0,1,2,3,4

        if (l < 5)
        {
            System.out.println("Error your input has to few characters. It needs one 5 letter word!");

        }
        else if (l > 5)
        {
            System.out.println("Error your input has to many characters. It needs one 5 letter word!");

        }
        else
        {
            //Have this proceed to the word being compared with the Wordle word, give user feed back on
            // similarities and unless users word matches prompt for more input, add each of their words
            // to the array and once the array has 5 words GAME OVER

        }
    }
}
