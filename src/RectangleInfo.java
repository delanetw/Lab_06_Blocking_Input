import java.util.Scanner;
public class RectangleInfo
{
    public static void main (String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double diag = 0.0;
        double area = 0.0;
        double peri = 0.0;
        double pyth = 0.0;
        double pythL = 0.0;
        double pythW = 0.0;
        String trash = "";

        do
        {

            System.out.print("Enter the length: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                System.out.println("Enter the width: ");
                if(in.hasNextDouble())
                {
                    width = in.nextDouble();
                    in.nextLine();
                    area = length * width;
                    peri = (length * 2) + (width * 2);
                    diag = Math.sqrt((length * length) + (width * width));
                    System.out.println("The perimeter is: " + peri);
                    System.out.println("The area is: " + area);
                    System.out.println("The length of the diagonal is: " + diag);
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

        }while(!done);
    }
}
