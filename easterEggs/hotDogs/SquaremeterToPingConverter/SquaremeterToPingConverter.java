import java.util.Scanner;
public class SquaremeterToPingConverter{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number in square meters: "); 
    
    double number = input.nextInt();
    
    double ping = number * 0.3025;    
        
    System.out.println(number + " square meters is " + ping + " ping");

    }
}
