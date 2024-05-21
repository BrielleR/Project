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

public class Sem2Proj1RecursionGoalSheetGS1105 {
    private static long fibonacciHelper(int n, long prev1, long prev2) {
        if (n == 0) {
            return prev1;
        } else {
            return fibonacciHelper(n - 1, prev2, prev1 + prev2);
        }
    }

    // Public method to calculate the nth Fibonacci number
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        return fibonacciHelper(n, 0, 1);
    }

    public static void main(String[] args) {
        System.out.println("Please input up to what number of the Fibonacci number sequence you want calculated");
        Scanner recur = new Scanner(System.in);
        int x = Integer.parseInt(recur.nextLine()); //gets user input and also makes it n's value

        //int x = 0;
        for (int n = 0; n <= x; n++) {
            //int n = 9; // Example: Calculate the 10th Fibonacci number
            long result = fibonacci(n);
            System.out.println("Fibonacci(" + n + ") = " + result);

        }
    }
}