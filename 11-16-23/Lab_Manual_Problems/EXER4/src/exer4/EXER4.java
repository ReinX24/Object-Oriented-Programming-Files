package exer4;

import java.util.Scanner;

public class EXER4 {

    public static void main(String[] args) {
        /*
        Semester: 1st Sem Academic Year: 2023-20204
        EXER4.java
        
        1. Open a New Project in Java as EXER4.java.
        
        2. Open a New Java class as PERSON. Copy & paste and MODIFY the attributes in EXER3.java.
        • It has a sexValue() method which tests for the sex code and output the message sex as either
        "Male" or "Female".
        • It has a a TaxCalc() method which computes for the tax as 10% of the salary.
        • It has a Results() method which output the following details:
        Hi, <name>.
        You're doing good with your salary at <salary>.
        And your prevailing Income Tax at 10% of your Gross Salary is: <tax>.
        And you're a <sex>.
         */
        Scanner SC = new Scanner(System.in);

        System.out.println("<<< Data Entry >>>");
        System.out.print("Name: ");
        String nameInput = SC.nextLine();

        System.out.print("Salary: ");
        int salaryInput = SC.nextInt();

        System.out.print("Sex Code [F/M]: ");
        char sexInput = SC.next().charAt(0);

        PERSON P1 = new PERSON(nameInput, salaryInput, sexInput);

        System.out.println("-");
        System.out.println("-");
        P1.Results();
    }

}
