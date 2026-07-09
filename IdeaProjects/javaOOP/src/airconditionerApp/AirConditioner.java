package airconditionerApp;

public class AirConditioner {

    private boolean isAirConditionerOn;
    private boolean powerOn;
    private int currentTemperature;

    public boolean getAirConditionerState() {
        return isAirConditionerOn;
    }

    public void turnOnAirConditioner(){
        if(!isAirConditionerOn){
            powerOn = true;
            isAirConditionerOn = true;
        }
    }

    public void turnOffAirConditioner(){
        if(isAirConditionerOn){
            powerOn = false;
            isAirConditionerOn = false;
        }
    }

    public int getTemperatureState() {
        if (isAirConditionerOn)
            return currentTemperature;
        return currentTemperature;
    }

    public void increaseTemperature(int temperature){

        if (isAirConditionerOn){
            boolean temperatureIsValid = temperature > 0;

            if (temperatureIsValid){
                if (temperature > 30)
                    currentTemperature = 30;
                else currentTemperature = currentTemperature + temperature;
            }
        }

    }

    public void decreaseTemperature(int temperature){

        if (isAirConditionerOn){
            boolean temperatureIsValid = temperature > 0;

            if (temperatureIsValid){
                if(temperature < 16)
                    currentTemperature = 16;
                else currentTemperature = currentTemperature - temperature;
            }
        }

    }
}
