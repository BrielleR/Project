/*Brielle Roze
Project 2 : Maze
10/10/23 - 10/11/23
Turned in/Printed: 11/2/23
Must include 25 rooms, also made it so all rooms except the first one the user can choose to restart back at one
 */
import java.util.*;
public class Sem1Proj2Maze
{
    public static void main(String[]args)
    {
        System.out.println("Welcome to a Maze! \n This maze has 25 rooms! \n Best of luck navigating your way through!");
        int room = 1;
        int choice;
        String e = "Error with user input";
        Scanner maze = new Scanner(System.in);
        while (room != 26) {
            if (room == 1) {
                System.out.println("Welcome to the first room!");
                System.out.println("Your options are: 1.)Go forwards 2.)Go Right please either input 1 or 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 2 );

                } else if (choice == 2) {
                    System.out.println(room = 6);
                }
                else{System.out.println(e);}
            }
            if (room == 2) {
                System.out.println("Welcome to the second room");
                System.out.println("Your options are: 1.)Go backwards 2.)Go forwards 3.)Go right Please Either input 1 or 2 or 3 ");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 1);
                } else if (choice == 2) {
                    System.out.println(room = 3);
                } else if (choice == 3) {
                    System.out.println(room = 7);
                }
                else if (choice == 4){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 3) {
                System.out.println("Welcome to room 3");
                System.out.println("Your options are: 1.)Go backwards 2.)Go forwards 3.)Go right Please either input 1 or 2 or 3");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 2);
                } else if (choice == 2) {
                    System.out.println(room = 4);
                } else if (choice == 3) {
                    System.out.println(room = 8);
                }
                else if (choice == 4){
                    System.out.println(room=1);
                }
                else if (choice == 5){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 4) {
                System.out.println("Welcome to room 4");
                System.out.println("You have reached a dead end your options are 1.)Go backwards Please input 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 3);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 5) {
                System.out.println("Welcome to room 5");
                System.out.println("You have reached a dead end your options are 1.) Go right Please input 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 10);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 6) {
                System.out.println("Welcome to room 6");
                System.out.println("Your options are: 1.)go left 2.) go straight 3.)go right please input 1 or 2 or 3");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 1);
                }
                else if (choice== 2){
                    System.out.println(room =7);
                }
                else if (choice == 3){
                    System.out.println(room =11);
                }
                else if (choice == 4){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 7) {

                System.out.println("Welcome to room 7");
                System.out.println("Your options are: 1.)Go back 2.)Go left 3.) Go right Please either input 1 or 2 or 3");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room =6);
                }
                else if (choice == 2){
                    System.out.println(room = 2);
                }
                else if (choice == 3){
                    System.out.println(room = 12);
                }
                else if (choice == 4){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 8) {
                System.out.println("Welcome to room 8");
                System.out.println("Your options are: 1.)Go right 2.)Go straight Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room =13);
                }
                else if (choice == 2){
                    System.out.println(room =9);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 9) {
                System.out.println("Welcome to room 9");
                System.out.println("Your options are: 1.)Go back 2.)Go straight Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 8);
                }
                else if (choice == 2){
                    System.out.println(room =10);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 10) {
                System.out.println("Welcome to room 10");
                System.out.println("Your options are: 1.)Go back 2.)Go left 3.)Go right Please either input 1 or 2 or 3");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 9);
                }
                else if (choice == 2){
                    System.out.println(room =5);
                }
                else if (choice == 3){
                    System.out.println(room =15);
                }
                else if (choice == 4){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 11) {
                System.out.println("Welcome to room 11");
                System.out.println("You have reached a dead end, your option is to 1.)go left Please in put 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 6);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 12) {
                System.out.println("Welcome to room 12");
                System.out.println("Your options are: 1.)Go left 2.)Go straight 3.)Go right Please either input 1 or 2 or 3");
                System.out.println("Or if you would like to start over input 4");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 7);
                }
                else if (choice == 2){
                    System.out.println(room =13);
                }
                else if (choice == 3){
                    System.out.println(room= 17);
                }
                else if (choice == 4){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 13) {
                System.out.println("Welcome to room 13");
                System.out.println("Your options are: 1.)Go Back 2.)Go left 3.)Go straight 4.)Go right Please either input 1 or 2 or 3 or 4");
                System.out.println("Or if you would like to start over input 5");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 12);
                }
                else if (choice == 2){
                    System.out.println(room = 8);
                }
                else if (choice == 3){
                    System.out.println(room = 14);
                }
                else if (choice == 4){
                    System.out.println(room = 18);
                }
                else if (choice == 5){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 14) {
                System.out.println("Welcome to room 14");
                System.out.println("You have reached a dead end Your option is 1.)Go backwards Please Input 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room = 13);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 15) {
                System.out.println("Welcome to room 15");
                System.out.println("Your options are: 1.)Go left 2.)Go right Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 10);
                }
                else if (choice == 2){
                    System.out.println(room = 20);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 16) {
                System.out.println("Welcome to room 16");
                System.out.println("Your options are: 1.)Go straight 2.)Go right Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room  = 17);
                }
                else if (choice == 2){
                    System.out.println(room = 21);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 17) {
                System.out.println("Welcome to room 17");
                System.out.println("Your options are: 1.)Go back 2.)Go left 3.)Go straight 4.)Go right Please either input 1 or 2 or 3 or 4");
                System.out.println("Or if you would like to start over input 5");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 16);
                }
                else if (choice == 2){
                    System.out.println(room = 12);
                }
                else if (choice == 3){
                    System.out.println(room = 18);
                }
                else if (choice == 4){
                    System.out.println(room = 22);
                }
                else if (choice == 5){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 18) {
                System.out.println("Welcome to room 18");
                System.out.println("Your options are: 1.)Go back 2.)Go left Please either input 1 or 2 ");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 17);
                }
                else if (choice == 2){
                    System.out.println(room  = 13);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 19) {
                System.out.println("Welcome to room 19");
                System.out.println("You have reached a dead end Your option is 1.)Go straight Please Input 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room  = 20);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 20) {
                System.out.println("Welcome to room 20");
                System.out.println("Your options are: 1.)Go back 2.) Go left Please either input 1 or 2 ");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room  = 19);
                }
                else if (choice == 2){
                    System.out.println(room  = 15);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 21) {
                System.out.println("Welcome to room 21");
                System.out.println("You hav reached a dead end, your option is to 1.)Go left Please in put 1");
                System.out.println("Or if you would like to start over input 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1)
                {
                    System.out.println(room  = 16);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}

            }
            if (room == 22) {
                System.out.println("Welcome to room 22");
                System.out.println("Your options are: 1.)Go right 2.)Go straight Please either input 1 or 2 ");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room =17);
                }
                else if (choice == 2){
                    System.out.println(room  = 23);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 23) {
                System.out.println("Welcome to room 23");
                System.out.println("Your options are: 1.)Go back 2.)Go straight Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room  = 22);
                }
                else if (choice == 2){
                    System.out.println(room  = 24);
                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 24) {
                System.out.println("Welcome to room 24!");
                System.out.println("Your options are: 1.)Go back 2.)Go straight Please either input 1 or 2");
                System.out.println("Or if you would like to start over input 3");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room  = 23);

                }
                else if (choice == 2){
                    System.out.println(room = 25);

                }
                else if (choice == 3){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
            if (room == 25) {
                System.out.println("Welcome to room 25!");
                System.out.println("Congrats you have completed the maze! To end the code session enter 1. \n Or if you would like to start over input 2.");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1){
                    System.out.println(room = 26);
                }
                else if (choice == 2){
                    System.out.println(room = 1);
                }
                else{System.out.println(e);}
            }
        }
    }
}
