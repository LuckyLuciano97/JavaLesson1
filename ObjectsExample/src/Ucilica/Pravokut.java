package Ucilica;

public class Pravokut {

    private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double obseg;
    private double površina;

    public Pravokut(String naziv, double stranicaA, double stranicaB) {
        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        izračunajObsegPovršinu();
    }

    public void izračunajObsegPovršinu() {
        this.obseg = 2*stranicaA + 2*stranicaB;
        this.površina = stranicaA * stranicaB;
    }

    @Override
    public String toString() {
        return "Pravokut{" +
                "naziv='" + naziv + '\'' +
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
