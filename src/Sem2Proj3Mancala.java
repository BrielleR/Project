/*Brielle Roze
Mancala (classes & lists)
* may be difficult to do with text
There are 1680 four digit combinations you can make with numbers 1-8!! |:o|
options compare the number vs. compare the strings... comparing the strings in arrays isn't working
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj3Mancala {
    /*
    public static boolean areArraysEqual(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays have different lengths
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Elements at index i don't match
            }
        }

        return true; // All elements match
        }
     */

    public static void main(String[]args)
    {

        System.out.println("Welcome to playing Mancala!");
        System.out.println("In this game you will be given 10 rounds to guess the right sequence of 4 colored spheres!");
        System.out.println("When a you guess the right color in the right spot, you will receive a red point, for each guess that meets this requirement, for each round!");
        System.out.println("While if you guess the right color but wrong spot, you will receive a white point, for each guess that meets this requirement, for each round");
        System.out.println("However when your guess is the wrong color in the wrong location, you will receive no point, for each guess that meets this requirement, for each round");
        System.out.println("Would you like to play if so enter 1, in not enter any other positive integer!");
        Scanner reset = new Scanner(System.in);
        int yes = Integer.parseInt(reset.nextLine());
        if (yes ==1)
        {
            //Here create the random 4 digit sequence
            List<String> listAnswer = new ArrayList<String>();
            int answer =0;
            Random r = new Random();
            for (int i = 0; i<4; i++)
            {

                answer = r.nextInt(8) + 1; // random number from 1–10
                if (answer == 1) {
                    System.out.println("red");
                    String one = "red";
                    listAnswer.add(one);
                }
                else if (answer == 2) {
                    System.out.println("orange");
                    String two = "orange";
                    listAnswer.add(two);
                }
                else if (answer == 3) {
                    System.out.println("yellow");
                    String three = "yellow";
                    listAnswer.add(three);

                }
                else if (answer == 4) {
                    System.out.println("green");
                    String four = "green";
                    listAnswer.add(four);
                }
                else if (answer == 5) {
                    System.out.println("blue");
                    String five = "blue";
                    listAnswer.add(five);
                }
                else if (answer == 6) {
                    System.out.println("bronze");
                    String six = "bronze";
                    listAnswer.add(six);
                }
                else if (answer == 7) {
                    System.out.println("black");
                    String seven = "black";
                    listAnswer.add(seven);
                }
                else if (answer == 8) {
                    System.out.println("white");
                    String eight = "white";
                    listAnswer.add(eight);
                }
            }
            System.out.println("Actual Answer: " + listAnswer);

            answer = r.nextInt(8) + 1; // random number from 1–10
            int rounds = 0;
            while (rounds <=10) {
                rounds ++;

                System.out.println("Thank you for choosing to play! You will input a number that corresponds with the color you want to input, and your input will be evaluated!");
                System.out.println("Here each color and number that correspond! \n red = 1 \n orange = 2 \n yellow = 3 \n green = 4 \n blue = 5 \n bronze = 6 \n black = 7 \n white = 8");
                System.out.println("Alright time to play! For each round you will input 4 numbers one at a time! \n For example if you want guess blue, red, yellow, black, \n Do not just input 5137 \n Rather you will type 5 then hit enter, then type one 1 and hit enter, then type one 3 and hit enter, then type one 7 and hit enter");
                System.out.println("Welcome to round: " + rounds +"\n Please input your first guess");

                List<String> list = new ArrayList<String>();
                for (int i = 0; i<4; i++)
                {
                    Scanner guess = new Scanner(System.in);
                    int color = Integer.parseInt(reset.nextLine());
                    if (color == 1) {
                        System.out.println("red");
                        String one = "red";
                        list.add(one);
                    }
                    else if (color == 2) {
                        System.out.println("orange");
                        String two = "orange";
                        list.add(two);
                    }
                    else if (color == 3) {
                        System.out.println("yellow");
                        String three = "yellow";
                        list.add(three);

                    }
                    else if (color == 4) {
                        System.out.println("green");
                        String four = "green";
                        list.add(four);
                    }
                    else if (color == 5) {
                        System.out.println("blue");
                        String five = "blue";
                        list.add(five);
                    }
                    else if (color == 6) {
                        System.out.println("bronze");
                        String six = "bronze";
                        list.add(six);
                    }
                    else if (color == 7) {
                        System.out.println("black");
                        String seven = "black";
                        list.add(seven);
                    }
                    else if (color == 8) {
                        System.out.println("white");
                        String eight = "white";
                        list.add(eight);
                    }
                    else {
                        System.out.println("This is not an option"); //let user guess again
                    }

                }
                System.out.println("Your guess for round: " + rounds + "\nWas :" + list);
                //HERE compare users guess to actual answer

                int redPoints = 0;
                int whitePoints = 0;

                for(int x = 0; x<=4; x++)
                {
                    listAnswer.get(x);
                    for(int y = 0; y<=4; y++)
                    {
                        list.get(y);
                        //System.out.println("x:" +x+  "y" + y);


                    }
                }


            }
        }
        else
        {
            System.out.println("Thank you and good bye!");
        }
    }



}
