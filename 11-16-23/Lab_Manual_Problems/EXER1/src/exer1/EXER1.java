package exer1;

import java.util.Scanner;

public class EXER1 {

    public static void main(String[] args) {

        /*
        EXER1.java
        Open a New Project in Java as EXER1.java (using Procedural Approach) that will generate results of:
        a. addition
        b. subtraction
        c. multiplication
        d. division
        
        When values for the 2 integer numbers as firstNumber and secondNumber is given, respectively.
        
        Consider the I/O Layout shown below:
        Enter First Number: _
        Enter Second Number: _
        The SUM is: ___________
        The DIFFERENCE is: ___________
        The PRODUCT is: ___________
        The QUOTIENT is: ___________
        
        NOTE:
        The method SUM() returns the value of firstNumber + secondNumber
        The method DIFFERENCE() returns the value of firstNumber - secondNumber
        The method PRODUCT() returns the value of firstNumber * secondNumber
        The method QUOTIENT() returns the value of firstNumber / secondNumber
        
         */
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNum = userInput.nextDouble();

        System.out.print("Enter Second Number: ");
        double secondNum = userInput.nextDouble();

        System.out.println("THE SUM is: " + SUM(firstNum, secondNum));
        System.out.println("THE DIFFERENCE is: " + DIFFERENCE(firstNum, secondNum));
        System.out.println("THE PRODUCT is: " + PRODUCT(firstNum, secondNum));
        System.out.println("THE QUOTIENT is: " + QUOTIENT(firstNum, secondNum));

    }

    private static double SUM(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    private static double DIFFERENCE(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    private static double PRODUCT(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    private static double QUOTIENT(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

}
