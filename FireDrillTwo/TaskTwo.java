import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){

    int score = 1;

    int sum = 0;

    Scanner inputCollector = new Scanner(System.in);

    while(score <= 10){
   
        System.out.print("Enter number: ");
    

        int number = inputCollector.nextInt();    
    
   
        sum +=number;    
    
        score++;
  
    }

    double average =  (double)sum / score ;
        System.out.println("\nThe sum of the numbers is " + sum);
        System.out.println("\nThe average of the numbers is " + average);
}   
}
