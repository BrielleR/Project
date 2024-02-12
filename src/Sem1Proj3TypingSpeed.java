/*Brielle Roze
Project 3: Typing Speed Tester
10/18/23 - completed on 1/12/24 tuned in on 1/22/24 fixed some stuff 1/23/24 got feedback on turned in one on 1/24
Pages used: Chapter 13, pg 396, pg 397, 162 for counting the string stuff, timer code either on 870 or 793, -163-164 reading for white spaces but using tokens, 891-892 or 902
-System.currentTimeMillis() = calculate time elapsed (pg 793)
-60,000 milliseconds = 1 minute 6000 milliseconds = 1 second
- For calculating user input accuracy use pg 256, 778, 681
-NEW //pg 651 lets you compare two strings and 665 may help as well (edit: was what I referenced for accuracy)

Progress Notes:
    Date:  10/18/23
Notes: Have a working timer, can ask user for input, however haven't found how to count how many words are in the
users input right now only counts 1
    Date: 10/24/23
Notes: Works now counts by characters not number of words, but also timer stuff works and calculating how fast based
off character is accurate, but does not read input to see if user input is correct
    Date: 10/25/23
Notes: Found a possible way to read user input and compare contents with dictionary(pg 778- pg 779), just need to
figure out how to add dictionary file
    Date:10/31/23
Notes: Learned about string splitting, may look into that for separating words in a string, but also still need to
add a dictionary file for the spell check code in notes
    Date 11/1/23
Notes: Tried to split string and turn it into an array
    Date: 11/8/23
Notes: pg 778 figured out how to enter a word and check if it's in a text file, so if I give the user what I want them
to type in order to test them then can cross check their input with what it should be, maybe let the user choose what
their needed to type from the options given, and once they have chosen then start the test because right now it just
starts as soon as the program is run which effects the accuracy of the speed tester as the timer starts right away
meaning while the user is reading intro their time is ticking, also with different options have the code read a
different file for each option for the sake of the accuracy testing portion
    Date:11/15/23
Notes:Decided to just cross check user input with dictionary, so far can count how many words the user input and have a
working dictionary, but still need tp cross check user input wih dictionary either one word are a time, or just the
string as a whole but then would have to use idea mentioned above
    Date: 1/12/24
Notes: Took like a month+ off but now complete, added a part that Lets user choose if they would like to retry,
however error occurs when user takes less than a second to type and submits their answer...
    Date: 1/22/24
Notes: Turned in
    Date: 1/23/24
Notes: Have not yet received feedback, but decided to run through it a couple times and fix some things, such as the
game starts right from the moment you hit the debugger therefore the timer is running for the test while the user is
still reading the intro therefore giving inaccurate results, therefore added an if else statement, where after reading
the intro the user can choose to either enter 0 and start the game or enter 1 and leave. And redid the intro along with
this so it would make more sense and have a better description, before  was to vague, anyway now its more complete
*/
import java.util.*;
public class Sem1Proj3TypingSpeed
{
    public static void main(String[]args)
    {
        System.out.println("Hello & Welcome to Typing Speed Tester!");
        int retry = 0;
        int num = 1;
        while (retry != num)
        {
            int start = 0;
            int z = 1;
            System.out.println("It's time to type how fast can type! \nIf you would like to play please type 0 if not enter 1 \nAs soon as you enter 1 this will end \nAs soon as you enter 0 the test and its timer will begin \nThen as soon as your done with the test click enter, to stop the timer and get your results!");
            System.out.println("So if you input 0 immediately go ahead and start typing! Please input the text will pop up that is what you will be tested on.  And if 1 thank you for reading till now and farewell!");
            Scanner game = new Scanner(System.in);
            start = Integer.parseInt(game.nextLine());
            if (start == 0)
            {
                String frog = "There once was a little frog named Frog. Frog the frog lived on a lily pod in a pond. He quite enjoyed his time on the pod in the pond. But he also felt quite lonely because he was the only frog on the only lily pod in the whole pond.";
                    //Collecting information
                System.out.println(frog);
                Scanner input = new Scanner(System.in);
                long startTime = System.currentTimeMillis();
                String s1 = input.nextLine();
                long endTime = System.currentTimeMillis(); // Calculates time elapsed by millisecond's pg 793
                double t = (endTime - startTime) / 1000; // goes from milliseconds to seconds // Since it's calculated in ms must divide by 6000 to get sec
                //Calculating Speed
                System.out.println("Elapsed time in seconds:" + t);
                System.out.println("\nLength of input as characters: " + s1.length());
                int amount = s1.length();
                double s = amount / t; //divides time in seconds by the number of characters
                double sm = s / 60;
                System.out.println("Your typing speed as characters per minute is: \n " + s + " Characters Per-second \nAnd therefore: \n" + sm + " Characters Per-minute.");
                String[] array = s1.split(" "); //puts input into an array
                int r = array.length;     //length by # of words:  r
                double l = r / t; //divides time in seconds by the number of words
                double m = l / 60;
                System.out.println("\nLength of input as words: " + r);
                System.out.println("Your typing speed as words per minute is:\n" + l + " Words Per-second \nAnd therefore: \n" + m + " Words Per-minute.");
                //Calculating Accuracy
                //cross-checking it with a given string instead of the spell check thing(?) and gives results
                if (frog.compareTo(s1) != 0)
                {
                    System.out.println("Input is NOT equal to than given text");

                    if (frog.compareTo(s1) < 0) {
                        System.out.println("Input is greater than given text");
                    }
                    else if (frog.compareTo(s1) > 0) {
                        System.out.println("Input is less than given text");
                    }
                }
                if (frog.compareTo(s1) == 0) {
                    System.out.println("Input is equal to given text! \nYou have a 100% accuracy!! \nCongratulations! \nThank you for playing tying speed tester!");
                }
                //Lets user choose if they would like to retry
                System.out.println("Would you like to play again? if not enter 1 if so please enter 0.");
                Scanner choice = new Scanner(System.in);
                retry = Integer.parseInt(choice.nextLine());
            }
                else
                {
                    retry = 1;
                }
        }
    }
}
