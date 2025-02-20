package zaposlenici;

public class Manager extends Zaposlenik {
    public Manager(String ime, double placa) {
        super(ime, placa);
    }

    public void radi() {
        System.out.println(ime + " upravlja timom");
    }
}
