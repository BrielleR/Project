/*Brielle Roze
starString (GS11-01) (BJP Ch 12 Ex 1) pg 794,
    -"Write a recursive method called starString that accepts an integer as a parameter and prints to the console a
      string of stars (asterisks) that is 2n (i.e.2 to the nth power) long. (BJP Ch 12 Ex 1)"
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 2/7: found notes for 3/7
starts off with user input times it to the nth power outputs runs again subtracts initial input by 1 then put sit to the nth power and outputs next line, until initial input is 0
        (pg 750 lets you out put specific number of 'stars' each time in number place input the letter represent number of stars to the nth power, pg762, talks about math pow for have ints to the nth power, pg 765  helps with making squares & handling errors,
Date:
2/13/24 -
3/6/24 -complete
 */
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj1RecursionGoalSheetGS1101
{
    public static void main (String[]args)
    {
        System.out.println("Welcome to Star String");
        System.out.println("Hello, please input a number and the computer will output a string of stars that is " +
                "the length of your number to the nth power");
        Scanner recur = new Scanner(System.in);
        int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
        StarString(n*2);
        System.out.println(); //extra
    }
    public static void StarString(int n)
    {
        //System.out.println( n);
        //StarString(n = 2*n);
        if (n<0)
        {
            throw new IllegalArgumentException("negative: " + n);
        }
        else if (n > 0)
        {
            System.out.print("*");
            StarString(n-1);
        }

    }
}
