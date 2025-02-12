package Ucilica;


import static java.lang.Math.PI;

public class Krug {
    private String naziv;
    private double radius;
    private double obseg;
    private double površina;

    @Override
    public String toString() {
        return "Krug{" +
                "naziv='" + naziv + '\'' +
                ", radius=" + radius +
                ", obseg=" + obseg +
                ", površina=" + površina +
                '}';
    }

    public Krug(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius;
        this.obseg = 2* PI * radius;
        this.površina = PI * Math.pow(radius, 2);
    }

    public void izračunajObsegPovršinu(){
        this.obseg = 2* PI * radius;
        this.površina = PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        izračunajObsegPovršinu();
    }
}
