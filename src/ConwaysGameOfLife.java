/*Brielle Roze
Conway's Game of Life
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
 */

import java.awt.*; //for graphics
import javax.swing.*; //for GUI
//import javax.swing.event.*; //for mouse events
//import java.awt.event.*;
public class ConwaysGameOfLife
{
    static void main(String[]args)
    {
        //reference: pg 191
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics g = panel.getGraphics();
       g.drawLine(25, 75,175,25);

        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Conway's Game of Life");
    }
}
