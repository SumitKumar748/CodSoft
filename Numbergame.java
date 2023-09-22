import java.util.*;
import java.util.Random;
class game extends Thread
{
    public void run()
    {
        try {
            System.out.println("\n\t\t\t   Welcome to the game :)\n\t\t\tPlease wait, game is loading...\n");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.print(" ");
        }

    }
}

public class Numbergame {
    public static void main(String args[]){
        game obj=new game();
        obj.run();
        Scanner sc=new Scanner(System.in);
        try {
            for (int j = 3; j >= 1; j--) {
                System.out.println("You have only " + j + " chance for guessing the correct number.");
                int n;
                Random r = new Random();
                int i = r.nextInt(100);
                System.out.print("\t\tLets start the game\nEnter a number between 1-100:      ");
                n = sc.nextInt();
                try
                {
                    System.out.println("Please wait for the result...");
                    Thread.sleep(2000);
                    if (n == i)
                        System.out.println("Congratulations! You won the game\n");
                    else if (n > i)
                        System.out.println("Your guess is Too high\n");
                    else if (n < i)
                        System.out.println("Your guess is Too low\n");
                    else {
                        System.out.println("Enter the number between the range.");
                    }
                    if (j == 1)
                        System.out.println("Better luck next time");
                    //System.out.println("Winning number was: " + i);
                }
                catch(Exception e)
                {
                    System.out.println();
                }

            }
        }
        catch(Exception e)
        {System.out.println("Enter numbers only.");}
    }
}
