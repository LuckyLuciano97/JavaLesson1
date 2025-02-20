package proizvodi;
/*Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
Nakon prekida unosa, ispiši sve proizvode.
 */
public class Proizvod {
    private String name;
    private double cijena;
    private int qty;

    public Proizvod(String name, double cijena, int qty) {
        this.name = name;
        this.cijena = cijena;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "name='" + name + '\'' +
                ", cijena=" + cijena +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
