import java.util.Scanner;

public class HiFiveDisplay{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: "); 

    int integer = input.nextInt();

    if (integer % 5 == 0){
    System.out.println("HiFive");
    }

    else if (integer % 2== 0){
    System.out.println("HiEven");  
    }
        else 
    System.out.println("Not a multiple of 2 or 5");

    }
}
