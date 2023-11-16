package mp1;

public class PERSON {

    private String lastName;
    private String firstName;
    private int Age;

    public PERSON() {
    }

    public PERSON(String lastName, String firstName, int Age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.Age = Age;
    }

    public void displayInfo() {
        System.out.println("<<< Personal Details >>>");
        System.out.println("Hi, my first name is " + this.firstName);
        System.out.println("And my last is " + this.lastName);
        System.out.println("I'm " + this.Age + " years old.");
    }

}
