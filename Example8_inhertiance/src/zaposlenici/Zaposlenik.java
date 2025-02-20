package zaposlenici;

public class Zaposlenik {
    protected String ime;
    protected double placa;

    public Zaposlenik(String ime, double placa) {
        this.ime = ime;
        this.placa = placa;
    }

    public void oZaposleniku() {
        System.out.println(ime + " ima plaću " + placa);
    }
}

