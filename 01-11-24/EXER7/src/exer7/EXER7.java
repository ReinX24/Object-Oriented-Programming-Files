package exer7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXER7 {

    public static void main(String[] args) {

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
