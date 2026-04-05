import java.util.Scanner;
public class DivisibleCheck{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");  

    int number = input.nextInt();
    
    if (number % 2 ==0){
    System.out.println("The number is divisible by 2"); 
    }

    if (number % 3 == 0){
    System.out.println("The number is divisible by 3"); 
    }

    if (number % 5 == 0){
    System.out.println("The number is divisible by 5"); 
    }

    if (number % 7 == 0){
    System.out.println("The number is divisible by 7"); 
    }

   // else 
    //System.out.println("The number is not divisible by 2,3,5 or 7");

}
    }
