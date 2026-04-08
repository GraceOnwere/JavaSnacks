import java.util.Scanner;
public class BMIDisplay{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in kg : ");

    double weight = input.nextDouble();

    System.out.print("Enter your height in meters: ");

    double height = input.nextDouble();

    double BMI_ = weight / (height * height);

    if (BMI_ < 18.5){
	System.out.println("Your BMI is Underweight (< 18.5)");
	}

	else if (BMI_ >= 18.5 && BMI_ <= 24.9){
	System.out.println("Your BMI is Normal (18.5-24.9)");
	}

	else if (BMI_ >= 25 && BMI_ <= 29.9){
	System.out.println("Your BMI is Overweight(25-29.9)");
	}

	    else 
	System.out.println("Your BMI is Obese (30+)");

    
    }
}
