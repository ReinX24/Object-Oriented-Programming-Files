package filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        try {
            // Creates a file and writes to the file
//            FileWriter fileWriter = fileWriter = new FileWriter("D:\\OOP - Rein Solis\\11-30-23\\myOOP\\sample.txt");
            // When you add true to the second parameter, it appends instead of
            // overwriting the text file contents
            FileWriter fileWriter = fileWriter = new FileWriter("D:\\OOP - Rein Solis\\11-30-23\\myOOP\\sample.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Accepting a String to be stores in our text file
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String userName = userInput.nextLine();

            bufferedWriter.write("Name: " + userName);
            bufferedWriter.newLine();

            /* bufferedWriter.write("Welcome");
            bufferedWriter.newLine();

            bufferedWriter.write("File in Java might be tricky, but it is fun enough!");
            bufferedWriter.newLine();

            bufferedWriter.write("Hello World!");
            bufferedWriter.newLine();

            bufferedWriter.write("Ansaya ng silaw silew... yoo yoo yoo yoo yoo...");
            bufferedWriter.newLine();

            bufferedWriter.write("-Rein Solis");
            bufferedWriter.newLine();
             */
            // Closing our writers
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Successfully wrote to file...");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

}
