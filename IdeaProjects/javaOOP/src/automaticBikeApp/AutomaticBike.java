package automaticBikeApp;

public class AutomaticBike {

    private boolean isBikeOn;
    private int speedState;

    public boolean getBikeState() {
        return isBikeOn;
    }

    public void turnOnBike(){
        isBikeOn = true;
    }

    public void turnOffBike(){
        isBikeOn = false;

    }

    public int getSpeedState() {
        return speedState;
    }

    public void accelerateBike(){

        boolean isSpeedInGearOne = speedState >= 0 && speedState <= 20;
        boolean isSpeedInGearTwo = speedState > 20 && speedState <= 30;
        boolean isSpeedInGearThree = speedState > 30 && speedState <= 40;
        boolean isSpeedInGearFour = speedState > 40;

        if(isBikeOn) {

            if (isSpeedInGearOne) {
                speedState = speedState + 1;
            }

            if (isSpeedInGearTwo) {
                speedState = speedState + 2;
            }

            if (isSpeedInGearThree) {
                speedState = speedState + 3;
            }

            if (isSpeedInGearFour) {
                speedState = speedState + 4;
            }

        }
    }

    public void decelerateBike(){

        boolean isSpeedInGearOne = speedState >= 0 && speedState <= 20;
        boolean isSpeedInGearTwo = speedState >=21 && speedState <= 30;
        boolean isSpeedInGearThree = speedState >= 31 && speedState <= 40;
        boolean isSpeedInGearFour = speedState >= 41;

        if(isBikeOn) {

            if (isSpeedInGearOne) {
                speedState = speedState - 1;
            }

            if (isSpeedInGearTwo) {
                speedState = speedState - 2;
            }

            if (isSpeedInGearThree) {
                speedState = speedState - 3;
            }

            if (isSpeedInGearFour) {
                speedState = speedState - 4;
            }

        }
    }


}

