import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            File file = new File("filetest.txt");
            FileReader reader = new FileReader(file);
            int i;
            while((i = reader.read()) !=  -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}