import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testThatCalculateMeanFunctionReturnsMean(){
    
    double [] array = {5,3,4,7};

    double expectedMean = 4.75;

    double actual = StandardDeviation.calculateMeanOf(array);

    assertEquals(actual,expectedMean);
    }


    @Test
    public void testThatICalculateTheDeviationOfEachPointFromTheMean(){
    
    double [] array = {5,3,4,7};

    double mean = 4.75;

    double [] expectedDeviationPoints = {0.25,-1.75,-0.75,2.25};

    double [] actual = StandardDeviation.calculateDeviationPoints(array, mean);

    assertArrayEquals(actual,expectedDeviationPoints);

    }

    @Test
    public void testThatICalculateTheSquareOfEachDeviationPointFromTheMean(){
    
    double [] array = {0.25,-1.75,-0.75,2.25};

    double [] expectedSquaredDeviationPoints = {0.0625,3.0625,0.5625,5.0625};

    double [] actual = StandardDeviation.calculateSquaredDeviationPoints(array);

    assertArrayEquals(actual,expectedSquaredDeviationPoints);

    }

    @Test 
    public void testThatICalculateTheVariance(){
    
    double [] array = {0.0625,3.0625,0.5625,5.0625};

    double expectedVariance = 2.1875;

    double actual = StandardDeviation.calculateVariance(array);

    assertEquals(actual,expectedVariance);

    }

    @Test
    public void testThatICalculateTheStandardDeviation(){
    
    double expectedVariance = 2.1875;

    String expectedStandardDeviation = "1.479";

    String actual = StandardDeviation.calculateStandardDeviation(expectedVariance);

    assertEquals(actual,expectedStandardDeviation);

    }


}
