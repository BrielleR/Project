import java.util.Random;
import java.util.Scanner;

/*Brielle Roze
Project 3 Take 2
Mancala, (apparently the first one was actually mastermind... :\but I did do mastermind first semester but that was with numbers... this was numbers/colors (does this make it proj 4 or three...?) also technocally the other one was proj 1/2 so... )
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
public class Sem2Project3MancalaTakeTwo {
    public static void main(String[]args)
    {
        System.out.println("Welcome to Playing Mancala!");
        System.out.println("Here's How it works!: " +
                "\nYou and the computer each have your own store and 6 pits." +
                "\n Here are the General Rules: " +
                "\n* Who plays first will be determined by a dice roll." +
                "\n* Play always moves around the board in a counter-clockwise circle (to the right)" +
                "\n* The store on your right belongs to you. That is where you keep the seeds you win." +
                "\n* The six pits near you are your pits." +
                "\n* Only use one hand to pick up and put down seeds." +
                "\n* Once you touch the seeds in a pit, you must move those seeds." +
                "\n* Only put seeds in your own store, not your opponent’s store. " +
                "\n* When the last seed in your hand lands in your store, take another turn." +
                "\n* When the last seed in your hand lands in one of your own pits, if that pit is not empty you" +
                "get to keep all the seeds in your opponents pit on the opposite side. Put those captured seeds," +
                "as well as the last seed that you just played on your side, into your store.");
        System.out.println("Would you like to play? If so please enter 1, if not please enter any other positive whole integer!");
        Scanner reset = new Scanner(System.in);
        int yes = Integer.parseInt(reset.nextLine());
        if (yes == 1)
        {
            int room = 0;
            if (room ==0) {
                System.out.println("Thank you for choosing to play!");
                //Dice roll to decide who will go first
                Random r = new Random();
                int roll = r.nextInt(6) + 1; // random number from 1–6
                int roll2 = r.nextInt(6) + 1; // random number from 1–6
                System.out.println("Who goes first will be determined by a dice roll! \nThe computer has rolled: " + roll + " \nAnd you have rolled: " + roll2);

                if (roll == roll2)//when they have rolled the same thing
                {
                    System.out.println("Time to re-roll the dice!");
//                roll = r.nextInt(6) + 1;
//                roll2 = r.nextInt(6) + 1;
//                System.out.println("Who goes first will be determined by a dice roll! \nThe computer has rolled: " + roll + " \nAnd you have rolled: "+ roll2);
                    room = 0;
                } else if (roll > roll2) {
                    System.out.println("The computer will go first!");
                    room = 1;
                } else if (roll < roll2) {
                    System.out.println("You will go first!");
                    room = 2;
                }
            }
            if (room == 1)
            {
                System.out.println("The Computers first move is: ");
            }
            if (room == 2)
            {
                System.out.println("What will your first move be?");
            }


        }
    }

}
