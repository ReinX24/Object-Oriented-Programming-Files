package exer7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXER7 {

    public static void main(String[] args) {

        /*
        EXER7.java
        Write a Java program to generate the following requirements.
        1. Open a New Project in Java as EXER7.java (main program).
        2. Generate the given I/O Layout using try-catch-finally block.
        3. Place the try-catch-finally block inside a do-while loop statement.
        4. Convert any response for Try Again [Y/N] in UpperCase format.
         */
        Scanner SC = new Scanner(System.in);
        int userNum;
        char userChoice = ' ';

        do {
            try {

                System.out.print("Enter an Integer Number: ");
                userNum = SC.nextInt();
                System.out.println("\nThat is correct!");

            } catch (InputMismatchException ex) {

                System.out.println("\nThat is incorrect.");

            } finally {

                SC.nextLine();
                System.out.print("\nTry Again [Y/N]: ");
                userChoice = Character.toUpperCase(SC.next().charAt(0));
                System.out.println("\n********************\n");

            }
        } while (userChoice != 'N');
    }

}
