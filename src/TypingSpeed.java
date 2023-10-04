/*Brielle Roze
Project 2 Typing Speed Tester
Chapter 13
//System.currentTimeMillis() = calculate time elapsed
60,000 miliseconds = 1 minute
*/

import java.util.*;
public class TypingSpeed
{
    public static void main(String[]args)
    {
        System.out.println("Hello! And welcome to typing Speed tester!");
        System.out.println("Its time to type how many words per minute you can type!");
        long startTime = System.currentTimeMillis();
        Scanner speed = new Scanner(System.in);
        long endTime = System.currentTimeMillis(); // Calculate time elapsed by milliseconds? pg 793
        System.out.println("Elapsed time in minutes:" + (endTime - startTime)/60000);
        // Since its calculated in ms must divide by 60000 t get minutes
    }
}
