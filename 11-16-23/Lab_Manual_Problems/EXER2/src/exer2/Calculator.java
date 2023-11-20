package exer2;

/*
   2. Open a Calculator class, with the followinng requirements:
        a. It has 2 private attributes as firstNumber and secondNumber.
        b. It has a constructor with 2 parameters.
        c. It has 4 regular methods as follows:
 */
public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /*
        * SUM() which computes for the sum of the 2 numbers. And generate the result.
        * DIFFERENCE() which computes for the difference of the 2 numbers. And generate the result.
        * PRODUCT() which computes for the product of the 2 numbers. And generate result.
        * QUOTIENT() which computes for the quotient of the 2 numbers. And generate result.

        NOTE:
        The method SUM returns the value of firstNumber + secondNumber
        The method DIFFERENCE returns the value of firstNumber - secondNumber
        PRODUCT is firstNumber * secondNumber
        QUOTIENT is firstNumber / secondNumber
     */
    public double SUM() {
        return this.firstNumber + this.secondNumber;
    }

    public double DIFFERENCE() {
        return this.firstNumber - this.secondNumber;
    }

    public double PRODUCT() {
        return this.firstNumber * this.secondNumber;
    }

    public double QUOTIENT() {
        return this.firstNumber / this.secondNumber;
    }

}
