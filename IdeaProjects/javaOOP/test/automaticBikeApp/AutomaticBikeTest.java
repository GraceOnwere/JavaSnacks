package automaticBikeApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void bikeIsOff_turnBikeOn(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();

        boolean isBikeOn = graceAutoBike.getBikeState();

        assertTrue(isBikeOn);
    }

    @Test
    public void bikeIsOn_turnBikeOff(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();
        graceAutoBike.turnOffBike();

        boolean isBikeOff = graceAutoBike.getBikeState();

        assertFalse(isBikeOff);
    }

    @Test
    public void bikeIsOnAndOnGearOne_acceleratesByOne(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();

        for (int accelerateCount = 0; accelerateCount < 15; accelerateCount++){
            graceAutoBike.accelerateBike();
        }

        graceAutoBike.accelerateBike();

        int speedState = graceAutoBike.getSpeedState();

        assertEquals(16,speedState);
    }

    @Test
    public void bikeIsOnAndOnGearTwo_acceleratesTwice(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();

        for (int accelerateCount = 0; accelerateCount < 26; accelerateCount++){
            graceAutoBike.accelerateBike();
        }

        for (int deccelerateCount = 0; deccelerateCount < 3; deccelerateCount++){
            graceAutoBike.decelerateBike();
        }

        graceAutoBike.accelerateBike();

        int speedState = graceAutoBike.getSpeedState();

        assertEquals(26,speedState);
    }

    @Test
    public void bikeIsOnAndOnGearThree_acceleratesThrice(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();

        for (int accelerateCount = 0; accelerateCount < 30; accelerateCount++){
            graceAutoBike.accelerateBike();
        }

        for (int deccelerateCount = 0; deccelerateCount < 4; deccelerateCount++){
            graceAutoBike.decelerateBike();
        }

       for (int accelerateCount = 0; accelerateCount < 2; accelerateCount++){
           graceAutoBike.accelerateBike();
       }

        graceAutoBike.accelerateBike();

        int speedState = graceAutoBike.getSpeedState();

        assertEquals(38,speedState);
    }

    @Test
    public void bikeIsOnAndOnGearFour_acceleratesFourTimes(){

        AutomaticBike graceAutoBike = new AutomaticBike();
        graceAutoBike.turnOnBike();

        for (int accelerateCount = 0; accelerateCount < 30; accelerateCount++){
            graceAutoBike.accelerateBike();
        }

        for (int deccelerateCount = 0; deccelerateCount < 4; deccelerateCount++){
            graceAutoBike.decelerateBike();
        }

        for (int accelerateCount = 0; accelerateCount < 2; accelerateCount++){
            graceAutoBike.accelerateBike();
        }

        graceAutoBike.accelerateBike();

        int speedState = graceAutoBike.getSpeedState();

        assertEquals(38,speedState);
    }



}
