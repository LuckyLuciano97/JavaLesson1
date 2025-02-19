public abstract class Vozilo {
    private String tip;
    private double speed = 0;


    public Vozilo(String tip, double speed) {
        this.tip = tip;
        this.speed = speed;
    }

    public abstract void kretanje();

    public String getTip() {
        return tip;
    }

    public double getSpeed() {
        return speed;
    }
}
