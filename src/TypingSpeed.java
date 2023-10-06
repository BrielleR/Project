/*Brielle Roze
Project 2 Typing Speed Tester
Chapter 13
//System.currentTimeMillis() = calculate time elapsed
60,000 miliseconds = 1 minute
if using a file check chapter 6 pg376-377 & 380
*/
import java.util.*;
import java.io.*; //for file
public class TypingSpeed
{
    public static void main(String[]args)
            throws FileNotFoundException

    {
        System.out.println("Hello! And welcome to typing Speed tester!");
        System.out.println("It's time to type how many words per minute you can type!");

            Scanner input = new Scanner(new File("tester.txt"));
            int count = 0;
            while (input.hasNext())
            {
                String word = input.next();
                count++;
            }
            String extra = input.next();
            System.out.println("total words =+" + count);

        /* long startTime = System.currentTimeMillis();
        System.out.println("Hello! And welcome to typing Speed tester!");
        System.out.println("It's time to type how many words per minute you can type!");
        Scanner speed = new Scanner(System.in);
        long endTime = System.currentTimeMillis(); // Calculate time elapsed by milliseconds? pg 793
        System.out.println("Elapsed time in minutes:" + (endTime - startTime)/60000);
        */
        // Since it is calculated in ms must divide by 60000 to get minutes
    }
}
