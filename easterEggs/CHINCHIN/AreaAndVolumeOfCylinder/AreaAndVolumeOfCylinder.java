import java.util.Scanner;
public class AreaAndVolumeOfCylinder{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of a cylinder: ");  

    double radius = input.nextDouble();

    System.out.print("Enter the height of a cylinder: "); 

    double height = input.nextDouble();

    double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));

    double volume = Math.PI * Math.pow(radius,2) * height ;

    System.out.println("Area of the cylinder is " + area + "\n" + "Volume of the cylinder is " + volume);
    }
}
