package SmartDevices;

public abstract class SmartDevice {

    public abstract void performAction();
    public abstract void displayStatus();

    public void updateFirmware(String version){
        System.out.println("Firmware has been updated to " + version);
    }

}
