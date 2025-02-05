import java.util.Scanner;

public class Zadatak1i2 {
    public static void main(String[] args) {


        //Zadatak 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");

        String input = sc.nextLine();
        int letterCounter = 0;
        int numberCounter = 0;
        int elseCounter = 0;
        String[] var = input.split("");
        for (String i : var) {
            if (i.matches("[a-zA-Z]")){
                letterCounter++;
            } else if (i.matches("[0-9]")) {
                numberCounter++;
            } else {
                elseCounter++;
            }
        }

        System.out.println("Slova: " + letterCounter);
        System.out.println("Brojevi: " + numberCounter);
        System.out.println("Ostalo: " + elseCounter);

    }

}

