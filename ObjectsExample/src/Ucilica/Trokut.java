package Ucilica;

public class Trokut extends GeoLik {

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        izračunajObsegPovršinu();
    }

    @Override
    public void izračunajObsegPovršinu(){
        this.obseg = stranicaA + stranicaB + stranicaC;
        double semi = obseg / 2;
        this.površina = Math.sqrt((semi * (semi - stranicaA) * (semi - stranicaB) * (semi - stranicaC)));
    }

    @Override
    public String toString() {
        return "Trokut{" +
                "naziv='" + getNaziv() + '\'' +
                ", stranicaA=" + stranicaA +
                ", stranicaB=" + stranicaB +
                ", stranicaC=" + stranicaC +
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

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
        izračunajObsegPovršinu();
    }
}