import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        double meter = 0.0;
        double mile = 0.0;
        double feet = 0.0;
        double inch = 0.0;
        String trash = "";

        do
        {

            System.out.print("Enter the distance in meters: ");
            if(in.hasNextDouble())
            {
                meter = in.nextDouble();
                in.nextLine();
                mile = meter / 1609;
                feet = meter * 3.281;
                inch = meter * 39.37;
                System.out.println(meter + " meters in miles is: " + mile);
                System.out.println(meter + " meters in feet is: " + feet);
                System.out.println(meter + " meters in inches is: " + inch);
                done = true;
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
