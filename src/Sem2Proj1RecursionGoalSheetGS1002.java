/*Brielle Roze
Problem GS10-02 - writeSquares  (BJP Ch 12 Ex 6)
    - "Write a recursive method called writeSquares that accepts an integer parameter n and prints the first n squares
    separated by commas, with the odd squares in descending order followed by the even squares in ascending order.
    For example, writeSquares(8); prints the following output:49, 25, 9, 1, 4, 16, 36, 64 (BJP Ch 12 Ex 6)"
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 0/7:

public static int pow(int x, int y) {
if (y < 0) {
throw new IllegalArgumentException("negative exponent: " + y);
} else if (y == 0) {
// base case with y == 0
return 1;
} else if (y % 2 == 0) {
// recursive case with y > 0, y even
return pow(x * x, y / 2);
} else {
// recursive case with y > 0, y odd
return x * pow(x, y – 1);
}
}
        (pg 764  helps with making squares & handling errors, pg 94/148/203/273/336 helps with identifying odd or even,pg __ helps with sorting squares
-837, split array into two halves and sort each then merge back together
Date:2/13/24
Notes:First of 7 parts for Proj 1, due in 16 days, first need to make it so takes user input and squares it, then sorts it the greatest even to the least even then greatest odd to the least even,
Date:3/6/34
Notes: Need to figure out how to do to the nth power correctly then sort the list by pos and neg
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
 */
import java.util.Scanner;

public class Sem2Proj1RecursionGoalSheetGS1002 {
    public static void main(String[] args) {
        System.out.println("Welcome to Write Squares!");
        System.out.println("Please input a whole integer it and the number that come before it will then be then " +
                "squared \n Even integers will be on one side in descending order and odd on the other side in " +
                "descending order.");
        Scanner recur = new Scanner(System.in);
        int n = Integer.parseInt(recur.nextLine()); // gets user input and also makes it n's value
        WriteSquares1(n); // call it
    }

    public static void WriteSquares1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative input: " + n);
        }
        if (n == 0) {
            return;
        }
        if (n % 2 == 0) {
            WriteSquares1(n - 1); // print the even squares in descending order first
            System.out.print(n * n + ", ");
        } else {
            System.out.print(n * n + ", ");
            WriteSquares1(n - 1); // print the odd squares in ascending order next
        }
    }
}


/*
if (n < 0)
        {
            throw new IllegalArgumentException("negative input: " + n); //if input is less than 0 aka neg then this throws an illegal argument exception
        }
        else if (n > 0) //when the user input is greater than 1 do the following:
        {
            WriteSquares(n - 1); // subtract - from n
            //WriteSquares(n^n);
            // list.add(n); //add the new n
            System.out.println(n^n); //output new n
            /*
            if (n % 2 == 0) {

                WriteSquares(n - 1); // subtract - from n
                WriteSquares(n*n);
               // list.add(n); //add the new n
                System.out.println(n); //output new n
            } else {
                WriteSquares(n - 1); // subtract - from n
                WriteSquares(n*n);
               // list.add(n); //add the new n
                System.out.println(n); //output new n
            }
}
             */



/*
    public static void main(String[] args) {
        System.out.println("Welcome to Write Squares!");
        System.out.println("Please input a whole integer it and the number that come before it will then be then " +
                "squared \n Even integers will be on one side in descending order and odd on the other side in " +
                "descending order.");
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
        if (n > 0) //when the user input is greater than 1 do the following:
        {
            list.add(n^n);
           RecursionGS(n - 1); // subtract - from n
            list.add(n); //add the new n
            System.out.println(n+","); //output new n
        }
        return list; //returns int list
    }


}

 */

