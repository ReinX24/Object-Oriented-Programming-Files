package exer8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXER8 {

    public static void main(String[] args) {

        /* 
        EXER8.java
        Write a Java program to generate the following requirements.
        1. Open a New Project in Java as EXER8.java (main program).
        2. Generate the given I/O Layout using try-catch block for the 1st Integer Number.
        3. Then use try-catch-finally for the 2nd Integer Number. Wherein the finally block, test if the 2nd Number
        is 0, if yes, output:
        Cannot Divide 1st Number, By 2nd Number.
        Otherwise:
        Compute for Q which is the quotient of Num1/Num2.
        Then display the message:
        “1st Num "+Num1+" Divided By 2nd Num "+Num2+" IS EQUAL TO "+Q
        4. Place the try-catch and try-catch-finally blocks inside a do-while loop statement.
        5. Convert any response for Try Again [Y/N] in UpperCase format.
         */
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
