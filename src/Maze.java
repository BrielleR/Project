import java.util.*;
public class Maze {
    public static void Main(String[] args) {
        System.out.println("Welcome to a maze \n This maze has 25 rooms! \n Best of luck navigating your way through!");

        int room = 1;
        int choice = 0;
        String e = "Error with user input";

        Scanner maze = new Scanner(System.in);

        while (room != 26) {
            if (room == 1) {
                System.out.println("Welcome to the first room!");
                System.out.println("Your options are: 1.)Go forwards 2.)Go Right please either input 1 or 2");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 2);
                } else if (choice == 2) {
                    System.out.println(room == 6);
                } else {
                    System.out.println(e);
                }
            }
            if (room == 2) {
                System.out.println("Welcome to the second room");
                System.out.println("Your options are: 1.)Go backwards 2.)Go forwards 3.)Go right Please Either input 1 or 2 or 3 ");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 1);
                } else if (choice == 2) {
                    System.out.println(room == 3);
                } else if (choice == 3) {
                    System.out.println(room == 7);
                } else {
                    System.out.println(e);
                }
            }

            if (room == 3) {
                System.out.println("Welcome to room 3");
                System.out.println("Your options are: 1.)Go backwards 2.)Go forwards 3.)Go right Please Either input 1 or 2 or 3 ");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 2);
                } else if (choice == 2) {
                    System.out.println(room == 4);
                } else if (choice == 3) {
                    System.out.println(room == 8);
                } else {
                    System.out.println(e);
                }
            }
            if (room == 4) {
                System.out.println("Welcome to room 4");
                System.out.println("You have reached a dead end your options are 1.)Go backwards Please input 1");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 3);
                }
            }
            if (room == 5) {
                System.out.println("Welcome to room 5");
                System.out.println("You have reached a dead end your options are 1.) Go right Please input 1");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 10);
                } else {
                    System.out.println(e);
                }
            }
            if (room == 6) {

            }
            if (room == 7) {

            }
            if (room == 8) {

            }
            if (room == 9) {

            }
            if (room == 10) {

            }
            if (room == 11) {
                System.out.println("Welcome to room 11");
                System.out.println("You have reached a dead end, your option is to 1.)go left Please in put 1");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 6);
                } else {
                    System.out.println(e);
                }
            }
            if (room == 12) {

            }
            if (room == 13) {

            }
            if (room == 14) {
                System.out.println("Welcome to room 14");
                System.out.println("You hav reached a dead end Your oprtion is 1.)Go backwards Please Input 1");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1) {
                    System.out.println(room == 13);
                } else {
                    System.out.println(e);
                }
            }
            if (room == 15) {

            }
            if (room == 16) {

            }
            if (room == 17) {

            }
            if (room == 18) {

            }
            if (room == 19) {

            }
            if (room == 20) {

            }
            if (room == 21) {
                System.out.println("Welcome to room 21");
                System.out.println("You hav reached a dead end, your option is to 1.)Go left Please in put 1");
                choice = Integer.parseInt(maze.nextLine());
                if (choice == 1)
                {
                    System.out.println(room == 16);
                }
                else {
                    System.out.println(e);
                }

            }
            if (room == 22) {

            }
            if (room == 23) {

            }
            if (room == 25) {

            }
        }
    }
}
