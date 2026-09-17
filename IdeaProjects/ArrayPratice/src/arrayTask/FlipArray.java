package arrayTask;
import java.util.Arrays;

public class FlipArray {

    public static int [] flipArray(int[] array){

        for(int index = 0; index < array.length-1; index++){
            int sumOfTwoElements = array[index] + array[index + 1];
            if (sumOfTwoElements % 2 == 1){
                int temporaryVariable = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temporaryVariable;
            }
        }
        return array;
    }

    static void main() {
        int [] array = {2,4,3,8,2,1};
        System.out.println(Arrays.toString(flipArray(array)));
    }
}
