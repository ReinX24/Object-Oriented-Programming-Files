package io_streaming1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IO_STREAMING1 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int userChoice = 0;
        File myFile = new File("sampleko.txt");

        System.out.println("<<< FILE MANIPULATION MENU >>>");
        System.out.println("");
        System.out.println("1] Create a File --- sampleko.txt");
        System.out.println("2] Write Data in the File --- sampleko.txt");
        System.out.println("3] Read Data in the File --- sampleko.txt");
        System.out.println("4] Delete the File --- sampleko.txt");
        System.out.println("");
        System.out.print("Ano Pipiliin Mo [1/2/3/4]? ");
        userChoice = SC.nextInt();

        SC.nextLine();

        System.out.println("\n********************\n");

        switch (userChoice) {

            case 1: 
                try {
                // Write a file and print its contents
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                    System.out.println("Absolute path: " + myFile.getAbsolutePath());
                }
            } catch (IOException ex) {
                System.out.println("An error occurred.");
                ex.printStackTrace();
            }
            break;

            case 2:
                try {
                // Write data to our file
                System.out.println("Enter your Last Name: ");
                String lastName = SC.nextLine();

                System.out.println("Enter your First Name: ");
                String firstName = SC.nextLine();

                FileWriter myWriter = new FileWriter(myFile, true);

                myWriter.write(lastName + ", " + firstName + "\n");

                myWriter.close();

                System.out.println("Successfully wrote to the file.");
            } catch (IOException ex) {
                System.out.println("An error occurred.");
                ex.printStackTrace();
            }
            break;

            case 3:
            try {
                // Reading the data in our file
                Scanner myReader = new Scanner(myFile);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("An error occurred. Kasi na-DELETE na ang file kanina.");
            }
            break;

            case 4:
                // Deleting our file

                System.out.print("Sure ka, mai ERASE lahat ng data sa File [Y/N]? ");
                char deleteChoice = Character.toUpperCase(SC.next().charAt(0));
                if (deleteChoice == 'Y') {
                    myFile.delete();
                }
                break;

        }

    }

}
