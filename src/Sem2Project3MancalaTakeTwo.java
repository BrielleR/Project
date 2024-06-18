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

 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sem2Project3MancalaTakeTwo {
    public static void main(String[] args) {
        MancalaGame game = new MancalaGame();
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
        this.playerPits = new ArrayList<>();
        this.computerPits = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            playerPits.add(4);
            computerPits.add(4);
        }
        this.playerStore = 0;
        this.computerStore = 0;
        // decide who plays first by rolling a die
        this.playerTurn = rollDice();
    }

    // method to roll a die
    private boolean rollDice() {
        Random random = new Random();
        int playerRoll = random.nextInt(6) + 1; //user dice
        int computerRoll = random.nextInt(6) + 1; //computer dice
        System.out.println("Dice Rolls: \n You rolled: " + playerRoll + " \n The computer rolled: " + computerRoll);
        return playerRoll >= computerRoll;
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
                "The game ends when one player has no seeds left in their pits, " +
                "and the player with the most seeds in their store wins.");
        System.out.println("If you would you like to play please enter 1! " +
                "\nIf not please enter any other positive whole integer!");
        int response = scanner.nextInt();
        if (response == 1) {
            while (true) {
                printGameBoard();
                if (playerTurn) {
                    int pitNumber;
                    while (true) {
                        isGameOver();
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
                    isGameOver();
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
                    playerTurn = !canPlayAgain(pitNumber, computerPits, computerStore);
                }
                if (isGameOver()) {
                    printGameBoard();
                    System.out.println("Game over! Final score - You: " + playerStore + ", Computer: " + computerStore);
                    break;
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
    }

    // method to determine if a player can play again
    private boolean canPlayAgain(int pitNumber, List<Integer> pits, int store) {
        return pitNumber == 7;
    }
    // method to determine the computers move
    private int computerMove(List<Integer> computerPits) {
        for (int i = 0; i < 6; i++) {
            if (computerPits.get(i) > 0) {
                return i + 1;
            }
        } return 1;
    }
    // method to check if the game is over
    private boolean isGameOver() {
        for (int pit : playerPits) {
            if (pit > 0) {
                return false;
            }
        }
        for (int pit : computerPits) {
            if (pit > 0) {
                return false;
            }
        } return true;
    }

    // Method to print the game layout
    private void printGameBoard() {
        System.out.println("  Computer Pits: " + computerPits);
        System.out.println("  Computer Store: " + computerStore);
        System.out.println("  Your Pits: " + playerPits);
        System.out.println("  Your Store: " + playerStore);
    }
}