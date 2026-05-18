import java.util.Arrays;

import java.util.Scanner;

public class ReverseArray{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    
    int [] array = new int [10];

    for (int counter = array.length - 1; counter >= 0; counter--){
        
        System.out.print("Enter a number: ");

        int userInput = inputCollector.nextInt();

        array[counter] = userInput;

        }
    String strArray = Arrays.toString(array);

    System.out.println(strArray);

    }
}
