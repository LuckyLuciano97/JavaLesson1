import Knjizara.Knjiga;
import Učenik.Učenik;
import proizvodi.Proizvod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Knjiga knjiga1 = new Knjiga("1984", "George Orwell", 15);
        Knjiga knjiga2 = new Knjiga("Art of War", "Sun Tzu", 9.99);


        System.out.println(knjiga1);
        System.out.println(knjiga2);


         Učenik ucenik1;
        ucenik1 = new Učenik("John Doe", 21, new HashMap<>());
        ucenik1.addGrade("matematika", 2);
        ucenik1.addGrade("OOP", 3);
        ucenik1.addGrade("UX dizajn", 4);
        ucenik1.addGrade("UX dizajn", 4);


        System.out.println(ucenik1);
*/
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        String input;
        Scanner scn = new Scanner(System.in);
        System.out.println("Unesi Enter za pokretanje programa");
        input =(scn.nextLine());
        boolean proceed = true;

        do {
            System.out.println("Unesi ime proizvoda");
            String name = scn.nextLine();
            System.out.println("Unesi cijenu proizvoda");
            double cijena = scn.nextDouble();
            System.out.println("Unesi količinu proizvoda");
            int qnty = scn.nextInt();

            proizvodi.add(new Proizvod(name, cijena, qnty));
            System.out.println("Da li zelite unijeti jos jedan proizvod?");
            String response = scn.next();;
         if (response.equals("ne")){
                proceed = false;
            }
        }
        while (proceed);


        for (Proizvod proizvod : proizvodi){
            System.out.println(proizvod);
        }


    }
}