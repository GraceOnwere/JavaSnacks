import java.util.Arrays;
public class StandardDeviation{
    
//    public static void main(String []args){
//
//    double [] array = {5,3,4,7};
//
//    double mean = calculateMeanOf(array);
//
//    double [] deviationPoints = calculateDeviationPoints(array,mean);
//
//    double [] squaredDeviationPoints = calculateSquaredDeviationPoints(deviationPoints);
//
//    double variance = calculateVariance(squaredDeviationPoints);
//
//    String standardDeviation = calculateStandardDeviation(variance);
//
//    System.out.println(standardDeviation);
//}

    public static double calculateMeanOf(double [] array){

    double sum = 0;

    for (int count = 0; count < array.length; count++){
        
        sum = sum + array[count];
    }
    
    double mean = sum / array.length;

    return mean;
    }


    public static double [] calculateDeviationPoints(double [] array,double mean){

    double [] newArray = new double [array.length];

    for (int count = 0; count < array.length; count++){
        for (int index = count; index <= count; index++){

            newArray[index] = array[count] - mean;
        }
    }


    return newArray;
    }

    public static double [] calculateSquaredDeviationPoints(double [] array){
    
    double [] newArray = new double [array.length];

    for (int count = 0; count < array.length; count++){
        for (int index = count; index <= count; index++){

            newArray[index] = Math.pow(array[count],2);
        }
    }


    return newArray;    
    
    }

    public static double calculateVariance(double [] array){
    
    double sum = 0;

    for (int count = 0; count < array.length; count++){
        
        sum = sum + array[count];
    }
    
    double variance = sum / array.length;

    return variance;
    }

    public static String calculateStandardDeviation(double variance){
    
    String standardDeviation = String.format("%.3f", Math.pow(variance,0.5));

    return standardDeviation;
    }
}
