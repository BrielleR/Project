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
        System.out.println("\nHi! Welcome to typing Speed tester!");
        System.out.println("It's time to type how many words per minute you can type!");
        Scanner input = new Scanner(System.in);
       //396
        //pg 397
        long startTime = System.currentTimeMillis();
        int count=0;
        //while (input.hasNext()) //380 //384 //392 Error loop that never stops
        //{
            String s1 = input.next();// Error never stops asking user for input nvm was just stuck in while loop
            count++;
        //}

        long endTime = System.currentTimeMillis(); // Calculates time elapsed by millisecond's pg 793
        double t = (endTime - startTime)/6000; // goes from milliseconds to seconds // Since it is calculated in ms must divide by 6000 to get seconds
        //error only ever out puts 2 //System.out.println("Length of input : " + s1.length());
        //error only ever out puts 1 // System.out.println("Total words: " + count ); //+ " \n for the user input " + word
        System.out.println("Elapsed time in seconds:" + t);
        double s = count/t; //divides time in seconds by the number of words //Error since count is incorrect results are not accurate
        double sm = s*60;
        System.out.println("Your typing speed is: " + s + " Words Per-second \nAnd therefore : " + sm + " words Per-minute.");




    }
}
