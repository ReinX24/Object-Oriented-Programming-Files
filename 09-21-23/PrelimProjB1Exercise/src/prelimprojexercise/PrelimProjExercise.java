package prelimprojexercise;

import java.util.Scanner;

public class PrelimProjExercise {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Prints the menu that asks the user if they want to create a Human,
        // Student, or an Employee
        System.out.println("<<< MENU >>>");
        System.out.println("[1] Human");
        System.out.println("[2] Student");
        System.out.println("[3] Employee");
        System.out.print("> ");
        int userChoice = userInput.nextInt();

        // Using the switch case statement to create our chosen object
        switch (userChoice) {

            // For creating a Human object
            case 1:
                Human userHuman = new Human();
                userHuman.askUserDetails();
                userHuman.printUserDetails();
                break;
             
            // For creating a Student object
            case 2:
                Student userStudent = new Student();
                userStudent.askStudentDetails();
                userStudent.evaluateStudentGrade();
                userStudent.printUserDetails();
                break;
                
            // For creating a Employee object
            case 3:
                Employee userEmployee = new Employee();
                userEmployee.askEmployeeDetails();
                userEmployee.calculateGrossSalary();
                userEmployee.calculateTotalDeductions();
                userEmployee.calculateNetSalary();
                userEmployee.printEmployeeDetails();
                break;

            // If the chosen choice does not exits
            default:
                System.out.println("Choice does not exist!");
                break;

        }

    }

}
