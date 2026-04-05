import java.util.Scanner;
public class FutureInvestmentValue{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the investment amount: ");    

    double investmentAmount = input.nextDouble();

    System.out.print("Enter the annual interest rate: "); 

    double annualRate = input.nextDouble();

    System.out.print("Enter the number of years: "); 

    double numberOfYears = input.nextDouble();

    double monthlyInterestRate = (annualRate / 100) / 12;

    double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate) , (numberOfYears * 12)) ;

    System.out.printf("The future investment value is %.2f%n" , futureInvestmentValue);

    }
}
