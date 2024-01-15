package exer2;

import java.util.Scanner;

public class EXER2 {

    public static void main(String[] args) {

        /*
        EXER2.java
        1. Open a New Project in Java as EXER2.java (using OOP Approach) that will generate the given I/O Layout.
         */
 /*
        3. The main program will have the following details:
        * import the Scanner class
        * Instantiate the Scanner class as SC.
        * Display and Accept values as shown in the INPUT Layout.
        * Instantiate the Calculator class as myCalc along with the entered values as parameters.
        * Call the methods as shown in the OUTPUT Layout.
        
        4. Consider the I/O Layout shown below:
        Enter First Number: _
        Enter Second Number: _
        The SUM is: ___________
        The DIFFERENCE is: ___________
        The PRODUCT is: ___________
        The QUOTIENT is: ___________
         */
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNum = SC.nextDouble();

        System.out.print("Enter Second Number: ");
        double secondNum = SC.nextDouble();

        Calculator myCalc = new Calculator(firstNum, secondNum);

        System.out.println("THE SUM is: " + myCalc.SUM());
        System.out.println("THE DIFFERENCE is: " + myCalc.DIFFERENCE());
        System.out.println("THE PRODUCT is: " + myCalc.PRODUCT());
        System.out.println("THE QUOTIENT is: " + myCalc.QUOTIENT());

    }

}
