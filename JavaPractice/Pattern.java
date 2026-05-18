import java.util.Scanner;

public class Pattern{

    public static void main(String [] args){ 

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    int userInput = inputCollector.nextInt();

    for (int rowCounter = 1; rowCounter <= userInput; rowCounter++){
        for (int counter = rowCounter; counter <= userInput; counter++)  {
         System.out.print(" ");           
            }          
            for (int count = 1; count <= rowCounter; count++){
        
        

            System.out.print("*");
                    
                    //System.out.println(userInput);
    
            }
    //System.out.println("Row" + rowCounter);
    System.out.println();
    //userInput--;
    }

        }
}                                                                           
