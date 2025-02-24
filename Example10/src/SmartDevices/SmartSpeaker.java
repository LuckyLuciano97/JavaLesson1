package SmartDevices;

public class SmartSpeaker extends SmartDevice implements RemoteControllable{
    private int volume;
    private boolean playingMusic;

    public SmartSpeaker(int volume, boolean playingMusic) {
        this.volume = volume;
        this.playingMusic = playingMusic;
    }

    @Override
    public void remoteControl(String command) {

    }

    @Override
    public void performAction() {

    }

    @Override
    public void displayStatus() {
        if (playingMusic == false){
            System.out.println("Music is playing and the volume is set to " + volume);
        } else {
            System.out.println("Music is not playing and the volume is set to " + volume);
        }
    }
}
