import java.util.Scanner;
public class TaskThirty{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");

    int input_1 = input.nextInt();

    System.out.print("Enter second number: ");    

    int input_2 = input.nextInt();
        
    
    int sum = input_1 + input_2 ;
    
    int product = input_1 * input_2;
    
    System.out.printf("The sum and product of the result are %d and %d%n" , sum,product);
   
    }
}
