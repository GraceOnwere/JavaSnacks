import java.util.Scanner;
public class OmoJava {
    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);

        int score = 1;

        int sum = 0;

        while(score <= 10){
   
            System.out.println("Enter number: ");
    
            int number = inputCollector.nextInt();

    
            sum = sum + score;
            score++;
}
    System.out.println(sum);
    
}
}
