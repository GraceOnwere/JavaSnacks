import java.util.Scanner;
public class SumDifferenceProduct{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	
	double firstNumber = input.nextDouble();

	System.out.print("Enter the second number: ");

	double secondNumber = input.nextDouble();

	if (firstNumber > secondNumber){
	System.out.println(firstNumber + " is the larger value");
	}
	else 
	System.out.println(secondNumber + " is the larger value");

	double sum = firstNumber + secondNumber;
	System.out.println("The sum of the two numbers is " + sum);

	double difference = firstNumber - secondNumber;
	System.out.println("The difference between the two numbers is " + difference);

	double product = firstNumber * secondNumber;
	System.out.println("The prodct of the two numbers is " + product);
	
	if (firstNumber == 0 | secondNumber == 0){
	System.out.println("Cannot be divided");
	}
	else
	System.out.println("The quotient of the two numbers is " + firstNumber / secondNumber);

	}
}



	

