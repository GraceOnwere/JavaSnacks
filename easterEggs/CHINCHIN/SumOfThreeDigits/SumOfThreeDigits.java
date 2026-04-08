import java.util.Scanner;
public class SumOfThreeDigits{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a three digit number: ");

    int num = input.nextInt();

    int firstNumber = num / 100;

    int middleNumber = num/10 % 10;

    int lastNumber = num % 10;
    
    int sum = firstNumber + middleNumber + lastNumber;

    System.out.println("The sum of the digits is " + sum);
    }
}  

