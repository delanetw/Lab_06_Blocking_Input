import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main (String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int guess = 0;
        int val = generator.nextInt(10) + 1;
        String trash = "";

        do
        {

            System.out.print("Choose a value from [1 - 10]: ");
            if(in.hasNextInt())
            {
                guess = in.nextInt();

                if(guess == val)
                {
                    System.out.println(guess + " is correct!");
                    done = true;
                }
                else if(guess > val && guess < 10 && guess > 1)
                {
                    System.out.println(guess + " is too high.");
                }
                else if(guess < val && guess > 1 && guess < 10)
                {
                    System.out.println(guess + " is too low.");
                }
                else
                {
                    System.out.println("You said: " + guess + ".");
                    System.out.println("Please enter a valid input.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said: " + trash + ".");
                System.out.println("Please enter a valid input.");
            }

        }while(!done);
    }
}
