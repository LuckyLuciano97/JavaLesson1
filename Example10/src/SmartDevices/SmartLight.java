package SmartDevices;

public class SmartLight extends SmartDevice implements RemoteControllable{
    private int brightness;
    private boolean isTurnedOn;

    public SmartLight(int brightness, boolean isTurnedOn) {
        this.brightness = brightness;
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
