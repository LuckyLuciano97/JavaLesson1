package Ucilica;

import static java.lang.Math.PI;

public class Krug extends GeoLik {
    private double radius;

    public Krug(String naziv, double radius) {
        super(naziv);
        this.radius = radius;
        izračunajObsegPovršinu();
    }

    public void izračunajObsegPovršinu(){
        this.obseg = 2 * PI * radius;
        this.površina = PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Krug{" +
                "naziv='" + getNaziv() + '\'' +
                ", radius=" + radius +
                ", obseg=" + obseg +
                ", površina=" + površina +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        izračunajObsegPovršinu();
    }
}