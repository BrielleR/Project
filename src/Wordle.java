/*Brielle Roze
Project 4: Wordle
Reference Pages used:
11/8/23 - 11/_/23
Date:11/8/23
Notes: Mostly just research: Use pg 778, pg 681 (must use lists and classes) THOUGHT: to keep track of their attempts
use pg 683 and imagine it as words.add("x"); x being the users input and count how many words are in the string to
keep track of how many words they have tried as all of them will be added to the list then maybe make a loop around
it that if the list reaches five words then game over and the user fails and can either rest game but like have
 another word the next time round
or just hit enter and be done
Date: 11/27/23
Notes: Check for if users input has 5 characters, pick a word randomly from file, then check if any of the characters
from the user input are the same as the random 5-letter word selected from the file then tell user if any match and
which letters match as well as if there in the right place.
Date: 11/28/23
Notes: Can now count whether the user has a correct number of characters (5 only) in their input, still need to add a
working loop back to the start not just end when user has less that needed input or more (right now when inout is too
big or if to small just endlessly tells user that), and found a way to keep track of how many times they have guessed
a word can't really apply till I add what the word is whether their input matches it in any way, and prompt the user
 to input another word.
*/
import java.io.*;
import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Wordle
{
    public static void main(String[]args) throws FileNotFoundException {
        System.out.println("Welcome to Word-le! Please input a 5 letter word:");
        //get user input and evaluates it
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[] array = s1.split(" "); //puts input into an array
        //Check if user input has 5 characters
        int r = array.length;     //length by # of words: r * use this and add the users new input every time into the array and once the array reaches a total of 5 words GAME OVER, essentially counting the number of guesses
        int l = s1.length();      //length by # of characters: r
        System.out.println(s1.length());
        //counts 1,2,3,4,5 NOT 0,1,2,3,4

        do {

            if (l < 5) {
                System.out.println("Error your input has to few characters. It needs one 5 letter word!");
            } else if (l > 5) {
                System.out.println("Error your input has to many characters. It needs one 5 letter word!");
            } else if (l == 5) {

                //Here is a code that lets the user search a word to see if it's in the given file, change it so
                //t takes a random word from the file each time to be the word the user is trying to guess
                //currently does not work accurately, only recognizes one of the four words, and doesn't end when user hits enter.

                Scanner in = new Scanner(new File("/Users/rozebri/Project/WordleWords"));
                List<String> words = new ArrayList<String>();
                while (in.hasNext()) {
                    String word = in.next();
                    words.add(word);
                }
                Scanner console = new Scanner(System.in);
                while (true) {
                    System.out.print("Word: (Enter to quit)?");
                    String target = console.nextLine(); //change this so instead of asking for user input checks users input with the file given and saying whether everything input was found in file

                    if (target.trim().length() == 0) {
                        break;
                    }
                    int index = Collections.binarySearch(words, target);
                    if (index >= 0) {
                        System.out.println("\"" + target + "\" is word #" + index + " of " + words.size());
                    } else {
                        System.out.println(target + " is not found");
                    }
                }
            }
        } while (r!=6);
    }
}
