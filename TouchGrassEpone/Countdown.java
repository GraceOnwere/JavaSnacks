import java.util.Scanner;
public class Countdown {
    public static void main(String[] args){
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int userInput = inputCollector.nextInt();


    while(userInput >= 1){
    
    System.out.println("Blast off");
    
    userInput--;

    if (userInput == 0)
    break;
    
    }
    
    }
}
