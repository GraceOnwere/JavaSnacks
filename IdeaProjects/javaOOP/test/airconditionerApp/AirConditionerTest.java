package airconditionerApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void airConditionerIsOff_turnAirConditionerOn(){

        AirConditioner graceAirConditioner = new AirConditioner();
        graceAirConditioner.turnOnAirConditioner();

        boolean isAirConditionerOn = graceAirConditioner.getAirConditionerState();

        assertTrue(isAirConditionerOn);
    }

    @Test
    public void airConditionerIsOn_turnAirConditionerOff(){

        AirConditioner graceAirConditioner = new AirConditioner();
        graceAirConditioner.turnOnAirConditioner();
        graceAirConditioner.turnOffAirConditioner();

        boolean isAirConditionerOff = graceAirConditioner.getAirConditionerState();

        assertFalse(isAirConditionerOff);
    }

    @Test
    public void airConditionerIsOn_increaseAirConditionerTemperature() {

        AirConditioner graceAirConditioner = new AirConditioner();
        graceAirConditioner.turnOnAirConditioner();

        graceAirConditioner.increaseTemperature(31);
        int currentTemperature = graceAirConditioner.getTemperatureState();

        assertEquals(30, currentTemperature);
    }
}



