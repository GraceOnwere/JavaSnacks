import java.util.Scanner;
public class TaskNineteen{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");

    int number = input.nextInt();
    
    int remainder = number % 2 ;
    
    System.out.printf("The double of the result is %d%n" , remainder);
   
    }
}
