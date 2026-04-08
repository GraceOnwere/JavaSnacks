import java.util.Random;

public class SingleDigitInteger{

    public static void main(String[] args){

    Random rand = new Random();

    int firstNumber = rand.nextInt(10);
    int secondNumber = rand.nextInt(10);

    if (firstNumber > secondNumber){
    System.out.println(firstNumber - secondNumber);
    }
        else if (secondNumber > firstNumber){
    System.out.println(secondNumber - firstNumber);    
    }

        else
        System.out.println(0);
    }
}
