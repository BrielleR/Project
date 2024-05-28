/*Brielle Roze
Mancala (classes & lists)
* may be difficult to do with text
There are 1680 four digit combinations you can make with numbers 1-8!! |:o|
options compare the number vs. compare the strings... comparing the strings in arrays isn't working
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Random;
public class Sem2Proj3Mancala {
    public static void main(String[] args) {
        System.out.println("Welcome to playing Mancala!");
        System.out.println("In this game you will be given 10 rounds to guess the right sequence of 4 colored spheres!");
        System.out.println("When a you guess the right color in the right spot, you will receive a red point, for each guess that meets this requirement, for each round!");
        System.out.println("While if you guess the right color but wrong spot, you will receive a white point, for each guess that meets this requirement, for each round");
        System.out.println("However when your guess is the wrong color in the wrong location, you will receive no point, for each guess that meets this requirement, for each round");
        System.out.println("Would you like to play if so enter 1, in not enter any other positive integer!");
        Scanner reset = new Scanner(System.in);
        int yes = Integer.parseInt(reset.nextLine());
        if (yes == 1) {
            // Here create the random 4 digit sequence
            List<String> listAnswer = new ArrayList<String>();
            Random r = new Random();
            for (int i = 0; i < 4; i++) {
                int answer = r.nextInt(8) + 1; // random number from 1–10
                switch (answer) {
                    case 1:
                        listAnswer.add("red");
                        break;
                    case 2:
                        listAnswer.add("orange");
                        break;
                    case 3:
                        listAnswer.add("yellow");
                        break;
                    case 4:
                        listAnswer.add("green");
                        break;
                    case 5:
                        listAnswer.add("blue");
                        break;
                    case 6:
                        listAnswer.add("bronze");
                        break;
                    case 7:
                        listAnswer.add("black");
                        break;
                    case 8:
                        listAnswer.add("white");
                        break;
                }
            }
            //Actual Answer:  listAnswer
            System.out.println("Answer: " + listAnswer);
            int rounds = 1;
            while (rounds <= 10) {
                System.out.println("Thank you for choosing to play! You will input a number that corresponds with the color you want to input, and your input will be evaluated!");
                System.out.println("Here each color and number that correspond! \n red = 1 \n orange = 2 \n yellow = 3 \n green = 4 \n blue = 5 \n bronze = 6 \n black = 7 \n white = 8");
                System.out.println("Alright time to play! For each round you will input 4 numbers one at a time! \n For example if you want guess blue, red, yellow, black, \n Do not just input 5137 \n Rather you will type 5 then hit enter, then type one 1 and hit enter, then type one 3 and hit enter, then type one 7 and hit enter");
                System.out.println("Welcome to round: " + rounds + "\n Please input your first guess");
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < 4; ) {
                    Scanner guess = new Scanner(System.in);
                    if (guess.hasNextInt()) {
                        int color = guess.nextInt();
                        if (color >= 1 && color <= 8) {
                            switch (color) {
                                case 1:
                                    list.add("red");
                                    break;
                                case 2:
                                    list.add("orange");
                                    break;
                                case 3:
                                    list.add("yellow");
                                    break;
                                case 4:
                                    list.add("green");
                                    break;
                                case 5:
                                    list.add("blue");
                                    break;
                                case 6:
                                    list.add("bronze");
                                    break;
                                case 7:
                                    list.add("black");
                                    break;
                                case 8:
                                    list.add("white");
                                    break;
                            }
                            i++;
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 8.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        guess.next();
                    }
                }
                int redPoints = 0;
                int whitePoints = 0;
                for (int i = 0; i < 4; i++) {
                    if (list.get(i).equals(listAnswer.get(i))) {
                        redPoints++;
                    } else if (listAnswer.contains(list.get(i))) {
                        whitePoints++;
                    }
                }
                    System.out.println("You received " + redPoints + " red points for guessing the correct color in the correct spot(s).");
                    System.out.println("You received " + whitePoints + " white points for guessing the correct color in the wrong spot(s).");
                System.out.println("Your total red points: " + redPoints);
                System.out.println("Your total white points: " + whitePoints);
                if (redPoints == 4) {
                    System.out.println("Game over!");
                    System.out.println("Congratulations! You guessed the correct sequence");
                    System.out.println("The correct sequence was: " + listAnswer.toString());
                    System.out.println("Thank you for playing!");
                    break;
                }
                rounds++;
                System.out.println("Would you like to play another round? Enter 1 if yes, and any other positive integer if no");
                Scanner roundChoice = new Scanner(System.in);
                int round = Integer.parseInt(roundChoice.nextLine());
                if (round != 1) {
                    break;
                }
            }
        }
    }
}