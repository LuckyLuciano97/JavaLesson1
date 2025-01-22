import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// Zadatak 1 ///

        int a = 4;
        int b = 2;

        System.out.printf("Zbroj broja %d + %d = %d\n", a, b, (a + b));

        /// Zadatak 2 ///

        System.out.printf("Luka Đogaš\n\nKaštel\n");

        /// Zadatak 3 ///

        Scanner scn = new Scanner(System.in);
        System.out.println("Unesi dužinu katete a");
        double katetaA = scn.nextDouble();

        System.out.println("Unesi dužinu katete b");
        double katetaB = scn.nextDouble();

        double hipotenuza = (Math.sqrt(Math.pow(katetaA, 2) + Math.pow(katetaB, 2)));
        System.out.println("Dužina hipotenuze je " + hipotenuza);


    }
}