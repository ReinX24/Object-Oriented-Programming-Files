package projsample;

/**
 *
 * @author Rein Aldwin E. Solis
 */
class Person {

    // Properties, Attributes, or Variable names in Person class
    String firstName;
    String lastName;
    String personSex;
    int personAge;

    // Constructor for our Person class with default values
    Person() {
        // Calling the constructor for our class with parameters
        this("No First Name", "No Last Name", "No Sex", 0);
    }

    // Constructor for our Person class with parameters
    Person(String firstName, String lastName, String personSex, int personAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personSex = personSex;
        this.personAge = personAge;
    }

    // Methods for our Person class
    void personSing() {
        // sout + tab for print shortcut
        // The "this" keyword refers to the object's attributes that it is called
        // on. In this case, we are printing the firstName and lastName of the 
        // object when we call personSing method
        System.out.println(this.firstName + " " + this.lastName + " can sing!");
    }

    // Method that prints all of the Person object's information
    void printPersonInfo() {
        System.out.println("**************************");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Sex: " + this.personSex);
        System.out.println("Age: " + this.personAge);
    }

}
