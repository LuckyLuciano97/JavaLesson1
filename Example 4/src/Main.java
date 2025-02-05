import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   //hlz znakova - String
        String fakultet = "Fakultet organizacija i informatike Varaždin";
        String[] rijecFakultet = fakultet.split(" ");
        for (String s : rijecFakultet) {
            System.out.println(s);
        }

        List<String> nizi = new ArrayList<>();
        nizi.add("Nizi");

        String recenica = "    Danas je bio hladan dan   ";
        System.out.println("Unos ima znakova: " + recenica.length()); //length - ispisuje broj znakova
        recenica = recenica.trim(); //Ukljanja prazne zankove na pocetku i na kraju
        System.out.println("Broj znakova nakon skracivanja: " + recenica.length());

*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Upišite ime i prezime");
        String fullName = sc.nextLine().trim();
        String [] samoglasniki = {"a","e","i","o","u"};
        String[] imePrezime = fullName.split(" ");


        while (imePrezime[0].length() > 7) {
            System.out.println("Ime sadrži više od 7 znakova, molimo ponovno unesite ime");
            fullName = sc.nextLine().trim();
            imePrezime = fullName.split(" ");
        }

        System.out.println("Upisali ste ime: " + imePrezime[0]);
        System.out.println("Upisali ste prezime: " + imePrezime[1]);


        System.out.println("Upišite grad rođenja");
        String grad = sc.nextLine().trim();
        int counter = 0;
        for (String i : samoglasniki){
            if (grad.contains(i)){
                System.out.println("grad ima samoglasnik " + i);
                counter ++;
            }
        }
        System.out.println("Grad ima " + counter + " samoglasnika");



    }
}