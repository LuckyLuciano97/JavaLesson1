package Objekti;

public class Studomat {
    public static void main(String[] args) {
        Studenti student1 = new Studenti("John", "Doe", 1);
        Studenti student2 = new Studenti("Jane", "Doe", 2);



        System.out.println(student1);
        System.out.println(student2);

        student2.setIme("Jana");
        student2.prijaviIspit("Discrete math");
        student1.prijaviIspit("OOP 101");

        System.out.println(student1);
        System.out.println(student2);

        student2.odjaviIspit("Discrete math");

        System.out.println(student2);

    }
}
