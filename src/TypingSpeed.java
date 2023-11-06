/*Brielle Roze
Project 3: Typing Speed Tester
Chapter 13
Pages used: pg 396, pg 397, 162 for counting the string stuff, timer code either on 870 or 793, -163-164 reading for white spaces but using tokens
-System.currentTimeMillis() = calculate time elapsed (pg 793)
-60,000 milliseconds = 1 minute 6000 milliseconds = 1 second
- For calculating user input accuracy use pg 256



Progress notes
 Date:  10/18/23
 Notes: Have a working timer, can ask user for input, however haven't found how to count how many words are in the users input right now only counts 1
 Date: 10/24/23
 Notes: Works now counts by characters not number of words, but also timer stuff works and calculating how fast based off character is accurate, but does not read input to see if user input is correct
Date: 10/25/23
Notes: Found a possible way to read user input and compare contents with dictionary(pg 778- pg 779), just need to figure out how to add dictionary file nvm
Date:10/31/23
Notes: Learned about string splitting, may look into that for separating words in a string, but also still need to add a dictionary file for the spell check code in notes
Date 11/1/23
Notes: Tried to split string and turn it into an array
*/
import java.io.*;
import java.text.MessageFormat;
import java.util.*;
public class TypingSpeed
{
    public static void main(String[]args)
    {
        System.out.println("\nHi! \nWelcome to typing Speed tester!");
        System.out.println("It's time to type how fast can type! \nGo ahead and start typing! \nAs soon as your done click enter, to stop the timer and get your results!");
        Scanner input = new Scanner(System.in);


        long startTime = System.currentTimeMillis();
        String s1 = input.nextLine();
        System.out.println("Length of input : " + s1.length());
        long endTime = System.currentTimeMillis(); // Calculates time elapsed by millisecond's pg 793
        double t = (endTime - startTime)/6000; // goes from milliseconds to seconds // Since it's calculated in ms must divide by 6000 to get sec
        System.out.println("Elapsed time in seconds:" + t);
        int amount = s1.length();
        double s = amount/t; //divides time in seconds by the number of words
        double sm = s*60;
        System.out.println("Your typing speed is: " + s + " Characters Per-second \nAnd therefore : " + sm + " Characters Per-minute.");
        //String values = "hi hello and good bye";
        String[] array = s1.split(" ");
        //Now calculate length of array and then out put each word found, and then spell check each then calculate accuracy and typing speed
        //Maybe try page 891-892 or 902
        System.out.println(MessageFormat.format("List:{0}", array)); //outputs the first word, just testing
        System.out.println(MessageFormat.format("List:{1}", array)); //outputs the second word, just testing

        /*
        Compares users input to what they should have input, other option for finding accuracy
        String {} s,t;
        if (s[0].equals(t[0])
        {
        }
         */

    }
}
