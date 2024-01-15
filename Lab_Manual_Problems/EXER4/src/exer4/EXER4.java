package exer4;

import java.util.Scanner;

public class EXER4 {

    public static void main(String[] args) {
        /*
        Semester: 1st Sem Academic Year: 2023-20204
        EXER4.java
        
        1. Open a New Project in Java as EXER4.java.
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
