package mp1;

import java.util.Scanner;

public class MP1 {

    public static void main(String[] args) {
        /*
        MP1.java
        1. Open a New Project in Java as MP1.java (this is the main program).
         */

 /*
         3. In the main() program:
        a. Import the Scanner class.
        b. Instantiate the Scanner class as SC.
        C. Enter values as shown in the I/O layout.
        b. Instantiate a PERSON class and pass the entered values as parameters.
        c. Call the displayDetails() method to generate the result.
        4. The I/O Layout:
        <<< Data Entry >>>
        -
        Enter a value for Last Name : __________
        Enter a value for First Name: __________
        Enter a value for Age: __________
        -
        -
        <<< Personal Details >>>
        Hi, my first name is <firstName>.
        And my last name is <lastName>.
        I'm <Age> years old.
         */
        Scanner SC = new Scanner(System.in);

        System.out.println("<<< Data Entry >>>");

        System.out.println("-");
        System.out.print("Enter a value for Last Name: ");
        String lastName = SC.nextLine();

        System.out.print("Enter a value for First Name: ");
        String firstName = SC.nextLine();

        System.out.print("Enter a value for age: ");
        int userAge = SC.nextInt();

        PERSON person = new PERSON(lastName, firstName, userAge);

        System.out.println("-");
        System.out.println("-");
        person.displayDetails();
    }

}
