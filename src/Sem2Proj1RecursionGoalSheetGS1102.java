/*Brielle Roze
writeNums  (GS11-02)(BJP Ch 12 Ex 2) pg 794
    - "Write a recursive method called writeNums that takes an integer n as a parameter and prints to the console
    the first n integers starting with 1 in sequential order, separated by commas. (BJP Ch 12 Ex 2)"pg 794
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - CH12:748     Complete so far 0/7: found notes for 3/7


        (pg 754/762-765, first make a regular count down with base for if n is 0, then prints out n then n- 1, then reverse the string/list, 764 about gcd and pos and neg)


 */
import java.util.*;

public class Sem2Proj1RecursionGoalSheetGS1102 {
    public static void main(String[] args) {
        System.out.println("Welcome to GS11-02");//intro and ask user to input a number greater than 0

        Scanner recur = new Scanner(System.in);
        int n;
        //System.out.println(n); //make it so n = what the user inputs


    }

    //String[] wordList = {
    public static ArrayList<Integer> RecursionGS(int n)
    {

        ArrayList<Integer> list = new ArrayList<Integer>(); //list with all the versions/variables of n at the end reverse list order and output it
        //int[] intList = {n, };
        System.out.println(n); //outputs user input/original n
        list.add(n); //add user input to list
        if (n >= 0) //when the user input is greater than or equal to 0 do the following:
        {
            list.add(n);//do the wanted from the GS
            RecursionGS(n - 1); // subtract - from n
            list.add(n); //add the new n
            System.out.println(n); //output new n

        }
        return (list); //may be unnecessary
    }

}

