import java.util.Scanner;
public class NumberPattern{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    int userInput = inputCollector.nextInt();

    int count = 0;

    for (int rowCounter = 1; rowCounter <= userInput; rowCounter++){
                
        for (int columnCounter = 1; columnCounter <= rowCounter; columnCounter++){
                count++;
                System.out.printf("%-5d ", count);
    }
    System.out.println();
}
    }

}
