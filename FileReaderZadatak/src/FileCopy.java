import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite putanju do originalne datoteke:");
        String src = scanner.nextLine();
        File sourceFile = new File(src);

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Greška: Originalna datoteka ne postoji!");
            scanner.close();
            return;
        }

        // Ask user for destination file path
        System.out.println("Unesite naziv kopirane datoteke:");
        String destinationPath = scanner.nextLine();
        File destinationFile = new File(destinationPath);

        // Copy file byte by byte
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;

            // Read from source and write to destination
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("Datoteka uspješno kopirana.");

            // Check if file was successfully copied
            if (destinationFile.exists()) {
                // Ask if user wants to delete the copy
                System.out.println("Želite li izbrisati kopiju datoteke (D/N)?");
                String deleteChoice = scanner.nextLine();

                if (deleteChoice.equalsIgnoreCase("D")) {
                    if (destinationFile.delete()) {
                        System.out.println("Datoteka " + destinationPath + " izbrisana");
                    } else {
                        System.out.println("Nije moguće izbrisati datoteku " + destinationPath);
                    }
                } else {
                    // Try to open the file in File Explorer
                    try {
                        if (Desktop.isDesktopSupported()) {
                            Desktop desktop = Desktop.getDesktop();
                            desktop.open(destinationFile.getParentFile());
                        } else {
                            System.out.println("Otvaranje kroz File Explorer nije podržano na ovom sustavu.");
                        }
                    } catch (IOException e) {
                        System.out.println("Nije moguće otvoriti File Explorer: " + e.getMessage());
                    }
                }
            } else {
                System.out.println("Kopiranje nije uspjelo, odredišna datoteka ne postoji.");
            }

        } catch (IOException e) {
            System.out.println("Greška prilikom kopiranja datoteke: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}