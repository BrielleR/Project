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
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj1RecursionGoalSheetGS1002
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Write Squares!");
        System.out.println("Please input a whole integer it and the number that come before it will then be then squared \n Even integers will be on one side in descending order and odd on the other side in descending order.");
        Scanner input = new Scanner(System.in);
        //make loop for input number to nth power, and runs through values of input, and checks for odd or event then sorts...

    }
}
