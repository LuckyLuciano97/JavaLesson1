class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String tip, double speed, int brojVrata) {
        super(tip, speed);
        this.brojVrata = brojVrata;
    }

    @Override
    public void kretanje() {
    System.out.println("Automobil "+ this.getTip() + ", sa " + this.brojVrata + " vrata se kreće brzinom " + this.getSpeed() + " km/h.");
    }
}
