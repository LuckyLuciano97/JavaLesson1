import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("   J    a   V       V      a");

        System.out.println("   J   a a   v     v      a a");

        System.out.println("J  J  aaaaa   V   V      aaaaa");

        System.out.println(" JJ  a     a    V       a     a");


        draw(10, 10);


        List<Polaznik> polaznici = new ArrayList<>();

        Polaznik polaznik1 = new Polaznik(25, "John", "Doe");
        Polaznik polaznik2 = new Polaznik(19, "Jane", "Doe");
        Polaznik polaznik3 = new Polaznik(21, "Will", "Smith");

        polaznici.add(polaznik1);
        polaznici.add(polaznik2);
        polaznici.add(polaznik3);

        System.out.println("prije");
        for (Polaznik p : polaznici) {
            System.out.println(p);
        }

        Collections.sort(polaznici, new Comparator<Polaznik>() {
            @Override
            public int compare(Polaznik p1, Polaznik p2) {
                return Integer.compare(p1.getDob(), p2.getDob());
            }
        });

        System.out.println("\nposlije");
        for (Polaznik p : polaznici) {
            System.out.println(p);
        }

    }

        public static void draw(int x, int y) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    // paran > zvjezda
                    // neparan >  krug
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("o");
                    }
                }
                System.out.println();
            }
        }
    }
