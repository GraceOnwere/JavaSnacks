public class EquilateralTriangleVolume{

    public static void main(String[] args){
    
    double lengthOfSides = 5;

    double area = (Math.sqrt(3)/4  * (lengthOfSides * lengthOfSides));

    double volume = area * lengthOfSides;

    System.out.println("The volume of the equilateral triangle is " + volume);

    }
}
