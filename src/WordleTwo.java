/*Brielle Roze
(Same as previous Wordle Proj except this one has a different approach)
Book and etc. notes:
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
Progress Notes:
    Date: 12/5/23
Notes: I think rather than trying to randomly select the five-letter word from a file (Can read a file and stuff but
don't know how to base on their location search for one, just randomly select a word from an array or list and hav
that be the word
//pg 651 lets you compare two strings
    Date: 1/22/23
Notes: Kind of weird place to pick back up at but will reference other(old) wordle proj.
What I need to work on is adding something that counts the number times the user has input a possible answer,
and make it, so they can submit a max number of 5 times, as well a spellchecker so far we just count how many
letters (5 min & max), but we don't check if it's actually a word like someone could to "aeiou", which would help
provide them an answer but since it's not an actual word would defeat the difficulty of the game. In addition to spell
checker need to add something so that the after reading the users input and confirming length and accuracy it now tells
the user what letter from their input are in the final word and if their in the correct place, as well as have to add
code that randomly selects a five-letter word, maybe frm a given list the user has access to(?)
    Date:1/24/24
Notes: First need to work on the computer generating the random five-letter word as well as spell checking user input and see if
it's a real five-letter word before continuing then when the user has input their first word next tell them what of their
word is similar to actual word, as well as add it to how many tries they have left, and let them go for a second try, third, fourth, fifth, and each time spell check and compare and return information on whats correct.
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
//No clue what this commentated out part was for
//private int word;
//public WordleTwo(int word)
//{this.word = word;}
    public static void main(String[] args)
    {
        int retry = 0;
        int num = 1;
        while (retry != num) {
            System.out.println("Welcome to Word-le! You will get five tries to guess a word. Please input a 5 letter word:");
            //Have computer select random five-letter word perhaps from given list, rather than some whole 'dictionary' of just 5-letter words, because that would require file reading and there are easier ways.
            //random numbers {used page 307-308
            /*Wordle Words:
            mends
            ratio
            lucky
            later
            guess
            build
            debug
            adieu
            found
            paper
            bloat
            watch
            */

            Random r = new Random();
            int number = r.nextInt(3) + 1; // random number from 1 to 3
            System.out.println();
            //nested if/else {page 235
            if (number == 1) {
                System.out.println(" \n"); //The computer has chosen:
            } else if (number == 2) {
                System.out.println(" \n"); //The computer has chosen:
            } else if (number == 3) {
                System.out.println(" \n"); //The computer has chosen:
            }
            else {
                System.out.println("Error in computer output \n");
            }
            //get user input and evaluates it
            Scanner input = new Scanner(System.in);
            String s1 = input.nextLine();
            String[] array = s1.split(" "); //adds input into an array
            //Check if user input has 5 characters
                int l = s1.length();      //length by # of characters: r
                System.out.println("length of your output" + s1.length());
                //counts 1,2,3,4,5 NOT 0,1,2,3,4
                if (l < 5) {
                    System.out.println("Error your input has to few characters. Please input one 5 letter word!");
                } else if (l > 5) {
                    System.out.println("Error your input has to many characters. Please input one 5 letter word!");
                } else {
                    retry = 1;
                    // amount of attempts now 1;
                    //now moved outside the while
                    //Have this proceed to the word being compared with the Wordle word, give user feed back on
                    // similarities and unless users word matches prompt for more input, add each of their words
                    // to the array and once the array has 5 words GAME OVER
                }
            }
        //honestly the following is meant to now that the user has inout their first word next tell them what of their
        // word is similar to actual word, as well as add it to how many tries they  have left, and let them go for a
        // second try. But for now need to work on generating the random five-letter word as well as spell checking user
        // input and see if it's a real five-letter word before continuing to this part.
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[] array = s1.split(" "); //puts input into an array
        int r = array.length;
        //length by # of words: r * use this and add the users new input
        // every time into the array and once the array reaches a total of
        // 5 words GAME OVER, essentially counting the number of guesses
        //Ex: do{~~~}while (r!>5) --> Game over
        while (r != 5)
        {
        }
    }
}