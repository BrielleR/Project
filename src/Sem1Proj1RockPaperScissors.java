/*Brielle Roze
Project 1: Rock, Paper, Scissors
turned in 10/6/23
*/
import java.util.*;
public class Sem1Proj1RockPaperScissors
{
    public static void main(String[]args) {
        //Ask for user input

        System.out.println("Welcome to rock paper scissors! ");
        System.out.println("Please either input 1, 2, or 3. 1 for rock, 2 for paper, and 3 for scissors!");
        System.out.println("After you input your response you will be shown the the computer randomized guess immediately!");
        System.out.println("After getting the computers input and the game results it will be up to you to once again put in either 1, 2, or 3, however if you would like the game to end enter 4 at that time. ");
//        int paper = 0;
        int rockpaperscissors = 0;
  //      do {

            while (rockpaperscissors != 4) {
                //Receive Input and out put it {got Rachel's help
                Scanner rock = new Scanner(System.in);
                rockpaperscissors = Integer.parseInt(rock.nextLine());

                if (rockpaperscissors == 1) {
                    System.out.println("You have chosen: Rock");
                } else if (rockpaperscissors == 2) {
                    System.out.println("You have chosen: Paper");
                } else if (rockpaperscissors == 3) {
                    System.out.println("You have chosen: Scissors");
                } else {
                    System.out.println("Error in computer output");
                }

                //random numbers {used page 307-308
                Random r = new Random();
                int number = r.nextInt(3) + 1; // random number from 1 to 3
                System.out.println();
                //nested if/else {page 235
                if (number == 1) {
                    System.out.println("The computer has chosen: Rock \n");
                } else if (number == 2) {
                    System.out.println("The computer has chosen: Paper \n");
                } else if (number == 3) {
                    System.out.println("The computer has chosen: Scissors \n");
                } else {
                    System.out.println("Error in computer output \n");
                }

                //Comparing user and Computer input using if/else {referenced Chapter 4
                if (rockpaperscissors == 1) {
                    if (number == 1) {
                        System.out.println("Congrats you and the computer have tied!");
                    } else if (number == 2) {
                        System.out.println("Nice try! But the Computer has won this round!");
                    } else if (number == 3) {
                        System.out.println("Congrats you Win!");
                    }
                }
                if (rockpaperscissors == 2) {
                    if (number == 1) {
                        System.out.println("Congrats you Win!");
                    } else if (number == 2) {
                        System.out.println("Congrats you and the computer have tied!");
                    } else if (number == 3) {
                        System.out.println("Nice try! But the Computer has won this round!");
                    }
                }
                if (rockpaperscissors == 3) {
                    if (number == 1) {
                        System.out.println("Nice try! But the Computer has won this round!");
                    } else if (number == 2) {
                        System.out.println("Congrats you Win!");
                    } else if (number == 3) {
                        System.out.println("Congrats you and the computer have tied!");
                    }
                }
            }
 //       }while (rockpaperscissors != 4);
    }
}
