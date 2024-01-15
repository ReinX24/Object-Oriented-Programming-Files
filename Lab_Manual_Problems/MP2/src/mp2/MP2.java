package mp2;

import java.util.Scanner;

public class MP2 {

    public static void main(String[] args) {

        /*
        MP2.java
        1. Open a New Project in Java as MP2.java (this is the main program).
         */
        /*
        4. Update also the main program.
         */
        Scanner SC = new Scanner(System.in);

        System.out.println("<<< Data Entry >>>");

        PERSON person = new PERSON();

        System.out.println("-");
        System.out.print("Enter a value for Last Name: ");
        String lastName = SC.nextLine();
        person.setLastName(lastName);

        System.out.print("Enter a value for First Name: ");
        String firstName = SC.nextLine();
        person.setFirstName(firstName);

        System.out.print("Enter a value for age: ");
        int userAge = SC.nextInt();
        person.setAge(userAge);

        System.out.println("-");
        System.out.println("-");
        person.displayDetails();
    }

}
