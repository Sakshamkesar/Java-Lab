import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadSimulation {
    public static void main(String[] args) {
        Scanner reader = null;

        try {
            File file = new File("sample.txt"); 
            reader = new Scanner(file);

            System.out.println("Reading file contents:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        
        } finally {
            System.out.println("Closing file...");
            
            if (reader != null) {
                reader.close();
            }
        }
    }
}
