import java.util.HashMap;
import java.util.Scanner;

public class EvidencijaPolaznika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Polaznik> polaznici = new HashMap<>();

        int izbor = 0;

        polaznici.put("john.doe@example.com", new Polaznik("John", "Doe", "john@test.com"));
        polaznici.put("jane.doe@example.com", new Polaznik("Jane", "Doe", "jane@test.com"));
        polaznici.put("bob.smith@example.com", new Polaznik("Bob", "Smith", "bob@test.com"));
        polaznici.put("alice.johnson@example.com", new Polaznik("Alice", "Johnson", "alice@test.com"));

        while (izbor != 3) {
            System.out.println("1. Unos novog polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Izlaz");
            System.out.print("Odaberite opciju: ");

            izbor = scanner.nextInt();
            scanner.nextLine();

            if (izbor == 1) {
                // Unos  polaznika
                System.out.print("Unesite ime: ");
                String ime = scanner.nextLine();

                System.out.print("Unesite prezime: ");
                String prezime = scanner.nextLine();

                System.out.print("Unesite email: ");
                String email = scanner.nextLine();

                // Provjera
                if (polaznici.containsKey(email)) {
                    System.out.println("Polaznik već postoji!");
                } else {
                    Polaznik p = new Polaznik(ime, prezime, email);
                    polaznici.put(email, p);
                    System.out.println("Polaznik uspješno dodan!");
                }
            } else if (izbor == 2) {
                // Ispis svih polaznika
                System.out.println("\n-- POPIS POLAZNIKA --");

                if (polaznici.isEmpty()) {
                    System.out.println("Nema unesenih polaznika.");
                } else {
                    for (Polaznik p : polaznici.values()) {
                        p.ispisiPodatke();
                    }
                }
            } else if (izbor == 3) {
                System.out.println("Program završava.");
            } else {
                System.out.println("Nepoznata opcija!");
            }
        }

        scanner.close();
    }
}

/*
Napiši program za evidenciju polaznika na tečaju koji osigurava jedinstvenost e-mail adresa polaznika. Program treba omogućiti unos polaznika i njihovih podataka te provjeriti jesu li e-mail adrese jedinstvene.

* Koristi klasu Polaznik s atributima: ime, prezime i e-mail
* Koristi HashMap<String, Polaznik> za pohranu polaznika, gdje će ključ biti e-mail adresa, a vrijednost objekt klase Polaznik.
* Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.
* Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
* Pri dodavanju novog polaznika, provjeri je li e-mail adresa već prisutna u evidenciji polaznika. Ako je e-mail adresa već prisutna, ispiši odgovarajuću poruku i ne dopusti unos polaznika s istom e-mail adresom.
* Omogući ispis svih polaznika na tečaju nakon unosa.

Što bi trebalo izmijeniti u rješenju ako dodamo novi zahtjev?
* Svi polaznici moraju biti cijelo vrijeme sortirani po emailu uzlazno
 */