package Ucilica;

public abstract class GeoLik implements Comparable<GeoLik> {
    private String naziv;
    protected double površina;
    protected double obseg;

    public GeoLik(String naziv) {
        this.naziv = naziv;
    }

    public abstract void izračunajObsegPovršinu();

    public String getNaziv() {
        return naziv;
    }

    public double getPovršina() {
        return površina;
    }

    public double getObseg() {
        return obseg;
    }

    @Override
    public int compareTo(GeoLik o) {
        return Double.compare(this.površina, o.površina);
    }
}