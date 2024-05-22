/*Brielle Roze
Semester 1 Projects complete 5/5 current grade B
Project 1: Rock Paper Scissors _/_/23 - 10/6/23 COMPLETED
Project 2: Maze COMPLETED 10/10/23 - 10/11/23
*must start to use lists and classes
Project 3: Typing Speed COMPLETED 10/18/23 - 1/12/24
Project 4: Word-le COMPLETED 11/8/23 - 1/28/24
Project 5: Mastermind (lots of requirements check GS05-03) COMPLETED
Other Project options:
RPG Use page(s) 824 - 827
Adventure Use strings or page(s) 824 - 827

Semester 2 Projects complete 0/4
Project 1: (due 2/29/24) MANCALA
Project 2: (3/29/24) Recursion Goal Sheet(aka GS11) 0/5 (
Project 3: (due 4/29/24) PROJ 4 ALL SHORTEST PATHS
Project 4: (due 5/3/24)Levenshtein (Required) (counts for 2 proj if it is for all the shortest paths)
Sem 1 Other Project options:
Solitaire use 780 - 781
Conways Game of Life
 Notes Application page 827, 857
  Sudoku use page 831. 852

SEM 2 Notes:
Proj 1 Recursion Goal Sheet (R)
    - (aka GS11)
    - (due 2/29/24) (//24-//24)
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 0/7: found notes for 3/7

    - Problem GS10-02 - writeSquares  (BJP Ch 12 Ex 6)
        (pg 764  helps with making squares & handling errors, pg __ helps with sorting squares

    - Problem GS10-04 - Merge Sort (double) (BJP Ch 13 Proj 1)
        (pg
    - starString (GS11-01) (BJP Ch 12 Ex 1) ,
        (pg762, talks about math pow for have ints to the nth power, pg 765  helps with making squares & handling errors,
    - writeNums  (GS11-02)(BJP Ch 12 Ex 2)
        (pg 754/762, first make a regular count down with base for if n is 0, then prints out n then n- 1, then reverse the string/list)
    - writeSequence (GS11-03)(BJP Ch 12 Ex 3)
        (pg
    - sumTo (GS11-04)(BJP Ch 12 Ex 9) ????
        (pg
    - Fibonacci (GS11-05)(BJP Ch 12 Problem 16) (more efficient recursive)

Proj 2 Path Following or MANCALA
    - (due 3/29/24)  (//24-//24)

Proj 3 Levenshtein All Shortest Paths
    - (due 4/29/24) (//24-//24)

Proj 4 Levenshtein (R)(lists,files,recursion)
    - (due 5/3/24) (//24-//24)
    - (GS14-01)(BJP Ch 11 project 1) https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet14.md
    - https://en.wikipedia.org/wiki/Levenshtein_distance

OTHER To-Do:
    -EVALUATION sheet on last project
    -Inquiry Letter (due 2/5/24) SKIPPED
    -Leadership 250 (due 2/8/24) COMPLETE
    -Leadership 250 (due 5/13/24) COMPLETE
    -Oral Presentation - Project (due by 5/30/24)
    -GS10 (due 2/16/24)
    -GS11 (due 3/01/24) *(R) (Proj 2 Recursion Goal Sheet)
    -GS12 (due 3/15/24)
    -GS13 (due 3/29/24)
    -AP Practice (on College Board and other)

Sem 2 Other Project options (proj 1 and 3 options):
-Conways Game of Life (arrays,lists)**
-Notes Application (files) (page 827, 857)
-Sudoku (lists, files, recursion) (use page 831. 852) *
-Solitaire (classes, lists) (use 780 - 781) *
-Maze Generation (lists,files) *
-Path Following(recursion)

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
        System.out.println("Searching for whether a word is in the dictionary/the mentioned file");

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




//FIBONACCI

//        System.out.println("Welcome to Fibonacci Sequence!");
//        System.out.println("Please input what you want to be the first number of the sequence");
//        for (int i = 0; i<=30; i++)
//        {
//            System.out.println(i + (i+1));
//        }
//  Scanner recur = new Scanner(System.in);
//  int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
//System.out.println("Please input what you would like to be the second number of the sequence");
//n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value

//Scanner recur = new Scanner(System.in);
// int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
//int n = 1;
// int n = 3;
//Fibonacci(n);



//
//    public static int Fibonacci(int n)
//    {
//        if (n < 3) {
//            return 1;
//        }
//        else {
//        int calcFibonacci[] = new int [n+1];
//        calcFibonacci[1] = 1;
//        calcFibonacci[1] = 1;
//        return _Fibonacci(n,calcFibonacci);
//        }
//    }
//    public static int _Fibonacci (int n, int Fibonaccis[])
//    {
//        if (Fibonaccis[n] ==0) {
//            Fibonaccis[n] = _Fibonacci(n - 1, Fibonaccis) + _Fibonacci(n - 2, Fibonaccis);
//        }
//        return Fibonaccis[n];
//        }
//
//    }


/*public static void main (String[]args)
    {
        System.out.println("Welcome to Fibonacci Sequence!");
        System.out.println("Please input what you want to be the first number of the sequence");
        Scanner recur = new Scanner(System.in);
        int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
        //System.out.println("Please input what you would like to be the second number of the sequence");
        //n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value

        //Scanner recur = new Scanner(System.in);
       // int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
        //int n = 1;
        Fibonacci(n);
    }

    public static int Fibonacci(int n)
    {
        if (n<3)
        {
            return 1;
        }
        else if (n>0 && n <40)
        {
            //System.out.println(Fibonacci(n-1) + Fibonacci(n-2));
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        return n;
    }

     */

/*
 if (n<0)
        {
            throw new IllegalStateException("negative number" + n);
        }
        else if (n>0 && n <40)
        {
            System.out.print(n + " ");
            Fibonacci(n + n);//close to start but needs to be current number plus the previous number not plus its self

        }
 */



