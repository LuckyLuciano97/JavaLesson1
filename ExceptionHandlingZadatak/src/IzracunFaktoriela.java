import java.util.Scanner;

public class IzracunFaktoriela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ispravniUnos = false;
        int broj = 0;

        while (!ispravniUnos) {
            try {
                System.out.println("Unesi broj");
                broj = Integer.parseInt(scanner.nextLine());

                if (broj < 0) {
                    System.out.println("Error. Unestite broj veći od 0.");
                    continue;
                }

                ispravniUnos = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Potrebno je unijeti broj");
            }
        }

        try {
            long faktorijel = izracunajFaktorijel(broj);
            System.out.println("Faktorijel broja " + broj + " je: " + faktorijel);
        } catch (ArithmeticException e) {
            System.out.println("Greška pri računanju: " + e.getMessage());
        }

        scanner.close();
    }

    private static long izracunajFaktorijel(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            long rezultat = 1;
            for (int i = 2; i <= n; i++) {
                rezultat *= i;

                if (rezultat < 0) {
                    throw new ArithmeticException("Prevelik broj. Molimo undesite manji broj");
                }
            }
            return rezultat;
        }
    }
}