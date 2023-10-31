/*Brielle Roze
Semester 1 Projects complete 2/5
Project 1: Rock Paper Scissors
Project 2: Maze
Project 3: Typing Speed
Project 4:
Project 5:
Project options:
RPG Use page(s) 824 - 827
Adventure Use strings or page(s) 824 - 827

Semester 2 Projects complete 0/5
Project 1: Notes Application page 827, 857
Project 2: Sudoku use page 831. 852
Project 3:Levenshtein (Required)
Project 4: Levenshtein the shortest path
Project 5: Conways Game of Life
Word-le use 778
Solitaire use 780 - 781
*/
import java.awt.*; //for graphics
import javax.swing.*; //for GUI
import javax.swing.event.*; //for mouse events
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;


public class Notes
{
    public static void main (String[] args) throws FileNotFoundException
    {
        //pg 778 word work for Typing speed test if I make existing file that is a dictionary, to have a spell check for TST
        System.out.println("Searching for whether or not a word is in the dictionary/the mentioned file");

        Scanner in = new Scanner(new File("words.txt"));
        List<String> words = new ArrayList<String>();
        while (in.hasNext())
        {
            String word = in.next();
            words.add(word);
        }

        Scanner console = new Scanner(System.in);
        while(true)
        {
            System.out.print("Word: (Enter to quit)?");
            String target = console.nextLine();
            if (target.trim().length() == 0)
            {
                break;
            }
            int index = Collections.binarySearch(words, target);
            if (index >= 0)
            {
                System.out.println("\"" + target + "\" is word #" + index + " of " + words.size());
            }
            else
            {
                System.out.println(target + " is not found");
            }
        }



        /* Counts first word/chars of a string pg 159 could help with Typing speed tester
      for (int i = 0; i< word.length(); i++)
        {
            System.out.println(i + ": " + word.charAt(i));
        }
     */
        /* Stuff from typing speed tester
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        System.out.println("Length of input : " + s1.length());
        String s2 = s1;
        for (int i=0; i<s1.length(); i++ )
        {
            System.out.println(i +": " + s1.charAt(i));
        }
        //Scanner input = new Scanner(new File("speed.txt"));
        //396
        //String tester = input.nextLine(); what was this for?
        //pg 397
       // long startTime = System.currentTimeMillis();
        //int count = 0;
        //String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
        //count++;
        */
       /*
       while (input.hasNext()) //380 //384 //392 loop that never stops
        {
            String word = input.next();// Error never stops asking user for input nvm was just stuck in while loop
            count++;
        }
        //String extra = input.next(); what was this for?
        System.out.println("total words " + count );
        */

    }
}

    //Could use to have graphics for Adventure, RPG, and for notes application
    /*public static void main (String[]args)
    {

        //reference: pg 191
      DrawingPanel panel = new DrawingPanel(500,500);
        Graphics g = panel.getGraphics();
        //g.drawLine(25, 75,175,25);

        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Blank");
    }*/

