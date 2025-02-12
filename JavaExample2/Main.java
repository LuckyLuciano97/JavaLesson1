import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadatak 1
        ispisiZbroj(4, 2);

        // Zadatak 2
        ispisiInfo();

        // Zadatak 3
        izracunajHipotenuzu();
    }

    public static void ispisiZbroj(int a, int b) {
        System.out.printf("Zbroj broja %d + %d = %d\n", a, b, (a + b));
    }

    public static void ispisiInfo() {
        System.out.printf("Luka Đogaš\n\nKaštel\n");
    }

    public static void izracunajHipotenuzu() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Unesi dužinu katete a (cm)");
        double katetaA = scn.nextDouble();

        System.out.println("Unesi dužinu katete b (cm)");
        double katetaB = scn.nextDouble();

        double hipotenuza = Math.sqrt(Math.pow(katetaA, 2) + Math.pow(katetaB, 2));
        System.out.printf("Dužina hipotenuze je %.4f", hipotenuza);
    }
}