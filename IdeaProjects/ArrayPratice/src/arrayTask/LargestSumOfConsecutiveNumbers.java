package arrayTask;

import java.util.Arrays;

public class LargestSumOfConsecutiveNumbers {
    public static int[] largestSumOfTwoConsecutiveNumbers(int[] array) {

        int[] newArray = new int[2];

        int sum = 0;
        for (int count = 0; count < array.length - 1; count++) {

            for (int index = count + 1; count < index ; index--) {
                int largestSum = 0;
                largestSum = array[count] + array[index];

                if (largestSum > sum) {
                    sum = largestSum;
                    newArray[0] = array[count];
                    newArray[1] = array[index];

                }

            }
        }
        return newArray;
    }


    void main() {
        System.out.println(Arrays.toString(largestSumOfTwoConsecutiveNumbers(new int[]{13,7,1,90,2})));
    }

}


