import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeofNumbersFunctionTest{

    @Test
    public void testThatIHaveAListOfNumbersReturnTheRange(){
        int numbers [] = {2, 5, 7, 9, 20};
        int expectedRange = 18;
        int actualRange = RangeofNumbersFunction.getRangeOf(numbers);
        assertEquals(actualRange, expectedRange);
    }


}
