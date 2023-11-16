package exer2;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

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
