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
Notes:Check for if users input has 5 characters, pick a word randomly from file, then check if any of the characters
from the user input are the same as the random 5-letter word selected from the file then tell user if any match and
which letters match as well as if there in the right place.
*/

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class Wordle
{
    public static void main(String[]args)
    {
System.out.println("Welcome to Word-le! Please input a 5 letter word:");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        //Here is a code that lets the user search a word to see if it's in the given file, change it so t takes a random word from the file each time to be the word the user is trying to guess
        Scanner in = new Scanner(new File("/Users/rozebri/Project/words.txt"));
        while (in.hasNext())
        {
            String word = in.next();
            words.add(word);
        }
        Scanner console = new Scanner(System.in);
        while(true)
        {
            System.out.print("Word: (Enter to quit)?");
            String target = console.nextLine(); //change this so instead of asking for user input checks users input with the file given and saying whether everything input was found in file

            if (target.trim().length() == 0)
            { break;}
            int index = Collections.binarySearch(words, target);
            if (index >= 0)
            { System.out.println("\"" + target + "\" is word #" + index + " of " + words.size());}
            else
            { System.out.println(target + " is not found");}
        }
    }

}
