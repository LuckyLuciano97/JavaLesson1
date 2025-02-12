//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex {
    public static void main(String[] args) {
        ispisiPozdrav();
        String s = "Bok";
        ispisi(s);
        int i = 5;
        ispisi(i);
        double[] arr = {1, 5, 8, 9};

        System.out.println(zbroji(8, 5));
        System.out.println("Bez unosa: " + prosjek());
        System.out.println("Unos brojeva: " + prosjek(4, 5.12, 22, 55, 22, 111));
        System.out.println("Unos preko polja: " + prosjek(arr));
       // System.out.println("Palindrom? " + Palindrom.isPalindrom("Neven"));
    }

    private static double prosjek(double... args) {
        if (args.length == 0) {
            return 0.0;
        }
        double p;
        double suma = 0.0;
        for (double arg : args) { //zbrajamo unesene brojeve
            suma += arg;
        }
        p = suma / args.length; //dijelimo vrijednost sume sa ukupnim brojem unešenih brojeva
        return p;
    }

    private static void ispisiPozdrav() {
        System.out.println("Bok bok!");
    }

    private static void ispisi(String s) {
        System.out.println(s);
    }

    //overload metode
    private static void ispisi(int i) {
        System.out.println(i);
    }

    private static int zbroji(int x, int y) {
//        int z = x +y;
//        return z;
        return x + y;
    }



}