package mp1;

public class PERSON {

    /*
       2. Open a New Java Class as PERSON with the following requirements:
        a. It has 3 attributes: lastName, firstName and Age.
        b. It has a blank constructor and another one with 3 parameters.
        c. It has a displayDetails() method and generates the output below as:
        Hi, my first name is <firstName>.
        And my last name is <lastName>.
        I'm <Age> years old.
     */
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

    public void displayDetails() {
        System.out.println("<<< Personal Details >>>");
        System.out.println("Hi, my first name is " + this.firstName + ".");
        System.out.println("And my last is " + this.lastName + ".");
        System.out.println("I'm " + this.Age + " years old.");
    }

}
