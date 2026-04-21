import java.util.Scanner;

public class MajorNameDisplay {
    public static void main(String[] args){


    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a letter: ");

    String inputOne = inputCollector.nextLine();

    System.out.print("Enter a number: ");
    
    String inputTwo = inputCollector.nextLine();

    switch (inputOne){

    case "I":
    System.out.println("Your Major name is Information Management");
    break;

    case "C":
    System.out.println("Your Major name is Computer Science");
    break;

    case "A":
    System.out.println("Your Major name is Accounting");
    break;

    default:
    System.out.println("Sorry enter another letter");
}

    switch (inputTwo){

    case "1":
    System.out.println("You're in your Freshman year");
    break;

    case "2":
    System.out.println("You're in your Sophomore year");
    break;

    case "3":
    System.out.println("You're in your Junior year");
    break;

    case "4":
    System.out.println("You're in your Senior year");
    break;

    default:
    System.out.println("Sorry enter another number");
}

    }
}

