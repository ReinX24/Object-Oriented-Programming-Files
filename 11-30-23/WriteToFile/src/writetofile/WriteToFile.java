package writetofile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try {
            // FileWriter object to write text or Strings into our file
            FileWriter myWriter = new FileWriter("D:\\OOP - Rein Solis\\11-30-23\\myOOP\\sample.txt");
            myWriter.write("File in Java might be tricky, but it is fun enough!");
            myWriter.write("\nHello World!");
            myWriter.write("\nAnsaya ng silaw silew... yoo yoo yoo yoo yoo...");
            myWriter.write("\n-FileWriter");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
