
/*Brielle Roze
Semester 1 Projects complete 4/5 current grade C-
Project 1: Rock Paper Scissors _/_/23 - 10/6/23
Project 2: Maze COMPLETED 10/10/23 - 10/11/23
*must start to use lists and classes
Project 3: Typing Speed COMPLETED 10/18/23 - 1/12/24
Project 4: Word-le COMPLETED 11/8/23 - 1/28/24
Project 5: Mastermind (lots of requirements check GS05-03)
Other Project options:
RPG Use page(s) 824 - 827
Adventure Use strings or page(s) 824 - 827

Semester 2 Projects complete 0/5
Project 1: Notes Application page 827, 857
Project 2: Sudoku use page 831. 852
Project 3:Levenshtein (Required)
Project 4: Levenshtein the shortest path
Project 5: Conways Game of Life
Other Project options:
Solitaire use 780 - 781
*/
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Notes
{
    public static void main(String[] args)
        {
            String[] wordList = {"6684"}; //list of four-digit number, in reality the list would be longer but in this case
            String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
            int chances = 0;
            char[] guess = new char[4];
            int retry = 0;
            int num = 1;
            int BlackPegs = 0;
            int WhitePegs = 0;
            System.out.println("\nWelcome to Mastermind, \nIn this game you will get infinite chances to guess a preselected four digit number."); //Intro
            System.out.println("A black peg signifies that a digit entered was the correct number in the correct position.\nA white peg signifies that a digit entered was the correct number in the wrong location.\nThere fore once you achieve a result of 4 black pegs you have found all the correct number in the correct positions."); //explain game
            System.out.println("\nIf you would like to play please type 1 if not enter 0)");
            Scanner reset = new Scanner(System.in);
            int start = Integer.parseInt(reset.nextLine());
            if (start == 1) {
                while (!Arrays.equals(guess, answer.toCharArray())) {
                    System.out.println("\nPlease enter your guess(must be a four digit number): ");
                    Scanner game = new Scanner(System.in);
                    String input = game.next();
                    if (input.length() != 4) {
                        System.out.println("\nYour guess was not a four digit number!");
                        continue;
                    }
                    guess = input.toCharArray();
                    //time to give the user input, check the users guess as well as give feedback through coloring(only two colors) the number to let them know how accurate their guess is not by telling them what each ones colors are but letting them know how many of each color they got.
                    for (int i = 0; i < 4; i++)
                    {
                        if (guess[i] == answer.charAt(i)) {
                            BlackPegs++;
                        } else if (answer.contains(Character.toString(guess[i]))) {
                            WhitePegs++;
                        }
                    }
                    System.out.println();
                    chances++;
                    System.out.println("\nYou have taken " + chances + " tries");
                    System.out.print("\nNumber of White Pegs:" + WhitePegs);
                    System.out.print("\nNumber of Black Pegs:" + BlackPegs);
                }
                if (chances > 0) {
                    System.out.println("\nCONGRATULATIONS! You have successfully guessed the four digit number: " + answer);
                    System.out.println("It took you: " + chances + " tries to guess the answer.");
                }
                //Lets user choose if they would like to retry
                System.out.println("\nWould you like to play again? if not enter 1 if so please enter 0.");
                Scanner choice = new Scanner(System.in);
                retry = Integer.parseInt(choice.nextLine());
            } else {
                retry = 1;
            }
        }
    }

    /*
    public static void main (String[] args) throws FileNotFoundException
    {

        /*
        //Compares users input to what they should have input, other option for finding accuracy of TST
        String s = "blah blah blah"; //what you want the user to input
        System.out.println("PLease input the following:");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        String {} s,s1;
        if (s[0].equals(s1[0])
        {
            System.out.println("Congrats you have perfect accuracy");
        }

        else
        {
            System.out.println("Your accuracy was not perfect");
        }

         */
/*
        //List<Integer>
        //pg 778 word work for Typing speed test if I make existing file that is a dictionary, to have a spell check for TST
        System.out.println("Searching for whether or not a word is in the dictionary/the mentioned file");

        Scanner in = new Scanner(new File("/Users/rozebri/Project/words.txt"));
        List<String> words = new ArrayList<String>();
        while (in.hasNext())
        {
            String word = in.next();
            words.add(word);
        }

        Scanner console = new Scanner(System.in);
        while(true)
        {
            System.out.print("Word: (Enter to quit)?");
            String target = console.nextLine();
            if (target.trim().length() == 0)
            {
                break;
            }
            int index = Collections.binarySearch(words, target);
            if (index >= 0)
            {
                System.out.println("\"" + target + "\" is word #" + index + " of " + words.size());
            }
            else
            {
                System.out.println(target + " is not found");
            }
        }




*/


        /* Counts first word/chars of a string pg 159 could help with Typing speed tester
      for (int i = 0; i< word.length(); i++)
        {
            System.out.println(i + ": " + word.charAt(i));
        }
     */
        /* Stuff from typing speed tester
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        System.out.println("Length of input : " + s1.length());
        String s2 = s1;
        for (int i=0; i<s1.length(); i++ )
        {
            System.out.println(i +": " + s1.charAt(i));
        }
        //Scanner input = new Scanner(new File("speed.txt"));
        //396
        //String tester = input.nextLine(); what was this for?
        //pg 397
       // long startTime = System.currentTimeMillis();
        //int count = 0;
        //String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
        //count++;
        */
       /*
       while (input.hasNext()) //380 //384 //392 loop that never stops
        {
            String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
            count++;
        }
        //String extra = input.next(); what was this for?
        System.out.println("total words " + count );


    }
}
*/


    //Could use to have graphics for Adventure, RPG, and for notes application
    /*public static void main (String[]args)
    {

        //reference: pg 191
      DrawingPanel panel = new DrawingPanel(500,500);
        Graphics g = panel.getGraphics();
        //g.drawLine(25, 75,175,25);

        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Blank");
    }*/
//1/12/14 extra notes from TST:


//cross-checking input with dictionary
//System.out.println("Searching for whether a word is in the dictionary/the mentioned file or not");
//Scanner in = new Scanner(new File("C:\\Users\\rozebri\\IdeaProjects\\Project\\words.txt"));
// List<String> words = new ArrayList<String>();

//Change while, to be while the array is less than zero break start at the last word in the array and work its way
// backwards till there are no more words to check OR till the program reaches the amount of words in the list
// and once the last word is checked in the dictionary end loop, so maybe change the while loop to a for loop
// because that will let us look into each word individually look into pg 443
//also maybe make an int accuracy = r; and then everytime a word is not found in the dictionary subtract 1
// from accuracy and once the for loop is broken out put accuracy out of r (accuracy + "/" + r);

//450-451 if we give the user what o input and  have to check how accurate it is

//94, runs list backwards so in this case starting at r (the number of words in the array and worked backwards till 1
//for (int i=r; i>=1; i--)
//{
//    System.out.println(i + " ");
// }

        /*
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

         */


