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
{public static void main(String[]args)
{
    System.out.println("Welcome to Playing Mancala!");
    System.out.println("Here's How it works!: " +
            "\nYou and the computer each have your own store and 6 pits." +
            "\n Here are the General Rules: " +
            "\n* Who plays first will be determined by a dice roll." +
            "\n* Play always moves around the board in a counter-clockwise circle (to the right)" +
            "\n* The store on your right belongs to you. That is where you keep the seeds you win." +
            "\n* The six pits near you are your pits." +
            "\n* Only use one hand to pick up and put down seeds." +
            "\n* Once you touch the seeds in a pit, you must move those seeds." +
            "\n* You can only put seeds in your own store, not your opponent’s store. " +
            "\n* When the last seed in your hand lands in your store, take another turn." +
            "\n* When the last seed in your hand lands in one of your own pits, if that pit is not empty you" +
            "get to keep all the seeds in your opponents pit on the opposite side. Put those captured seeds," +
            "as well as the last seed that you just played on your side, into your store.");
    System.out.println("Would you like to play? If so please enter 1, if not please enter any other positive whole integer!");
    Scanner reset = new Scanner(System.in);
    int yes = Integer.parseInt(reset.nextLine());
    if (yes == 1)
    {
        int room = 0;
        if (room == 0) {
            System.out.println("Thank you for choosing to play!");
            //Dice roll to decide who will go first
            Random r = new Random();
            int roll = r.nextInt(6) + 1; // random number from 1–6
            int roll2 = r.nextInt(6) + 1; // random number from 1–6
            System.out.println("Who goes first will be determined by a dice roll! \nThe computer has rolled: " + roll + " \nAnd you have rolled: " + roll2);

            if (roll == roll2)//when they have rolled the same thing
            {
                System.out.println("Time to re-roll the dice!");
//                roll = r.nextInt(6) + 1;
//                roll2 = r.nextInt(6) + 1;
//                System.out.println("Who goes first will be determined by a dice roll! \nThe computer has rolled: " + roll + " \nAnd you have rolled: "+ roll2);
                room = 0;
            } else if (roll > roll2) {
                System.out.println("The computer will go first!");
                room = 1;
            } else if (roll < roll2) {
                System.out.println("You will go first!");
                room = 2;
            }
        }
        if (room == 1)
        {
            System.out.println("The Computers first move is: ");
        }
        if (room == 2)
        {
            System.out.println("What will your first move be?");
        }


    }
}

}

//    public static void main(String[] args)
//        {
//            String[] wordList = {"6684"}; //list of four-digit number, in reality the list would be longer but in this case
//            String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
//            int chances = 0;
//            char[] guess = new char[4];
//            int retry = 0;
//            int num = 1;
//            int BlackPegs = 0;
//            int WhitePegs = 0;
//            System.out.println("\nWelcome to Mastermind, \nIn this game you will get infinite chances to guess a preselected four digit number."); //Intro
//            System.out.println("A black peg signifies that a digit entered was the correct number in the correct position.\nA white peg signifies that a digit entered was the correct number in the wrong location.\nThere fore once you achieve a result of 4 black pegs you have found all the correct number in the correct positions."); //explain game
//            System.out.println("\nIf you would like to play please type 1 if not enter 0)");
//            Scanner reset = new Scanner(System.in);
//            int start = Integer.parseInt(reset.nextLine());
//            if (start == 1) {
//                while (!Arrays.equals(guess, answer.toCharArray())) {
//                    System.out.println("\nPlease enter your guess(must be a four digit number): ");
//                    Scanner game = new Scanner(System.in);
//                    String input = game.next();
//                    if (input.length() != 4) {
//                        System.out.println("\nYour guess was not a four digit number!");
//                        continue;
//                    }
//                    guess = input.toCharArray();
//                    //time to give the user input, check the users guess as well as give feedback through coloring(only two colors) the number to let them know how accurate their guess is not by telling them what each ones colors are but letting them know how many of each color they got.
//                    for (int i = 0; i < 4; i++)
//                    {
//                        if (guess[i] == answer.charAt(i)) {
//                            BlackPegs++;
//                        } else if (answer.contains(Character.toString(guess[i]))) {
//                            WhitePegs++;
//                        }
//                    }
//                    System.out.println();
//                    chances++;
//                    System.out.println("\nYou have taken " + chances + " tries");
//                    System.out.print("\nNumber of White Pegs:" + WhitePegs);
//                    System.out.print("\nNumber of Black Pegs:" + BlackPegs);
//                }
//                if (chances > 0) {
//                    System.out.println("\nCONGRATULATIONS! You have successfully guessed the four digit number: " + answer);
//                    System.out.println("It took you: " + chances + " tries to guess the answer.");
//                }
//                //Lets user choose if they would like to retry
//                System.out.println("\nWould you like to play again? if not enter 1 if so please enter 0.");
//                Scanner choice = new Scanner(System.in);
//                retry = Integer.parseInt(choice.nextLine());
//            } else {
//                retry = 1;
//            }
//        }
//    }
//MANCALA


