import java.util.Arrays;

import java.util.Scanner;

public class TaskOnePratice{


    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
    
    //int [] array = {1,2,3,4,5,6,7,8,9,10};    
   // System.out.println(Arrays.toString(reverseArray()));

    System.out.println(Arrays.toString(TaskTwo(TaskOne(inputCollector))));

    

   // System.out.println(Arrays.toString(reverseArray(collectNumbers(array))));

}

    public static int[] TaskOne( Scanner numbers){

    int [] array = new int [10];

        for (int counter = 0; counter <= array.length - 1; ){

            array[counter] = numbers.nextInt();

            counter++;
            }
        return array;
    }
    
    public static int[] TaskTwo(int [] numbers){

    int counter = 0;
    
    int [] newArray = new int [10];

    for (int count = newArray.length - 1; count >= 0; count--){

       newArray[count] = numbers[counter];
        counter++;
        }
    return newArray;
    }

    public static int[] TaskThree(int [] numbers){

    //int counter 0;

    int [] newArray = new int[10];

    
    }
    
}

