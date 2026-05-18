import java.util.Scanner;
public class AisosaLoop {
    public static void main(String[] args){
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int userInput = inputCollector.nextInt();

    for (int mainLoop = 0; mainLoop < userInput; mainLoop++){

        System.out.println("rows");

            for (int innerLoop = 0; innerLoop < mainLoop; innerLoop++){
    
                System.out.print("*");

    }
}
    }
}
   
