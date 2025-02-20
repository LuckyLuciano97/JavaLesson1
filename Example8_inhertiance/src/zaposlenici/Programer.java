package zaposlenici;

public class Programer extends Zaposlenik {
    public Programer(String ime, double placa) {
        super(ime, placa);
    }

    public void radi() {
        System.out.println(ime + " piše kod");
    }
}
