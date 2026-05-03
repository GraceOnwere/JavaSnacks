import java.util.Scanner;
public class TaskTwelve{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");

    int input_1 = input.nextInt();

    System.out.print("Enter second number: ");    

    int input_2 = input.nextInt();
    
    
    System.out.printf("The first number is %d%nThe second number is %d%n" , input_1 , input_2);
   
    }
}
