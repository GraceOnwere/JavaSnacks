import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BrainBreakTest{

    @Test
    public void testThatNumberIsEven(){
    
    int number = 6;
    boolean actual = BrainBreak.isEven(number);
    boolean expected = true;
    assertEquals(actual,expected);
    }

}
