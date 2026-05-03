import java.util.Scanner;

public class MaximumNumberof{

    public static void main(String...args){ 

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int numberOne = inputCollector.nextInt();

    System.out.print("Enter a number: ");
    int numberTwo = inputCollector.nextInt();

    System.out.print("Enter a number: ");
    int numberThree = inputCollector.nextInt();
    //int numberOne = 2;
    //int numberTwo = 5;
    //int numberThree = 10;

    System.out.println(maximumOf(numberOne,numberTwo,numberThree));
}
 
    public static int maximumOf(int numberOne, int numberTwo, int numberThree){
    
    int largestNumber = numberOne;

    if (numberTwo > numberThree)
        largestNumber = numberTwo;

    else if (numberThree > numberOne)
        largestNumber = numberThree;
    
    return largestNumber;
    }

    

    

}

