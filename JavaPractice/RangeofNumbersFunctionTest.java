import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeofNumbersFunctionTest{

    @Test
    public void testThatIHaveAListOfNumbersReturnTheLargest(){
        int numbers [] = {2, 5, 7, 9, 20};
        int expectedLargest = 20;
        int actualLargest = RangeofNumbersFunction.getLargestOf(numbers);
        assertEquals(actualLargest, expectedLargest);
    }

}
