import java.io.*;
import java.util.*;

public class FileReaderEx {
    public static void main(String[] args) {

    try (FileWriter fw = new FileWriter("names.txt")) {
            fw.write("Pero;Marica;Ivica;Dodo;Ivana");
        } catch (IOException e) {
            e.getStackTrace();
            return;
        }

        List<String> names = new ArrayList<>();

        try (FileReader fr = new FileReader("names.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String i;
            while ((i = br.readLine()) != null) {

                String[] namesAfterSplit = i.split(";");
                Collections.addAll(names, namesAfterSplit);
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            return;
        } catch (IOException e) {
            e.getStackTrace();
            return;
        }

        try {
            System.out.println("Imena iz liste:");
            for (String name : names) {
                System.out.println(name);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}