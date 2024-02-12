/*Brielle Roze
Project 4
11/8/23 - 1/28/24 (only took that long because I was working on other proj(s) at the same time)
NOTES:
(Same as previous Wordle Proj(s) except this one has a different approach)
Book & etc. notes:
pg 778
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
Wordle 1
Progress Notes:
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
    Date:11/28/23
Notes:Fixed it so the file reading part ends when you click enter, unnecessary but at least it works now, fixed it so
if user input characters less than or greater than 5 then it out put one time what their error was no longer infinitely loops
    Date: 12/5/23
Notes: MAde another word-le assignment, this ones fine but it's starting to get messy and not sure how to get some parts
of the code to do what it needs with the other code so going to start new and reference this as more of a notes on structure page.
Wordle 2
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
Wordle 3 Progress Notes
Date: 1/27/24
Notes: Started organizing notes from what worked and what didn't as well as what to look for in the book
Date: 1/28/24
Notes: Put everything together, everything runs well random five-letter word as answer, takes user input and checks
for similarity with it and actual word gives back green, yellow, grey letters, and if user inputs less than
five-letter word they must try to re-enter their word, keep track of real attempts, at the end whether they run out
of tries ro are successful are given a chance to ty again.
ISSUES: user can input any five letter and game will count it as a word :-\, meaning they just like before can just
input aeiou and since theirs no spell check it counts and user get results based on aeiou, additionally well
actually no one would do this but i tried it and the user can input the same word as a guess multiple times
EDIT: okay so just played real WORDLE apparently you can re-enter the same word multiple times to but still that
seems like a waste so could find a way to not do that AND well I dunno if the actual one has spell check
specifically either, when you enter aeiou for example instead of saying not a word says "not in word list" so...
it cross checks user input with list of all the five-letter words it knows would implement that but my list only
has 12 words so user would only be able to ever enter one of the 12 when playing the game unless i had a huge list
with every known five-letter word but that would be easier with reading files with in Wordle One... well anyway
not doing that :-} besides just because the game is easy doesn't mean its not fun, spell check can be 'difficult'
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem1Proj4WordleThree {
    public static void main(String[] args) {
        String[] wordList = {"mends", "ratio", "lucky", "later", "guess", "build", "debug", "adieu", "found", "paper", "bloat", "watch"}; //list of five-letter words
        String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
        int chances = 6; //player has 6 chances to guess the word
        char[] guess = new char[5];
        //int retry;
        int retry = 0;
        int start;
        int num = 1;
            System.out.println("Welcome to Wordle! \nIn this game you will get six chances to guess a preselected five-letter word.");
            System.out.println("The rules are as follows: \nEach guess must be a valid five-letter word.\nThe color of a letter will change to show you how close your guess was.\n -If the letter is green, the letter is in the word, and it is in the correct spot.\n -If the letter is yellow, the letter is in the word, but it is not in the correct spot. \n -If the letter is blue, the letter is not in the word.");
            //Rules sourced from 'The New York Times' :https://www.nytimes.com/2023/08/01/crosswords/how-to-talk-about-wordle.html
            System.out.println("\nIf you would like to play please type 0 if not enter 1)");
            Scanner reset = new Scanner(System.in);
            start = Integer.parseInt(reset.nextLine());
            if (start == 0)
            {
                while (chances > 0 && !Arrays.equals(guess, answer.toCharArray())) {
                    System.out.println("\nPlease enter your guess(must be a five-letter word): ");
                    Scanner game = new Scanner(System.in);
                    String input = game.next();
                    if (input.length() != 5) {
                        System.out.println("\nYour guess was not a five letter word!");
                        continue;
                    }
                    guess = input.toCharArray();
                    //time to give the user input, check the users guess as well as give feedback through coloring the letters to let them know how accurate their guess is
                    for (int i = 0; i < 5; i++) {
                        if (guess[i] == answer.charAt(i)) {
                            System.out.print("\033[1;32m" + guess[i] + "\033[0m"); //changes correct letter/place Green
                        } else if (answer.contains(Character.toString(guess[i]))) {
                            System.out.print("\033[1;33m" + guess[i] + "\033[0m"); //changes correct letter wrong place Yellow
                        } else {
                            System.out.print("\033[1;34m" + guess[i] + "\033[0m"); //changes wrong letter wrong place Blue
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