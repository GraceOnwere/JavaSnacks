import java.util.Scanner;
public class TaskFourteen{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");

    int input_1 = input.nextInt();

    System.out.print("Enter second number: ");    

    int input_2 = input.nextInt();
    
    System.out.print("Enter third number: ");      
    
    int input_3 = input.nextInt();
    
    int average = (input_1 + input_2 + input_3)/3 ;
    
    System.out.printf("The average of the result is %d%n" , average);
   
    }
}
