/*Brielle Roze
Proj 5
1/29/24 - 1/30/24
Notes will not be printed (cause there like 62 lines) but are available to be seen on the computer if needed to be seen
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Mastermind {

    public static void main(String[] args) {
        String[] wordList = {"6684"}; //list of four-digit number, in reality the list would be longer but in this case
        String answer = wordList[new Random().nextInt(wordList.length)]; //picks random word from the list
        int chances = 0;
        char[] guess;
        System.out.println("\nWelcome to Mastermind, \nIn this game you will get infinite chances to guess a preselected four digit number."); //Intro
        System.out.println("A black peg signifies that a digit entered was the correct number in the correct position.\nA white peg signifies that a digit entered was the correct number in the wrong location.\nThere fore once you achieve a result of 4 black pegs you have found all the correct number in the correct positions."); //explain game
        System.out.println("\nIf you would like to play please type 1 if not enter any other key to exit!");
        Scanner reset = new Scanner(System.in);

        int continueGame = Integer.parseInt(reset.nextLine());
        while (continueGame == 1) {
            int BlackPegs = 0;
            int WhitePegs = 0;

            System.out.println("\nPlease enter your guess(must be a four digit number): ");
            Scanner game = new Scanner(System.in);
            String input = game.next();
            if (input.length() != 4) {
                System.out.println("\nYour guess was not a four digit number!");
                continue;
            }
            guess = input.toCharArray();

            if (!Arrays.equals(guess, answer.toCharArray()))
            {
                for (int i = 0; i < 4; i++)
                {
                    if (guess[i] == answer.charAt(i)) {
                        BlackPegs++;
                    } else if (answer.contains(Character.toString(guess[i]))) //change the logic so that when there is 6666 you get two black and 0 white, so it counts what is already correct, should it search for the correct answer in a file rather than generate its own with its own logic...?
                    {
                        WhitePegs++;
                    }
                }
                System.out.println();
                chances++;
                System.out.println("\nYou have taken " + chances + " tries");
                System.out.print("\nNumber of Black Pegs:" + BlackPegs);
                System.out.print("\nNumber of White Pegs:" + WhitePegs);

            }
            if (BlackPegs == 4)
            {
                System.out.println("\nCONGRATULATIONS! You have successfully guessed the four-digit number: " + answer);
                System.out.println("It took you: " + chances + " tries to guess the answer.");
            }

            //Lets user choose if they would like to retry
            System.out.println("\nIf you would you like to play again enter 1. Enter any other key to exit!");
            Scanner choice = new Scanner(System.in);
            continueGame = Integer.parseInt(choice.nextLine());
        }
    }
}