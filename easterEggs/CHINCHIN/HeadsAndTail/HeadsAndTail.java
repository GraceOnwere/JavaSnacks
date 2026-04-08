import java.util.Random;
import java.util.Scanner;

public class HeadsAndTail{

    public static void main(String[] args){

    Random rand = new Random();
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a guess (Heads or Tail): ");

    String guess = input.nextLine();

    int random = rand.nextInt(2);

    if (random == 0){
    System.out.println("Heads");
    }

        else 
    System.out.println("Tail");
    

       /* else if (guess == random != 0){
    System.out.println("not correct");
    }

    else if (guess == random != 1){
    System.out.println("not correct");
    }
*/
    }
}
