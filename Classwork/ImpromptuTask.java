import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){


    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number: ");
    
    int number = inputCollector.nextInt();

    int sum = 0;
 
    int extractedDigit;
    
    
    while(true){

    extractedDigit = number % 10;
    
   number = number / 10;
   
    sum +=extractedDigit;

    if (number == 0){
    System.out.println("\nThe sum of the numbers is " + sum);
    break;
        }
   }     
    
    

    }   
}
