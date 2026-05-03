import java.util.Scanner;
public class TaskTwo{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you?: ");

    int input_1 = input.nextInt();

    System.out.printf("You are %dyears old.%n" , input_1);
   
    }
}
