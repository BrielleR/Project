/*Brielle Roze
Project 4: Conway's Game of Life
10/11/23 -
Rules
use arrays
2> neighbors = dead
2/3 neighbors = live
only 3 neighbors = live/aka new one
3< neighbors = dead
Search: Java -> clear console -> run in mac terminal
pg 867 - 871
pg 963
pg 993
pg1005
pg 866 close window
pg 871: when they cross paths
//import javax.swing.event.*; //for mouse events
 */

import java.awt.*; //for graphics
import javax.swing.*; //for GUI
//import java.awt.event.*;
import java.util.Random;

public class ConwaysGameOfLife
{
    public static void main (String[]args)
    {
        //random numbers {used page 307-308
        Random r = new Random();
        int number = r.nextInt(399) + 1; // random number from 1 to 3
        System.out.println(number);

        Random a = new Random();
        int number2 = a.nextInt(399) + 1; // random number from 1 to 3
        System.out.println(number2);

        //reference: pg 191
        DrawingPanel panel = new DrawingPanel(400,300);
        Graphics g = panel.getGraphics();
        g.drawLine(number, number,number,number);
        g.drawLine(number2, number2,number2,number2);
        g.drawLine(number, number2,number,number2);
        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Conways Game Of Life");
    }
}
