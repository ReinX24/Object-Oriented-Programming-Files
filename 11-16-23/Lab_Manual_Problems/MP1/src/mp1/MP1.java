package mp1;

import java.util.Scanner;

public class MP1 {

    public static void main(String[] args) {

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
        person.displayInfo();
    }

}
