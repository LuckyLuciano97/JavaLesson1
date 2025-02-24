package Ucilica;

public class Pravokut extends GeoLik {

    private double stranicaA;
    private double stranicaB;

    public Pravokut(String naziv, double stranicaA, double stranicaB) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        izračunajObsegPovršinu();
    }

    @Override
    public void izračunajObsegPovršinu() {
        this.obseg = 2 * stranicaA + 2 * stranicaB;
        this.površina = stranicaA * stranicaB;
    }

    @Override
    public String toString() {
        return "Pravokut{" +
                "naziv='" + getNaziv() + '\'' +
                ", stranicaA=" + stranicaA +
                ", stranicaB=" + stranicaB +
                ", obseg=" + obseg +
                ", površina=" + površina +
                '}';
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
        izračunajObsegPovršinu();
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
        izračunajObsegPovršinu();
    }
}