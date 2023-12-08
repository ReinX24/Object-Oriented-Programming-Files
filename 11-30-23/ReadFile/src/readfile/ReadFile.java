package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            // Using a File and Scanner object to read the contents of our file
            File myObj = new File("D:\\OOP - Rein Solis\\11-30-23\\myOOP\\sample.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
