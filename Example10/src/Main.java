import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList<Knjiga> knjige = new ArrayList<>();

        Knjiga k1 = new Knjiga("1984", false);
        Knjiga k2 = new Knjiga("Art of War", false);
        Knjiga k3 = new Knjiga("The Republic", true);
        Knjiga k4 = new Knjiga("The Great Gatsby", false);

        Collections.addAll(knjige, k1, k2, k3, k4);

        System.out.println("-----");
        for (Knjiga knjiga : knjige){
           System.out.println(knjiga);
        }

        k1.posudiKnjigu();
        k2.posudiKnjigu();


        System.out.println("-----");
        for (Knjiga knjiga : knjige){
            System.out.println(knjiga);

        }

        k1.vratiKnjigu();

        System.out.println("-----");
        for (Knjiga knjiga : knjige){
            System.out.println(knjiga);

        }    }
}