import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        double fahren = 0;
        int cel = 0;
        String trash = "";

        do
        {

            System.out.print("Enter the temperature in Celcius: ");
            if(in.hasNextInt())
            {
                cel = in.nextInt();
                in.nextLine();
                fahren = (cel * 9/5) + 32;
                System.out.println(cel + " in Fahrenheit is: " + fahren);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the temperature in Celcius is: " + trash + ".");
                System.out.println("Please enter a valid input.");
            }

        }while(!done);
    }
}