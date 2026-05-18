import java.util.Scanner;
public class Welcome{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        //Scanner inputerCollector2 = new Scanner(System.in);
        
        System.out.println("Enter a number:");

        int userInput = inputCollector.nextInt();

        System.out.println("Enter another number:");        

        int userInput2 = inputCollector.nextInt();

        System.out.printf("The product of your result is %d%n", userInput*userInput2);
    }
}



