import java.util.Scanner;

public class StatusDeterminat {

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your name: ");

    String userInput = inputCollector.nextLine();

    System.out.println("Hello, "+ userInput);



    System.out.print("Enter your name: ");

    String userInputTwo = inputCollector.nextLine();

    System.out.print("Enter your age: ");

    int userInputThree = inputCollector.nextInt();

    if (userInputThree < 18){
    System.out.println(userInputTwo + " is a child");
}
    else if (userInputThree >18){
    System.out.println(userInputTwo + " is an adult");
    }
   
    else if(userInputThree == 18)
    System.out.println(userInputTwo +" is an adult");

    }


}
