package validation1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation1 {

    public static void main(String[] args) {

        // Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Variables that we will be using for our program
        char tryAgainChoice;
        int userInt;

        // Do while loop that will keep running as long as our tryAgainChoice is
        // not equal to 'N'.
        do {
            try {

                // Ask the user for an integer
                System.out.print("\nEnter an Integer: ");
                userInt = userInput.nextInt();

                // Success message if the input us not an integer.
                System.out.println("\nCorrect Entry!");

            } catch (InputMismatchException e) {

                // Error message if the entered input is not an integer.
                System.out.println("\nWrong Entry!");

            } finally {

                // Ask the user if they want to input another character.
                userInput.nextLine();
                System.out.print("\nTry Again [Y/N]? ");
                
                // Converts the user entered character to uppercase.
                tryAgainChoice = Character.toUpperCase(
                        userInput.next().charAt(0));
            }
        } while (tryAgainChoice != 'N');
        // Loop will keep runnig as long as our tryAgainChoice is not equal 'N'.
        
    }

}
