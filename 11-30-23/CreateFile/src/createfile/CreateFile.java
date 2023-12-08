package createfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            // Creating our File object with its file name
            // Specifying the file to go into a specific folder
            File myObj = new File("D:\\OOP - Rein Solis\\11-30-23\\myOOP\\sample.txt");
            // Checks if the file could be created
            if (myObj.createNewFile()) {
                // Prints the file name and the absolute path of the file
                // The file is saved in the project folder
                System.out.println("File created!: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            // Prints if an error occurs
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
