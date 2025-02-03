//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println("Broj " + i + " je paran");
            } else {
                System.out.println("Broj " + i + " je neparan");
            }
        }

        char spol = 'Ž';
        if (spol == 'M') {
            System.out.println("Korisnik je muška osoba.");
        } else if (spol == 'Ž') {
            System.out.println("Korisnik je ženska osoba.");
        } else {
            System.out.println("Spol nije prepoznat");
        }


        int ocjena = 3;

        switch (ocjena) {
            case 1:
                System.out.println("Nazalost ocjena je nedovoljan!");
                break;
            case 2:
                System.out.println("Ocjena je dovoljan!");
                break;
            case 3:
                System.out.println("Ocjena je dobar!");
                break;
            case 4:
                System.out.println("Ocjena je vrlo dobar!");
                break;
            case 5:
                System.out.println("Ocjena je odlican!");
                break;
            default:
                System.out.println("Ocjena ne postoji!");
                break;
        }


        int a = 1;
        while (a < 18) {
            System.out.println(a);
            ++a;
        }

        int sum = 0;
        int y = 0;

        do {
            y++;
            sum+=y;
            System.out.println("sum is " + sum);
        } while (y < 20);
    }
}