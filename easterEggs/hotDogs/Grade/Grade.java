import java.util.Scanner;
public class Grade{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number (0-100): ");  

    double number = input.nextDouble();
    
    if (number >= 90){
    System.out.println("A (90-100)"); 
    }

    else if (number >= 80){
    System.out.println("B (80-89)"); 
    }

    else if (number >= 70){
    System.out.println("C (70-79)"); 
    }

    else if (number >= 60){
    System.out.println("D (60-69)"); 
    }

    else if (number <60){
    System.out.println("F (below 60)"); 
    }
   // else 
    //System.out.println("The number is not divisible by 2,3,5 or 7");

}
    }
