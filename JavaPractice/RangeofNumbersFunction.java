public class RangeofNumbersFuction{

    public static int getLargestOf(int array[]){

    int max = array[0];

    for (int counter = 1; counter < array.length; counter++){ 

            if (array[counter] > max )
            max = array[counter];

            
    }

    return max;
    }
}
