import java.io.*;
import java.util.ArrayList;

public class EvidencijaVozila {
    private ArrayList<Vozilo> vozila;

    public EvidencijaVozila() {
        vozila = new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku(String datoteka) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(datoteka))) {
            for (Vozilo vozilo : vozila) {
                writer.println(vozilo.prikaziPodatke());
            }
        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) {
        try (BufferedReader reader = new BufferedReader(new FileReader(datoteka))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        EvidencijaVozila evidencija = new EvidencijaVozila();

        try {
            Automobil a1 = new Automobil(12345, "Toyota", 2020, 5);
            Automobil a2 = new Automobil(67890, "BMW", 2022, 3);
            Automobil a3 = new Automobil(54321, "Mercedes", 2019, 4);

            Motocikl m1 = new Motocikl(123141, "Suzuki", 2005, "Enduro");
            Motocikl m2 = new Motocikl(987654, "Honda", 2018, "Sport");
            Motocikl m3 = new Motocikl(456789, "Yamaha", 2021, "Cruiser");

            evidencija.dodajVozilo(a1);
            evidencija.dodajVozilo(a2);
            evidencija.dodajVozilo(a3);
            evidencija.dodajVozilo(m1);
            evidencija.dodajVozilo(m2);
            evidencija.dodajVozilo(m3);

            evidencija.spremiPodatkeUDatoteku("vozila.txt");
            System.out.println("Podaci spremljeni u datoteku.");

            System.out.println("\nUčitani podaci iz datoteke:");
            evidencija.ucitajPodatkeIzDatoteke("vozila.txt");

        } catch (NeispravniPodaciException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }
}