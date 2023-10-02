//Brielle Roze
import java.util.*;
public class RockPaperScissors
{
    public static void main(String[]args)
    {
        //Ask for user input
        System.out.println("Welcome to rock paper scissors! Please either input rock, paper, or sccissors!");

        //Recieve Input and out put it {got Rachels help
    Scanner rock = new Scanner(System.in);
    String rockpaperscissors = rock.nextLine();


    System.out.println("You have chosen:");
    System.out.println(rockpaperscissors);
        //random numbers {used page 307-308
        System.out.println("The computer has chosen:");
        Random r = new Random();
        int paper = 0;
        //while(paper !=4)
        //{
            int number = r.nextInt(3)+1; // random number from 1- 3
            System.out.println();
            //nested if/else {page 235
            if (number ==1)
            {
                System.out.println("Rock");
            }
            else if (number ==2)
            {
                System.out.println("Paper");
            }
            else if (number == 3)
            {
                System.out.println("Scissors");
            }
            else
            {
                System.out.println("Error in computer output");
            }

        //}
       /*
        Scanner console = new Scanner(System.in);
        Random r = new Random();

        int number=0;
        int result = 1;
        while (result != number)
        {
            result = r.nextInt(3)+1; // random number from 1- 3
        }
        //nested if/else {page 235
        if (number ==1)
        {
            System.out.println("Rock");
        }
        else if (number ==2)
        {
            System.out.println("Paper");
        }
        else if (number == 3)
        {
            System.out.println("Scissors");
        }
        else
        {
            System.out.println("Error in computer output");
        }
        */

    }
}
