import java.util.Scanner;
public class TaskTwentySix{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("What is your name?: ");

    String name = input.nextLine();

    System.out.print("How old are you?: ");    

    String age = input.nextLine();
    
    System.out.printf("I am %s and I am %syears old%n", name, age);
   
    }
}
