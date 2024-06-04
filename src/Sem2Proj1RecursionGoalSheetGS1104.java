/*Brielle Roze
sumTo (GS11-04)(BJP Ch 12 Ex 9) pg796
 -Write a recursive method called sumTo that accepts an integer parameter n and returns a real number representing
     the sum of the first n reciprocals. In other words, sumTo(n) returns (1 + ½ + 1/3 + ¼ + … + 1/n). For example,
     sumTo(2) should return 1.5. The method should return 0.0 if it is passed the value 0 and throw an
     IllegalArgumentException if it passed a value less than 0. (BJP Ch 12 Ex 9)
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 0/7: found notes for 3/7
        (pg 764 throw new IllegalArgumentException,
 */
import java.util.Scanner;
public class Sem2Proj1RecursionGoalSheetGS1104 {
    public static double sumTo(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be equal to or greater than 0");
        }
        if (n == 0) {
            return 0;
        } else {
            return (double) 1 / n + sumTo(n - 1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to SumTo! \n Where you will input an integer and the computer will return a real number representing the sum of the first n reciprocals");
        System.out.println("Would you like to play? if so input 1 otherwise input any other integer");
        Scanner play = new Scanner(System.in);
        int i = Integer.parseInt(play.nextLine());
        while (i==1)
        {
            System.out.println("Please input an integer and the computer will return a real number representing the sum of the first n reciprocals");
            Scanner reset = new Scanner(System.in);
            int n = Integer.parseInt(reset.nextLine());
            double result = sumTo(n);
            System.out.println("sumTo(" + n + ") = " + result);
            System.out.println("Would you like to do it again? if so input 1 otherwise input any other integer");
            i = Integer.parseInt(play.nextLine());
        }
    }
}



