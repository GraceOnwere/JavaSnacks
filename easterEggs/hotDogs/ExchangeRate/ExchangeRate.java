import java.util.Scanner;
public class FutureInvestmentValue{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter exchange rate from US Dollars to Chinese RMB: ");    

    double exchangeRateDollarToRMB = input.nextDouble();

    double exchangeRateRMBToDollar = 1 / exchangeRateDollarToRMB ;
       
    System.out.print("Do you want to convert from Dollars to RMB or RMB to Dollars (Press 0 or 1): ");

    int number = input.nextInt();

    System.out.print("Enter the amount you wish to convert: ");
    
    double amount = input.nextDouble();

    if (number == 0) {
    System.out.printf("%.2f Yuan%n" , amount * exchangeRateDollarToRMB);
    } 

    else if (number == 1) {
    System.out.printf("%.2f Dollars%n" , amount * exchangeRateRMBToDollar);
    }

    else 
    System.out.println("You chose a number other than 0 or 1");
}
    }

