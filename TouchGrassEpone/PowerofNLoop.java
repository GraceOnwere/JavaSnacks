import java.util.Scanner;
public class PowerofNLoop {
    public static void main(String[] args){
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int number = inputCollector.nextInt();

    
    for(int count = 1; count >= number; count++){
    
         double power = Math.pow(2,count) ;
    
    
    System.out.printf("2 raised to power %d = %.1f\n" , count,power);
    //number--;
    //if (number == -1)
    //break;
        }


    }
}
