package arrayTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlipArrayTest {

    @Test
    public void testFlipArray(){

       int [] array = {2,4,3,8,2,1};

       int [] flippedArray =  FlipArray.flipArray(array);

       assertArrayEquals(array,flippedArray);
    }
}
