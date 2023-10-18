/*Brielle Roze
Project 2 Typing Speed Tester
Chapter 13
//System.currentTimeMillis() = calculate time elapsed
60,000 milliseconds = 1 minute
if using a file check chapter 6 pg376-377 & 380 and import java.io.*; //for file
*/
import java.util.*;

public class TypingSpeed
{
    public static void main(String[]args)
            //throws FileNotFoundException

    {
        System.out.println("Hello! And welcome to typing Speed tester!");
        System.out.println("It's time to type how many words per minute you can type!");
        Scanner input = new Scanner(System.in);
       //396
        //String tester = input.nextLine();
        //pg 397
        long startTime = System.currentTimeMillis();

        String word = "s";
        int count=0;
        while (input.hasNextLine()) //380 //384 //392
        {
            word = input.next();
            count++;
        }
        //String extra = input.next();
        System.out.println("total words =+" + count);
        System.out.println("number " + count + " = " + word);


        long endTime = System.currentTimeMillis(); // Calculate time elapsed by milliseconds? pg 793
        System.out.println("Elapsed time in minutes:" + (endTime - startTime)/60000);

        // Since it is calculated in ms must divide by 60000 to get minutes
        //Error keeps saying 0 seconds
    }
}
