import java.util.Scanner;
public class Distance{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first point (x1 y1): ");

    double firstPoint_1 = input.nextDouble();
    double firstPoint_2 = input.nextDouble();

    System.out.print("Enter second point (x2 y2): ");

    double secondPoint_1 = input.nextDouble();
    double secondPoint_2 = input.nextDouble();

    double distance = Math.sqrt( (secondPoint_1 - firstPoint_1) * (secondPoint_1 - firstPoint_1) + (secondPoint_2 - firstPoint_2) * (secondPoint_2 - firstPoint_2) ) ;

    System.out.printf("The distance is %.2f%n" , distance);

    
    }
}
