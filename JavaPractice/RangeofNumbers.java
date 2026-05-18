public class RangeofNumbers{

    public static void main(String[] args){

    int maximum [] = {2,5,7,9,20};

    int max = maximum[0];

    int min = maximum[4];

    for (int counter = 0; counter < maximum.length; counter++){ 

            if (maximum[counter] > max )
            max = maximum[counter];

            if (maximum[counter] < min )
            min = maximum[counter];
    }

    int range = max - min;
    
    System.out.printf("The value for the range is %d \n", range);

    }

}
