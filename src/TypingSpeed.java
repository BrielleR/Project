/*Brielle Roze
Project 3: Typing Speed Tester
Chapter 13
162 for counting the string stuff
timer code either on 870 or 793
//System.currentTimeMillis() = calculate time elapsed
60,000 milliseconds = 1 minute
6000 milliseconds = 1 second
if using a file check chapter 6 pg376-377 & 380 and import java.io.*; //for file
Progress notes  for 10/18/23
have a working timer, can ask user for input, however haven't found how to count how many words are in the users input right now only counts 1
*/
//import java.io.*;
import java.util.*;

public class TypingSpeed
{
    public static void main(String[]args)
    {
        System.out.println("Hello! And welcome to typing Speed tester!");
        System.out.println("It's time to type how many words per minute you can type!");
        Scanner input = new Scanner(System.in);
       //396
        //String tester = input.nextLine(); what was this for?
        //pg 397
        long startTime = System.currentTimeMillis();
        int count=0;
        //while (input.hasNext()) //380 //384 //392 loop that never stops
        //{
            String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
            count++;
        //}
        System.out.println("total words " + count + " \n for the user input " + word);
        long endTime = System.currentTimeMillis(); // Calculate time elapsed by milliseconds? pg 793
        System.out.println("Elapsed time in seconds:" + (endTime - startTime)/6000);
        double t = endTime - startTime/6000;
        double s = count/t;
        double sm = 2*60;
        System.out.println("Your typing speed is: " + s + " Per-second \n And: " + sm + " Per-minute.");
        // Since it is calculated in ms must divide by 6000 to get seconds
    }
}
