/*Brielle Roze
Problem GS10-04 - Merge Sort (double) (BJP Ch 13 Proj 1)pg 846
    - Write a program that reads a series of input lines and sorts them into alphabetical order, ignoring the case of
    words. The program should use the merge sort algorithm so that it efficiently sorts even a large file. (BJP Ch 13 Proj 1)
    - (Chapter 12)(info: 744-789 prob: 790-799 online v)
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet10.md
    - https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/GoalSheet11.md
    - file:///C:/Users/rozebri/OneDrive%20-%20Riverview%20School%20District/10th%20Grade/APCS/buildingjavaprograms.pdf
    - CH12:748     Complete so far 0/7: found notes for 3/7
    - mergeSort with numbers 839

        (pg 809
        // sort Strings using case-insensitive Comparator
String[] strings = {"Foxtrot", "alpha", "echo", "golf",
"bravo", "hotel", "Charlie", "DELTA"};
Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
System.out.println(Arrays.toString(strings));
//results alpha, bravo, Charlie, ... and so on

//Scanner input = new Scanner(System.in);
Date:3/6/24
Notes:Make it so user creates the list of words, then sort the list alphabetically
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Sem2Proj1RecursionGoalSheetGS1004
{
    public static void main(String[]args)
    {
        System.out.println("Welcome to sorting words alphabetically!");
        System.out.println("Where the computer will be reading a series of words input by the user and sort them into alphabetical " +
                "order, regardless of case of words.");
         System.out.println("please input a word you would like added to the list");
        ArrayList<String> list = new ArrayList<String>(); //list of words with different cases and in random order
        Scanner input = new Scanner(System.in);
         String one = input.nextLine();
        list.add(one);
        //System.out.println(list);
        System.out.println("Please add another word to the list");
        String two = input.nextLine();
        list.add(two);
        int start = 0;
        System.out.println("Would you like to add more words to the list to be sorted? \n If so please input 0, if not please enter any other number!");
        Scanner game = new Scanner(System.in);
        start = Integer.parseInt(game.nextLine());
        if (start == 0)
        {
            String three = input.nextLine();
            list.add(three);
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Here is your list of words after being sorted alphabetically!" + list);
        }
        else
        {
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Here is your alphabetically sorted list of input words! : " + list);
        }


        //Arrays.sort(list, String.CASE_INSENSITIVE_ORDER); //sorts string ignores cases
        //System.out.println(Arrays.toString(new ArrayList[]{list}));

    }

}

 /*

     */