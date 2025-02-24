package SmartDevices;

public class SmartThermostat extends SmartDevice implements RemoteControllable{
    private int temperature;
    private boolean isTurnedOn;

    public SmartThermostat(int brightness, boolean isTurnedOn) {
        this.temperature = brightness;
        this.isTurnedOn = isTurnedOn;
    }

    @Override
    public void remoteControl(String command) {

    }

    @Override
    public void performAction() {

    }

    @Override
    public void displayStatus() {

    }
}
