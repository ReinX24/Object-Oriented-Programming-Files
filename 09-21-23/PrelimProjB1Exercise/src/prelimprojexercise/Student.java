package prelimprojexercise;

import java.util.Scanner;

public class Student extends Human {

    Scanner userInput = new Scanner(System.in);
    private double prelimGrade, midtermGrade, finalGrade, averageGrade;

    public Student() {
        // Blank constructor
    }

    public Student(String lastName, String firstName, long contactNumber, int age, double weight, double prelimGrade, double midtermGrade, double finalGrade) {
        // super constructor, calls the inherited constructor in the Human class
        // This sets the lastName, firstName, contactNumber, age, and weight
        super(lastName, firstName, contactNumber, age, weight);
        // Attributes that are specifically for our Student class
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public void askStudentDetails() {
        // Calls the askUserDetails in the Human class, this asks for the
        // lastName, firstName, contactNumber, age, and weight
        super.askUserDetails();

        System.out.print("6. Prelim Grade: ");
        double prelimGrade = userInput.nextDouble();
        this.setPrelimGrade(prelimGrade);

        System.out.print("7. Midterm Grade: ");
        double midtermGrade = userInput.nextDouble();
        this.setMidtermGrade(midtermGrade);

        System.out.print("8. Final Grade: ");
        double finalGrade = userInput.nextDouble();
        this.setFinalGrade(finalGrade);
    }

    // Method for evaluating the averageGrade
    // (prelimGrade + midTermGrade + finalGrade) / 3
    public void evaluateStudentGrade() {
        this.averageGrade = (this.getPrelimGrade() + this.getMidtermGrade() + this.getFinalGrade()) / 3;
    }

    public void printStudentDetails() {
        // Calling the printUserDetails in the parent class for printing 
        // lastName, firstName, contactNumber, age, and weight
        super.printUserDetails();
        System.out.println("-----------------------------------------------");
        System.out.println("Your Average Grade is: " + (double) Math.round(this.averageGrade * 100) / 100);
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

}
