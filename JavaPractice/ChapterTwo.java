import java.util.Scanner;

public class ChapterTwo{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int userInput = inputCollector.nextInt();

    int result = 0;

    while (userInput != 0){ 

    int extractedDigit = userInput % 10;

    result = result * 10 + extractedDigit;

    userInput = userInput /10;
 
 }
    while (result != 0){

    int extractedDigit = result % 10;

    System.out.print(extractedDigit + " " + " ");

    result = result /10;
 
    }
   
    }

}
