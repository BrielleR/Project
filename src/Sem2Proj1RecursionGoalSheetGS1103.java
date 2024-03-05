/*Brielle Roze
writeSequence (GS11-03)(BJP Ch 12 Ex 3) pg795
    - Write a recursive method called writeSequence that accepts an integer n as a parameter and prints to the console
     a symmetric sequence of n numbers composed of descending integers that ends in 1, followed by a sequence of
     ascending integers that begins with 1. When n is odd, the sequence has a single 1 in the middle, but when n is
     even, it has two 1s in the middle. Throw an IllegalArgumentException if it is passed a value less than 1. (BJP Ch 12 Ex 3)
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 1/7: found notes for 3/7
        (pg
        //reference gs11-02 but add System.out.print(n+","); before int statement, fix how it also outputs zero in
       // the middle and get rid of commas and ln to inner output statement, and throw illegal argument statement for less than 0
       and figure out how to implement it so that when n is odd there are to 1's in the middle and when n os even there is still only one 1
 */
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj1RecursionGoalSheetGS1103 {
   public static void main (String[]args)
   {
       System.out.println("Please input a integer, the computer will then print your output and count down numbers" +
               " in descending order starting with your output ending with 1, it will then count up form n in " +
               "ascending order until it reaches your input ");
       int n;
       Scanner recur = new Scanner(System.in);
       n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
       RecursionGS(n); //call it
       System.out.println();//extra just so that after list is out put there's a gap between output and 'disconnect..."
   }
    //String[] wordList = {
    public static ArrayList<Integer> RecursionGS(int n) {

        ArrayList<Integer> list = new ArrayList<Integer>(); //list with all the versions/variables of n at the end reverse list order and output it
        System.out.println(n);
        if (n > 1) //when the user input is greater than 1 do the following:
        {
            RecursionGS(n - 1); // subtract - from n
            list.add(n); //add the new n
            System.out.println(n); //output new n
        }
        return list; //returns int list
    }


}
