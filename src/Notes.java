/*Brielle Roze
Project 2: Etchasketch


*/
import java.awt.*; //for graphics
import javax.swing.*; //for GUI
import javax.swing.event.*; //for mouse events
import java.awt.event.*;



public class Notes
{
    public static void main (String[]args)
    {

        //reference: pg 191
      DrawingPanel panel = new DrawingPanel(500,500);
        Graphics g = panel.getGraphics();
        //g.drawLine(25, 75,175,25);

        //reference chapter 14 823 - 877
        JOptionPane.showMessageDialog(null, "Welcome to Etchasketch");
    }
}
