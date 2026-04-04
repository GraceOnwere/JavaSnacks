import java.util.Scanner;
public class TaskEleven{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");

    double number = input.nextInt();
    
    double decimal = number / 2 ;
    
    System.out.printf("The double of the result is %.2f%n" , decimal);
   
    }
}
