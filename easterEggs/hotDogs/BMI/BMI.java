import java.util.Scanner;
public class BMI{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in pounds: ");

    double weight = input.nextDouble();

    System.out.print("Enter your height in inches: ");

    double height = input.nextDouble();

    double kilograms = weight * 0.45359237;

    double inches = height * 0.0254;

    double BMI_ = kilograms * inches;

    System.out.printf("The BMI is %.2f%n" , BMI_);

    
    }
}
