public class RangeofNumbersFunction{

    public static int getRangeOf(int array[]){

    int max = array[0];

    int min = array [4];
    for (int counter = 0; counter < array.length; counter++){ 

            if (array[counter] > max )
            max = array[counter];

            if (array[counter] < min )
            min = array[counter];
    }

    int range = max - min;

    return range;
    }
}

