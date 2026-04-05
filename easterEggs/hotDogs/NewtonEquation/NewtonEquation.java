import java.util.Scanner;
public class NewtonEquation{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the inital velocity in meters/second: ");

    int u = input.nextInt();

    System.out.print("Enter the time span in seconds: ");

    int t = input.nextInt();

    System.out.print("Enter the acceleration in meters/secondsqr: ");

    int a = input.nextInt();

    double s = (u * t) + (0.5 * a * t * t);

    System.out.printf("The distance covered is %f%n" , s);    
    
    }

}
