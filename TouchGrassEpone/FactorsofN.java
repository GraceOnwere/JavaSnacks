import java.util.Scanner;
public class FactorsofN {
    public static void main(String[] args){
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int userInput = inputCollector.nextInt();

    int count = 1;

    while(count >= 1){

    if (userInput % count == 0)
    
    System.out.printf("%d is a factor of %d\n", count, userInput);
    
    count++;

    
    
    }
    
    }
}
