import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Vozilo> vozila = new ArrayList<>();

        Automobil a1 = new Automobil("Opel", 50, 5);
        Bicikl b1 = new Bicikl("KTM", 25, "Planinski");

        Automobil a2 = new Automobil("Volkswagen", 60, 4);
        Bicikl b2 = new Bicikl("Trek", 20, "Cestovni");

        Automobil a3 = new Automobil("Škoda", 55, 5);
        Bicikl b3 = new Bicikl("Specialized", 22, "Električni");

        vozila.add(a1);
        vozila.add(b1);
        vozila.add(a2);
        vozila.add(b2);
        vozila.add(a3);
        vozila.add(b3);

        for (Vozilo vozilo : vozila) {
            vozilo.kretanje();
            System.out.println("******************************************************");
        }


    }
}