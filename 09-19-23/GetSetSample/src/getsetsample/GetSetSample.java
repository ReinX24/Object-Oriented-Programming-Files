package getsetsample;

import java.util.Scanner;

public class GetSetSample {

    public static void main(String[] args) {

        // Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Creating a Human object
        Human humanOne = new Human();
        
        // Asking for Human object attributes
        String lastName, firstName, sex;
        int age;
        
        System.out.println("<<< DATA ENTRY >>>");
        
        // Asking the user for lastName and setting humanOne lastName attribute
        System.out.print("Enter Last Name: ");
        lastName = userInput.nextLine();
        humanOne.setLastName(lastName); // using the lastName setter
        
        // humanOne firstName
        System.out.print("Enter First Name: ");
        firstName = userInput.nextLine();
        humanOne.setFirstName(firstName);
        
        // humanOne sex
        System.out.print("Enter Sex: ");
        sex = userInput.nextLine();
        humanOne.setSex(sex);
        
        // humanOne age
        System.out.print("Enter Age: ");
        age = userInput.nextInt();
        humanOne.setAge(age);

        // Displaying humanOne firstName and lastName
        System.out.println("Hello " + humanOne.getFirstName() + " " + humanOne.getLastName() + ". Nice meeting you!");
        
        // Using the sing method in the Human class
        humanOne.sing();
        
        // Creating a Student object and using the overridden sing method
        Student studentOne = new Student();
        studentOne.sing();
        
    }

}
