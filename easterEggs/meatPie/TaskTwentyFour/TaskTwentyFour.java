import java.util.Scanner;
public class TaskTwentyFour{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");

    int input_1 = input.nextInt();

    System.out.print("Enter second number: ");    

    int input_2 = input.nextInt();     
    
    System.out.println("Before Swapping");
    System.out.println("input_1 = " + input_1 + "\n" + "input_2 = " + input_2);
    
    int input_3 = input_1 ; 
    input_1 = input_2 ;
    input_2 = input_3 ;
    
    System.out.println("After Swapping");
    System.out.printf("input_1 = %d%n",input_1);
    System.out.printf("input_2 = %d%n", input_2);
   
    }
}
