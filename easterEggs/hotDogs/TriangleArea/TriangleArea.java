import java.util.Scanner;
public class TriangleArea{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first point (x1 y1): ");

    double firstPoint_1 = input.nextDouble();
    double firstPoint_2 = input.nextDouble();

    System.out.print("Enter second point (x2 y2): ");

    double secondPoint_1 = input.nextDouble();
    double secondPoint_2 = input.nextDouble();

    System.out.print("Enter third point (x3 y3): ");

    double thirdPoint_1 = input.nextDouble();
    double thirdPoint_2 = input.nextDouble();

    double side_1 = Math.sqrt( (secondPoint_1 - firstPoint_1) * (secondPoint_1 - firstPoint_1) + (secondPoint_2 - firstPoint_2) * (secondPoint_2 - firstPoint_2) ) ;

    double side_2 = Math.sqrt( (thirdPoint_1 - secondPoint_1) * (thirdPoint_1 - secondPoint_1) + (thirdPoint_2 - secondPoint_2) * (thirdPoint_2 - secondPoint_2) ) ;

    double side_3 = Math.sqrt( (firstPoint_1 - thirdPoint_1) * (firstPoint_1 - thirdPoint_1) + (firstPoint_2 - thirdPoint_2) * (firstPoint_2 - thirdPoint_2) ) ;

    double s = (side_1 + side_2 + side_3)/ 2 ;

    double area = Math.sqrt( s * (s - side_1)  *  (s - side_2) * (s - side_3) ) ;

    
    System.out.printf("The area of the triangle is %.2f%n" , area);

    
    }
}
