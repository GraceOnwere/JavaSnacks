import java.util.Scanner;

    public class StarsPatternOne{
    
        public static void main(String[] args){

            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter number of rows: ");

            int userInput = inputCollector.nextInt();

            for (int rowCounter = 1; rowCounter <= userInput; rowCounter++){
                for(int spaceCounter = rowCounter; spaceCounter <= userInput - 1; spaceCounter++){
                    System.out.print(" ");
                }
                for (int columnCounter = 1; columnCounter <= rowCounter; columnCounter++){
                    System.out.print("*");
                }
                
                System.out.println();
            }

    }

}
