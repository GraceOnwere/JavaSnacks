import java.util.Scanner;
public class Testing{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter a number:");

        int userInput = inputCollector.nextInt();

        System.out.println("Enter another number:");        

        int userInput2 = inputCollector.nextInt();

        if (userInput > userInput2){
        System.out.printf("The Largest number is %d%n", userInput);
}
        else
        System.out.printf("The Largest number is %d%n", userInput2);

    }
}

