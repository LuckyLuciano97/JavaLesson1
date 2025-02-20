import zaposlenici.Manager;
import zaposlenici.Programer;
import zaposlenici.Zaposlenik;

public class Main {
    public static void main(String[] args) {
        // Kreiranje objekata
        Zaposlenik z1 = new Manager("Ana", 5000);
        Zaposlenik z2 = new Programer("Marko", 4500);
        Manager m1 = new Manager("Ivan", 5500);

        z1.oZaposleniku();
        // z1.radi();  // Nema pristup jer je referenca tipa Zaposlenik

        z2.oZaposleniku();  // Ima pristup
        // z2.radi();  // Nema pristup jer je referenca tipa Zaposlenik

        m1.oZaposleniku();  // Ima pristup
        m1.radi();  // Ima pristup    }



        ((Programer)z2).radi();

    }
}