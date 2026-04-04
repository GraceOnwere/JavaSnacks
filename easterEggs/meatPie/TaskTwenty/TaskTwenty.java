import java.util.Scanner;
public class TaskTwenty{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("What is the length: ");

    int input_1 = input.nextInt();

    System.out.print("What is the width: ");    

    int input_2 = input.nextInt();
        
    
    int area = input_1 * input_2  ;
    
    System.out.printf("The area of the result is %d%n" , area);
   
    }
}
