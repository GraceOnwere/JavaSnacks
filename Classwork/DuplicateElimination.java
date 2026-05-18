import java.util.Arrays; 

import java.util.Scanner;

public class DuplicateElimination{

    public static void main(String[] args){ 

    Scanner inputCollector = new Scanner(System.in);

    int [] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    for (int counter = 0; counter <= array.length - 1; counter++){

        System.out.print("Enter a number (10-100): ");

        int userInput = inputCollector.nextInt();

        if (userInput >= 10 && userInput <= 100){
        
            array[counter] = userInput;

        } 

        else {
        
             System.out.print("Enter a number (10-100): ");

             userInput = inputCollector.nextInt();

             array[counter] = userInput;


        }

//        for (int count = 0; count <= array.length -1; count++){
//
//            if array[count] 
//        }
//        
    }
    String strArray = Arrays.toString(array);

    System.out.println(strArray);
    }
}
