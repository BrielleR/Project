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
       and figure out how to implement it so that when n is odd there are two 1's in the middle and when n os even there is still only one 1
 if (n1 % 2 != 0) {
Date:
Notes:
 */
import java.util.Scanner;
public class Sem2Proj1RecursionGoalSheetGS1103 {
   public static void main (String[]args)
   {
//       System.out.println("Please input a positive integer. \n The computer will then print your output and count down numbers\n" +
//               " In descending order starting with your output ending with 1. \n It will then count up form n in " +
//               "ascending order until it reaches your input ");
//       Scanner recur = new Scanner(System.in);
//       int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
       //int n = 1;
       for (int n = 0; n<=10; n++) {
           if (n % 2 == 0) //call if n is even
           {
               writeSequence1(n);
           } else if (n % 2 != 0) //call if n is odd
           {
               writeSequence2(n);
           }
           System.out.println();//extra just so that after list is out put there's a gap between output and 'disconnect..."
       }

   }

public static void writeSequence1(int n)
{
    if (n<0)
    {
        throw new IllegalStateException("negative number" + n);
    }
    else if (n>0) //even numbers //n%2 == 0 &&
    {
            System.out.print(n + " ");
            writeSequence1(n - 1);
            System.out.print(n + " ");
    }
}
public static void writeSequence2(int n)
    {
        if (n<0)
        {
            throw new IllegalStateException("negative number" + n);
        }
          else if (n>0) //odd numbers //n%2 != 0 &&
    {
        System.out.print(n + " ");
        writeSequence2(n - 1);
        System.out.print(n + " ");
    }
    }
}