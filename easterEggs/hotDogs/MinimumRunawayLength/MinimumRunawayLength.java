import java.util.Scanner;
public class MinimumRunawayLength{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the take-off speed in meters/secondsqr: ");

    double v = input.nextDouble();

    System.out.print("Enter the airplane's acceleration in meters/second: ");

    double a = input.nextDouble();

    double length = (v * v) / (2 * a);

    System.out.println("The minimum runaway length is " + length);

    
    }
}
