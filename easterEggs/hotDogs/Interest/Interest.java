import java.util.Scanner;
public class Interest{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your balance: ");

    double balance = input.nextDouble();

    System.out.print("Enter annual percentage interest rate: ");

    double annualInterest = input.nextDouble();

    double annualInterestRate = annualInterest / 100;

    double interest = balance * (annualInterestRate/1200);


    System.out.printf("The interest for the next month is %.2f%n" , interest);

    
    }
}
