package exer8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXER8 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int Num1 = 0;
        int Num2 = 0;
        char userChoice = ' ';

        do {

            try {
                System.out.print("Enter First Integer Number: ");
                Num1 = SC.nextInt();
                System.out.println("\nThat is correct!");
            } catch (InputMismatchException ex) {
                System.out.println("\nThat is incorrect!");
                Num1 = 0;
            }

            SC.nextLine();

            try {
                System.out.print("\nEnter Second Integer Number: ");
                Num2 = SC.nextInt();
                System.out.println("\nThat is correct!");
            } catch (InputMismatchException ex) {
                System.out.println("\nThat is incorrect!");
                Num2 = 0;
            } finally {
                if (Num2 == 0) {
                    System.out.println("\nCannot Divide 1st Number " + Num1 + " By 2nd Number " + Num2);
                } else {
                    double Q = Double.valueOf(Num1) / Double.valueOf(Num2);
                    System.out.println("\n1st Num " + Num1 + " Divided By 2nd Num " + Num2 + " IS EQUAL TO " + Q);
                }

                SC.nextLine();
                System.out.print("\nTry Again [Y/N]: ");
                userChoice = Character.toUpperCase(SC.next().charAt(0));
                System.out.println("\n********************\n");
            }

        } while (userChoice != 'N');

    }

}
