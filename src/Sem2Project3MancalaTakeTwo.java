/*Brielle Roze
Project 3 Take 2
Mancala, (apparently the first one was actually mastermind... :\but I did do mastermind first semester but that was with numbers... this was numbers/colors (does this make it proj 4 or three...?) also technically the other one was proj 1/2 so... )
 RULES OF MANCALA: (according to https://www.scholastic.com/content/dam/teachers/blogs/alycia-zimmerman/migrated-files/mancala_rules.pdf)
 Objective: To collect as many seeds in your store as possible. The player with the most seeds in
his/her store at the end of the game wins.
Set Up: Place four seeds in each of the six pits on your side of the game board. Your opponent
should do the same. The colors of the seeds don’t matter. (For a shorter game, you can play with
three seeds in each pit.)

Basic Rules:
* Play always moves around the board in a counter-clockwise circle (to the right)
* The store on your right belongs to you. That is where you keep the seeds you win.
* The six pits near you are your pits.
* Only use one hand to pick up and put down seeds.
* Once you touch the seeds in a pit, you must move those seeds.
* Only put seeds in your own store, not your opponent’s store.
Starting the Game:
On a turn, a player picks up all the seeds in one pit and “sows” them to the right, placing one
seed in each of the pits along the way. If you come to your store, then add a seed to your store
and continue. You may end up putting seeds in your opponent’s pits along the way.
Play alternates back and forth, with opponents picking up the seeds in one of their pits and
distributing them one at a time into the pits on the right, beginning in the pit immediately to the
right.
Special Rules:
*When the last seed in your hand lands in your store, take another turn.
*When the last seed in your hand lands in one of your own pits, if that pit had been empty you
get to keep all the seeds in your opponents pit on the opposite side. Put those captured seeds,
as well as the last seed that you just played on your side, into the store.
Ending the Game:
The game is over when one player’s pits are completely empty. The other player takes the seeds
remaining in her pits and puts those seeds in her store. Count up the seeds. Whoever has the most
seeds wins.

Emi L: Make the Computers turn and players turn more spaced apart, in order to more clearly differentiate, maybe even color code, was a little confusing because of how close they were.

Edits: made the game board look nicer?

Gunjan J.:After playing for a bit was easy to understand, however when I reached a point where all my pits were empty the screen did not change to game over. Also, what's supposed to happen if player and computer have same dice roll?

Edits: fixed it so when either computer or players pits reach 0 game ends, and fixed the dice roll so when they roll the same thing dice reroll.

Personal Review:
fails to properly increase computers store? remain 0, but during an infinte loop increases properly?

 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sem2Project3MancalaTakeTwo {
    public static void main(String[] args) {
        // Create a new instance of the MancalaGame class
        MancalaGame game = new MancalaGame();
        // Start the game
        game.playGame();
    }
}

class MancalaGame {
    // lists to represent the pits of the player and the computer
    private final List<Integer> playerPits;
    private final List<Integer> computerPits;
    // variables to represent the stores of the player and the computer
    private int playerStore;
    private int computerStore;
    // Variable to determine whose turn it is
    private boolean playerTurn;

    // Constructor to initialize the game
    public MancalaGame() {
        // Initialize the player's pits with 4 seeds each
        this.playerPits = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            playerPits.add(4);
        }
        // Initialize the computer's pits with 4 seeds each
        this.computerPits = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            computerPits.add(4);
        }
        // Initialize the player's and computer's stores to 0
        this.playerStore = 0;
        this.computerStore = 0;
        // Decide who plays first by rolling a die
        this.playerTurn = rollDice();
    }



    // Method to play the game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mancala! \nHow to play: " +
                "The game is played in turns. Who plays first will be determined by a Dice roll. As seen above." +
                "\nOn each turn, you choose a pit on your side of the board. " +
                "\nYou then take all the seeds from that pit and drop one seed in each consecutive pit, including your store, " +
                "until you run out of seeds. \nIf the last seed lands in your store, you get another turn. " +
                "\nIf the last seed lands in an empty pit on your side, " +
                "you can capture your opponent's seeds across from that pit and put them in your store. " +
                "\nThe game ends when one player has no seeds left in their pits, " +
                "and the player with the most seeds in their store wins.");
        System.out.println("If you would you like to play please enter 1! " +
                "\nIf not please enter any other positive whole integer!");
        int response = scanner.nextInt();
        if (response == 1) {
            while (true) {
                printGameBoard();
                if (isGameOver()) {
                    printGameBoard();
                    System.out.println("Game over! Final score - You: " + playerStore + ", Computer: " + computerStore);
                    break;
                }
                if (playerTurn) {
                    int pitNumber;
                    while (true) {
                        System.out.println("Your turn! Enter the pit number (1-6) to play:");
                        pitNumber = scanner.nextInt();
                        if (pitNumber >= 1 && pitNumber <= 6) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 6.");
                        }
                    }
                    int seeds = playerPits.get(pitNumber - 1);
                    playerPits.set(pitNumber - 1, 0);
                    int currentPit = pitNumber;
                    while (seeds > 0) {
                        currentPit = (currentPit % 6) + 1;
                        playerPits.set(currentPit - 1, playerPits.get(currentPit - 1) + 1);
                        seeds--;
                        if (seeds == 0 && playerPits.get(currentPit - 1) == 1) {
                            int oppositePit = 6 - currentPit;
                            if (computerPits.get(oppositePit) > 0) {
                                playerStore += computerPits.get(oppositePit) + 1; // Increase the current player's store
                                computerPits.set(6 - currentPit, 0);
                                playerPits.set(currentPit - 1, 0);
                            }
                        }
                    }
                    playerTurn = canPlayAgain(pitNumber, playerPits, playerStore);
                } else {
                    System.out.println("It in now the Computer's turn: ");
                    int pitNumber = computerMove(computerPits);
                    int seeds = computerPits.get(pitNumber - 1);
                    computerPits.set(pitNumber - 1, 0);
                    int currentPit = pitNumber;
                    while (seeds > 0) {
                        currentPit = (currentPit % 6) + 1;
                        computerPits.set(currentPit - 1, computerPits.get(currentPit - 1) + 1);
                        seeds--;
                        if (seeds == 0 && computerPits.get(currentPit - 1) == 1) {
                            int oppositePit = 6 - currentPit;
                            if (playerPits.get(oppositePit) > 0) {
                                computerStore += playerPits.get(oppositePit) + 1; // Increase the current player's store
                                playerPits.set(6 - currentPit, 0);
                                computerPits.set(currentPit - 1, 0);
                            }
                        }
                    }
                    playerTurn =!canPlayAgain(pitNumber, computerPits, computerStore);
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
    }
    // method to roll a die
    private boolean rollDice() {
        Random random = new Random();
        int playerRoll = random.nextInt(6) + 1; // user dice
        int computerRoll = random.nextInt(6) + 1; // computer dice
        System.out.println("Dice Rolls: \n You rolled: " + playerRoll + " \n The computer rolled: " + computerRoll);
        if (playerRoll == computerRoll) { // If the rolls are equal, roll again
            rollDice();
        } else {
            // Otherwise, the player with the higher roll goes first
            return playerRoll >= computerRoll;
        }
        return false;
    }

     //method to determine if a player can play again
    private boolean canPlayAgain(int pitNumber, List<Integer> pits, int store) {
        return pitNumber == 7 || store > 0;
    }

    // method to determine the computer's move
    private int computerMove(List<Integer> computerPits) {
        for (int i = 0; i < 6; i++) {
            if (computerPits.get(i) > 0) {
                return i + 1;
            }
        }
        return 1;
    }

    // method to check if the game is over
    private boolean isGameOver() {
        int playerPitsSum = 0;
        int computerPitsSum = 0;
        for (int pit : playerPits) {
            playerPitsSum += pit;
        }
        for (int pit : computerPits) {
            computerPitsSum += pit;
        }
        return playerPitsSum == 0 || computerPitsSum == 0;
    }

    // Method to print the game layout
//    private void printGameBoard() {
//        System.out.println("  Computer Pits: " + computerPits);
//        System.out.println("  Computer Store: " + computerStore);
//        System.out.println("  \n\nYour Pits: " + playerPits);
//        System.out.println("  Your Store: " + playerStore);
//    }
    // Method to print the game board
    public void printGameBoard() {
        System.out.println("                 1 | 2 | 3 | 4 | 5 | 6");
        System.out.println("                 ---+---+---+---+---+---");
        System.out.println("\nYour Pits:       " + playerPits.get(0) + " | " + playerPits.get(1) + " | " + playerPits.get(2) + " | " + playerPits.get(3) + " | " + playerPits.get(4) + " | " + playerPits.get(5));
        System.out.println("                 ---+---+---+---+---+---");
        System.out.println("\nComputers Pits:  " + computerPits.get(5) + " | " + computerPits.get(4) + " | " + computerPits.get(3) + " | " + computerPits.get(2) + " | " + computerPits.get(1) + " | " + computerPits.get(0));
        System.out.println("                 ---+---+---+---+---+---");
        System.out.println("  Your store: " + playerStore + ", Computer's store: " + computerStore);
    }
}
