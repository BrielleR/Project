import java.util.*;
public class Maze
{
    public static void Main(String[]args)
    {
        System.out.println("Welcome to a maze \n This maze has 25 rooms! \n Best of luck navigating your way through!");

        int room = 1;

        Scanner maze = new Scanner(System.in);

        if (room == 1)
        {
            System.out.println("Welcome to the first room!");

            room = Integer.parseInt(maze.nextLine());
        }

    }
}
