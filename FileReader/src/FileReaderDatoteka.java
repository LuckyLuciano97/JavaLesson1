import java.io.*;

public class FileReaderDatoteka {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("filetest.txt");
        File outputFile = new File("kpija.txt");

        //Osiguravamo da se tek čitanja i pisanja zatvore nakon završetka
        try (FileReader ulaz = new FileReader(inputFile); FileWriter izlaz = new FileWriter(outputFile)) {

            int c;
            while ((c = ulaz.read()) != -1) {
                izlaz.write(c);
            }

            // izlaz.close();

        } catch (FileNotFoundException e) {
            System.err.println("Greška: " + e.getMessage());
        }
    }
}