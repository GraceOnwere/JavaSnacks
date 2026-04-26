import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BackToSenderTest{

    @Test
    public void testThatTheCollectionrateIsLessthan50percent(){
    //Given
    int deliveryNumber = 25;

    //When
     int expectedWage = BackToSender.calculateWages(deliveryNumber);

    //Check
    int actualWage = 9000;
    assertEquals(actualWage, expectedWage);

    }

    @Test
    public void testThatTheCollectionrateIsBetween50to59percent(){
    //Given
    int deliveryNumber = 50;
    
    //When
     int expectedWage = BackToSender.calculateWages(deliveryNumber);

    //Check
    int actualWage = 15000;
    assertEquals(actualWage, expectedWage);

    }

     @Test
    public void testThatTheCollectionrateIsBetween60to69percent(){
    //Given
    int deliveryNumber = 69;
    
    //When
     int expectedWage = BackToSender.calculateWages(deliveryNumber);

    //Check
    int actualWage = 22250;
    assertEquals(actualWage, expectedWage);

    }

     @Test
    public void testThatTheCollectionrateIsGreaterThanorEqualto70percent(){
    //Given
    int deliveryNumber = 80;
    
    //When
     int expectedWage= BackToSender.calculateWages(deliveryNumber);

    //Check
    int actualWage = 45000;
    assertEquals(actualWage, expectedWage);

    }
}
