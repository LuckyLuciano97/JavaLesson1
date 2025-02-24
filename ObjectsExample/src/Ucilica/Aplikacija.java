package Ucilica;

public class Aplikacija {

    public static void main(String[] args) {
        Trokut trokut1 = new Trokut("Trokut 1", 5, 6, 7);
        Trokut trokut2 = new Trokut("Trokut 2", 7, 8, 9);
        Pravokut pravokut1 = new Pravokut("Pravokut 1", 5, 6);
        Pravokut pravokut2 = new Pravokut("Pravokut 2", 10, 4);
        Krug krug1 = new Krug("Krug 1", 4);
        Krug krug2 = new Krug("Krug 2", 7);
        Trokut trokut3 = new Trokut("Trokut 3", 20, 17, 7);
        Pravokut pravokut3 = new Pravokut("Pravokut 3", 9, 11);

        System.out.println(trokut3.površina);


        Ucilica ucilica = new Ucilica("učilica");

        ucilica.dodajLik(trokut1);
        ucilica.dodajLik(trokut2);
        ucilica.dodajLik(pravokut1);
        ucilica.dodajLik(pravokut2);
        ucilica.dodajLik(krug1);
        ucilica.dodajLik(krug2);
        ucilica.dodajLik(trokut3);
        ucilica.dodajLik(pravokut3);

        System.out.println("\nLikovi");
        ucilica.ispišiSveLikove();

        System.out.println("\nSortirani likovi");
        ucilica.ispišiSortiranoPoPovrišni();
    }
}