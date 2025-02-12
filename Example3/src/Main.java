import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] novcanice = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        double iznos = unosIznosa();
        izracunajOstatak(iznos, novcanice);
    }

    public static double unosIznosa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite iznos za vratiti: ");
        double iznos = scanner.nextDouble();
        scanner.close();
        return iznos;
    }

    public static void izracunajOstatak(double iznos, double[] novcanice) {
        System.out.print("Potrebno je vratiti: ");

        for (double iznosNovcanice : novcanice) {
            int brojNovcanica = (int)(iznos / iznosNovcanice);
            if (brojNovcanica > 0) {
                System.out.print(brojNovcanica + "*" + iznosNovcanice + "€ ");
                iznos = iznos % iznosNovcanice;
            }
        }
    }
}