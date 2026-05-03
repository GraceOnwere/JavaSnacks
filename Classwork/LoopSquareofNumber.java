import java.util.Scanner;

public class LoopSquareofNumber {
    public static void main(String[] args){


    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number: ");
    
    int number = inputCollector.nextInt();

  //  int sum = 0;
 
    int extractedDigit;

    //int square , result = 0;
    
    
    while(true){

    extractedDigit = number % 10;
    
    //square = extractedDigit * extractedDigit;

    number = number / 10;

    //result = square  + result;
   
   // square = extractedDigit * extractedDigit;

    System.out.printf("%d\n" ,extractedDigit);

    if (number == 0){
    break;
        }

}     
    
    

    }   
}
