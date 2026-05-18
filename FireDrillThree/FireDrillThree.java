import java.util.Scanner;
import java.util.Arrays;

public class FireDrillThree {

    public static void main(String[] args){

    Scanner inputCollector = new Scanner (System.in);


    int array [] = new int [10];

   for (int counter = 0; counter < array.length; counter++){ 

    System.out.print("Enter a number: ");

    array [counter] = inputCollector.nextInt();
}
    
    for (int count = 0; count < array.length; count++){

        int arrayVertical = array[count];
        System.out.println(arrayVertical);
        }


    
    for (int count = 0; count < array.length; count++){

        int arrayHorizontal = array[count];
        System.out.print(arrayHorizontal + " ");
        }

    System.out.println();

    System.out.print(arrayOf(array) + " ");

    }


    public static int [] arrayOf (int array []){

    
    for (int count = 2; count < array.length; count+=2){
   
    return System.out.print(array[count] + " ");
    }

    return 0;
}
}
