import java.util.Scanner;
public class ATMPin{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a PIN: ");

    int num = input.nextInt();

    if (num == 1234){
    System.out.println("Your balance is $1000");
}

    else 
    System.out.println("Incorrect PIN");


    }
}
