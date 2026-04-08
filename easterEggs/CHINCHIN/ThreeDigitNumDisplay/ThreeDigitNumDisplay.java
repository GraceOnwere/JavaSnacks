import java.util.Scanner;
public class SumOfThreeDigits{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a three digit number: ");

    int num = input.nextInt();

    if (num >= 100 && num <= 999 || num <= -100 && num >= -999){
    System.out.println("It's a three digit number");
    }

    else 
    System.out.println("Is not a three digit number");
    
    }
}

