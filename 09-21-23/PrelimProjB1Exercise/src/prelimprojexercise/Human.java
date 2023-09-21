package prelimprojexercise;

import java.util.Scanner;

public class Human {

    // Scanner object to accept user input
    Scanner userInput = new Scanner(System.in);

    // Human class attributes
    private String lastName, firstName;
    private long contactNumber;
    private int age;
    private double weight;

    public Human() {
        // Blank constructor
    }

    // Constructor with parameters
    public Human(String lastName, String firstName, long contactNumber, int age, double weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.contactNumber = contactNumber;
        this.age = age;
        this.weight = weight;
    }

    public void askUserDetails() {
        // Asking for Human object details
        System.out.println("<<< DATA ENTRY >>>");

        System.out.print("1. Last name: ");
        String lastName = userInput.nextLine();
        this.setLastName(lastName);

        System.out.print("2. First name: ");
        String firstName = userInput.nextLine();
        this.setFirstName(firstName);

        System.out.print("3. Mobile No.: ");
        long contactNumber = userInput.nextLong();
        this.setContactNumber(contactNumber);

        System.out.print("4. Age: ");
        int age = userInput.nextInt();
        this.setAge(age);

        System.out.print("5. Weight (in Kgs.): ");
        double weight = userInput.nextDouble();
        this.setWeight(weight);
    }

    // Method for printing the Human object's details
    public void printUserDetails() {
        System.out.println("-----------------------------------------------");
        System.out.println("Thank you, " + this.getFirstName() + " " + this.getLastName() + " for your details.");
        System.out.println("You are " + this.getAge() + " years old, and weighs " + this.getWeight() + " kgs.");
        System.out.println("Your Mobile No. is " + this.getContactNumber() + ".");
    }

    // Sing method
    public void sing() {
        System.out.println(this.firstName + " " + this.lastName + " can sing!");
    }

    // Dance method
    public void dance() {
        System.out.println(this.firstName + " " + this.lastName + " can dance!");
    }

    // Setters and Getters for our Human class
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
