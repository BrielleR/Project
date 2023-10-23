/*Brielle Roze
Project 2: Etchasketch


*/
import java.awt.*; //for graphics
import javax.swing.*; //for GUI
import javax.swing.event.*; //for mouse events
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;


public class Notes
{

    /* Counts first word of a string pg159
      for (int i = 0; i< word.length(); i++)
        {
            System.out.println(i + ": " + word.charAt(i));
        }
     */
    public static void main (String[] args)
            throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("speed.txt"));
        //396
        //String tester = input.nextLine(); what was this for?
        //pg 397
       // long startTime = System.currentTimeMillis();
        int count = 0;
        String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
        count++;

       /* while (input.hasNext()) //380 //384 //392 loop that never stops
        {
            String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
            count++;
        }
        //String extra = input.next(); what was this for?
        System.out.println("total words " + count );
        */

    }
}

    /*public static void main (String[]args)
    {

        //reference: pg 191
      DrawingPanel panel = new DrawingPanel(500,500);
        Graphics g = panel.getGraphics();
        //g.drawLine(25, 75,175,25);

        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Blank");
    }*/

