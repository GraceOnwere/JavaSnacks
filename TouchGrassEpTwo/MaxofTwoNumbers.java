public class MaxofTwoNumbers{

    public static void main(String[] args){
    
    int numberOne = 3;

    int numberTwo = 1;

    System.out.println(maxOf(numberOne,numberTwo));
    
    }

    public static int maxOf (int numberOne, int numberTwo){
    
    int largest = numberOne;

    if (numberTwo > numberOne)
    largest = numberTwo;
  
    return largest;
    }
    
}
