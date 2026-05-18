import java.util.Scanner;
public class SwitchCasePractice{

    public static void main(String[] args){

    int counter = 1;

    System.out.print("Enter a number (1-3): ");
    Scanner inputCollector = new Scanner(System.in);
    
    while (counter <= 3 ){

    int choice = inputCollector.nextInt();
    
    //inputCollector.hasNext()

    switch (choice){ 

    case 1:
    System.out.println("Coke");
    break;

    case 2:
    System.out.println("Fanta");
    break;

    case 3:
    System.out.println("Water");
    break;

    default:
    System.out.println("Invalid selection");
    

    }
    
    counter++ ;

    }


    }

}
