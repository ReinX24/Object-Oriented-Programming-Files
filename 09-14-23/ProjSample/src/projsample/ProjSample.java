package projsample;

import java.util.Scanner;

/**
 *
 * @author Rein Aldwin E. Solis
 */
public class ProjSample {

    public static void main(String[] args) {
        // Instantiating a new Person object using the Person class
        Person personOne = new Person("Rein", "Solis", "Male", 20);
        
        // Setting personOne attributes
        personOne.firstName = "Rein";
        personOne.lastName = "Solis";
        personOne.personSex = "Male";
        personOne.personAge = 20;

        // Printing personOne attributes
        System.out.println("**************************");
        System.out.println("First Name: " + personOne.firstName);
        System.out.println("Last Name: " + personOne.lastName);
        System.out.println("Sex: " + personOne.personSex);
        System.out.println("Age: " + personOne.personAge);

        // Calling personOne methods
        personOne.personSing();

        // Creating another Person object
        Person personTwo = new Person();
        personTwo.firstName = "John";
        personTwo.lastName = "Carmack";
        personTwo.personSex = "Male";
        personTwo.personAge = 53;

        System.out.println("**************************");
        System.out.println("First Name: " + personTwo.firstName);
        System.out.println("Last Name: " + personTwo.lastName);
        System.out.println("Sex: " + personTwo.personSex);
        System.out.println("Age: " + personTwo.personAge);

        personTwo.personSing();
        System.out.println("**************************");
        
        // Creating a Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Asking for user input for Person class
        System.out.print("Enter First Name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter Sex [M/F]: ");
        String userSex = userInput.nextLine();

        System.out.print("Enter Age: ");
        int userAge = userInput.nextInt();

        // Instantiating userOne with user entered information
        Person userOne = new Person(firstName, lastName, userSex, userAge);

        // Printing userOne attributes using a method in the Person class
        userOne.printPersonInfo();

        userInput.close();
    }

}