//public class Sem2Proj3Mancala {
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to playing Mancala!");
//        System.out.println("In this game you will be given 10 rounds to guess the right sequence of 4 colored spheres!");
//        System.out.println("When a you guess the right color in the right spot, you will receive a red point, for each guess that meets this requirement, for each round!");
//        System.out.println("While if you guess the right color but wrong spot, you will receive a white point, for each guess that meets this requirement, for each round");
//        System.out.println("However when your guess is the wrong color in the wrong location, you will receive no point, for each guess that meets this requirement, for each round");
//        System.out.println("Would you like to play if so enter 1, in not enter any other positive integer!");
//        Scanner reset = new Scanner(System.in);
//        int yes = Integer.parseInt(reset.nextLine());
//        if (yes == 1) {
//            //Here create the random 4 digit sequence
//            List<String> listAnswer = new ArrayList<String>();
//            int answer = 0;
//            Random r = new Random();
//            for (int i = 0; i < 4; i++) {
//
//                answer = r.nextInt(8) + 1; // random number from 1–10
//                if (answer == 1) {
//                    System.out.println("red");
//                    String one = "red";
//                    listAnswer.add(one);
//                } else if (answer == 2) {
//                    System.out.println("orange");
//                    String two = "orange";
//                    listAnswer.add(two);
//                } else if (answer == 3) {
//                    System.out.println("yellow");
//                    String three = "yellow";
//                    listAnswer.add(three);
//
//                } else if (answer == 4) {
//                    System.out.println("green");
//                    String four = "green";
//                    listAnswer.add(four);
//                } else if (answer == 5) {
//                    System.out.println("blue");
//                    String five = "blue";
//                    listAnswer.add(five);
//                } else if (answer == 6) {
//                    System.out.println("bronze");
//                    String six = "bronze";
//                    listAnswer.add(six);
//                } else if (answer == 7) {
//                    System.out.println("black");
//                    String seven = "black";
//                    listAnswer.add(seven);
//                } else if (answer == 8) {
//                    System.out.println("white");
//                    String eight = "white";
//                    listAnswer.add(eight);
//                }
//            }
//            System.out.println("Actual Answer: " + listAnswer);
//
//            answer = r.nextInt(8) + 1; // random number from 1–10
//            int rounds = 0;
//            while (rounds <= 10) {
//                rounds++;
//
//                System.out.println("Thank you for choosing to play! You will input a number that corresponds with the color you want to input, and your input will be evaluated!");
//                System.out.println("Here each color and number that correspond! \n red = 1 \n orange = 2 \n yellow = 3 \n green = 4 \n blue = 5 \n bronze = 6 \n black = 7 \n white = 8");
//                System.out.println("Alright time to play! For each round you will input 4 numbers one at a time! \n For example if you want guess blue, red, yellow, black, \n Do not just input 5137 \n Rather you will type 5 then hit enter, then type one 1 and hit enter, then type one 3 and hit enter, then type one 7 and hit enter");
//                System.out.println("Welcome to round: " + rounds + "\n Please input your first guess");
//
//                List<String> list = new ArrayList<String>();
//                for (int i = 0; i < 4; i++) {
//                    Scanner guess = new Scanner(System.in);
//                    int color = Integer.parseInt(reset.nextLine());
//                    if (color == 1) {
//                        System.out.println("red");
//                        String one = "red";
//                        list.add(one);
//                    } else if (color == 2) {
//                        System.out.println("orange");
//                        String two = "orange";
//                        list.add(two);
//                    } else if (color == 3) {
//                        System.out.println("yellow");
//                        String three = "yellow";
//                        list.add(three);
//
//                    } else if (color == 4) {
//                        System.out.println("green");
//                        String four = "green";
//                        list.add(four);
//                    } else if (color == 5) {
//                        System.out.println("blue");
//                        String five = "blue";
//                        list.add(five);
//                    } else if (color == 6) {
//                        System.out.println("bronze");
//                        String six = "bronze";
//                        list.add(six);
//                    } else if (color == 7) {
//                        System.out.println("black");
//                        String seven = "black";
//                        list.add(seven);
//                    } else if (color == 8) {
//                        System.out.println("white");
//                        String eight = "white";
//                        list.add(eight);
//                    } else {
//                        System.out.println("This is not an option"); //let user guess again
//                    }
//
//                }
//                System.out.println("Your guess for round: " + rounds + "\nWas :" + list);
//                //HERE compare users guess to actual answer
//
//                int redPoints = 0;
//                int whitePoints = 0;
//                for (int x = 0; x <= 4; x++) {
//                    listAnswer.get(x);
//                    for (int y = 0; y <= 4; y++) {
//                        list.get(y);
//                        //System.out.println("x:" +x+  "y" + y);
//
//
//                    }
//                }
//
//
//            }
//        } else {
//            System.out.println("Thank you and good bye!");
//        }
//    }
//
//}
//


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



