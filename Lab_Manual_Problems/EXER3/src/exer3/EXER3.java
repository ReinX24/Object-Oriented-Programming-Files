package exer3;

import java.util.Scanner;

public class EXER3 {

    public static void main(String[] args) {

        /*
        EXER3.java
        1. Open a new Project in Java as EXER3.java.
         */
 /*
         3. The main program will have the following details:
        * import the Scanner class
        * Instantiate the Scanner class as SC.
        * Display and Accept values as shown in the INPUT Layout.
        * Instantiate the PERSON class as P1 along with the entered values as parameters.
        * Call the methods as shown in the OUPUT Layout.
        
        4. Consider the I/O Layout as shown below:
        <<< Data Entry >>>
        Name: _____________
        Salary: _____________
        Sex Code [F/M]: _____________
        -
        -
        <<< Person Details >>>
        Hi, <name>.
        You're doing good with your salary of <salary>.
        And your Sex Code is <sexCode>.
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
