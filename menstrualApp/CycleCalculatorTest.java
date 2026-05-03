import org.junit.jupiter.api.Test;

import static org .junit.jupiter.api.Assertions.*;

public class CycleCalculatorTest{

     @Test
    public void testThatIGetTheNumberofDaysInMonth(){

    String month = "August";

    int expectedDays = 31;

    int actualDays = CycleCalculator.getMonthDays(month);

    assertEquals(actualDays,expectedDays);
    
    }

     @Test
    public void testThatIGetTheNextMonth(){

    String month = "December";

    String expectedMonth = "January";

    String actualMonth = CycleCalculator.getNextMonth(month);

    assertEquals(actualMonth,expectedMonth);

    }


     @Test
    public void testThatIGetTheNextPeriod(){

    int startDay = 31;

    String month = "August";

    int cycleLength = 27;

    String expectedNextPeriod = "27 September";

    String actualNextPeriod = CycleCalculator.getNextPeriod(startDay, month, cycleLength);

    assertEquals(actualNextPeriod,expectedNextPeriod);
    
    }

    @Test
    public void testThatIGetOvulationDay(){

    int cycleLength = 27;

    int expectedOvulationDay = 13;

    int actualOvualtionDay = CycleCalculator.getOvulationDay(cycleLength);

    assertEquals(actualOvualtionDay,expectedOvulationDay);

    }

    @Test
    public void testThatIGetFertileStart(){

    int ovulation = 13;

    int expectedFertileStart = 8;

    int actualFertileStart = CycleCalculator.getFertileStart(ovulation);

    assertEquals(actualFertileStart,expectedFertileStart);

    }

     @Test
    public void testThatIGetFertileEnd(){

    int ovulation = 13;

    int expectedFertileEnd = 15;

    int actualFertileEnd = CycleCalculator.getFertileEnd(ovulation);

    assertEquals(actualFertileEnd,expectedFertileEnd);

    }

}
