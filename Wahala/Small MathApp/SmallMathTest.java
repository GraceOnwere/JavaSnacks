import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallMathTest{

    @BeforeEach
    void setup(){
    double numberOne = 2.0 ,numberTwo = 2.0;
    }
    

    @Test
    public void testThatIPerformAdditionOperation(){

    double actual = SmallMath.additionOperation(numberOne,numberTwo);

    double expected = 4.0;

    assertEquals(actual,expected);
    }

    @Test
    public void testThatIPerformSubtractionOperation(){

    double actual = SmallMath.subtractionOperation(numberOne,numberTwo);

    double expected = 0.0;

    assertEquals(actual,expected);
    }


     @Test
    public void testThatIPerformMultiplicationOperation(){

    double actual = SmallMath.multiplicationOperation(numberOne,numberTwo);

    double expected = 4.0;

    assertEquals(actual,expected);
    }

     @Test
    public void testThatIPerformDivisionOperation(){

    double actual = SmallMath.divisionOperation(numberOne,numberTwo);

    double expected = 1.0;

    assertEquals(actual,expected);
    }

     @Test
    public void testThatIPerformZeroDivisionOperation(){

    assertThrows(IllegalArgumentException.class, ()-> SmallMath.divisionOperation(numberOne,numberTwo));
    }
    

}
