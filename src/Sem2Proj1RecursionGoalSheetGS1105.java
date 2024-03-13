/*Brielle Roze
Fibonacci (GS11-05)(BJP Ch 12 Problem 16) (more efficient recursive) pg 794
    - The Fibonacci sequence is a sequence of numbers in which the first two numbers are 1 and each subsequent number
    is the sum of the previous two Fibonacci numbers. The sequence is 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on. Write
    a new version of the method given in the book that is still recursive and has the same header but is more efficient.
     Do this by creating a helper method that accepts additional parameters, such as previous Fibonacci numbers, that
     you can carry through and modify during each recursive call. (BJP Ch 12 Problem 16) Fibonacci another way (more efficiently)
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 0/7: found notes for 3/7
    /pg794
//1114
 */
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj1RecursionGoalSheetGS1105
{
    public static void main (String[]args)
    {
        System.out.println("");

        //Scanner recur = new Scanner(System.in);
       // int n = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value
        int n = 1;
        Fibonacci(n);
    }

    public static void Fibonacci(int n)
    {
        if (n<0)
        {
            throw new IllegalStateException("negative number" + n);
        }
        else if (n>0 && n <40)
        {
            System.out.print(n + " ");
            Fibonacci(n + n);//close to start but needs to be current number plus the previous number not plus its self

        }
    }
}
