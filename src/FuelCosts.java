import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        double tank = 0.0;
        double mile = 0.0;
        double price = 0.0;
        double cost = 0.0;
        double dist = 0.0;
        String trash = "";

        do
        {

            System.out.print("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble())
            {
                tank = in.nextDouble();
                in.nextLine();
                System.out.println("Enter the number of miles you can go per gallon: ");
                if(in.hasNextDouble())
                {
                    mile = in.nextDouble();
                    in.nextLine();
                    System.out.println("Enter the price per gallon: ");
                    if(in.hasNextDouble())
                    {
                        price = in.nextDouble();
                        in.nextLine();
                        cost = price * 100;
                        dist = tank * mile;
                        System.out.println("The cost to drive 100 miles is: " + cost);
                        System.out.println("The max distance you can drive on a full tank is: " + dist);
                        done = true;
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You said: " + trash + ".");
                        System.out.println("Please enter a valid input.");
                    }

                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You said: " + trash + ".");
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
