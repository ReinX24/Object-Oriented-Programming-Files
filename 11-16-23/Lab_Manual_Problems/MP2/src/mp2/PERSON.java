package mp2;

public class PERSON {

    /*
        2. Open a New Java Class as PERSON (Follow the format in MP1.java).
        3. Improve the PERSON class by adding Setters and Getters.
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
        System.out.println("Hi, my first name is " + this.getFirstName());
        System.out.println("And my last is " + this.getLastName());
        System.out.println("I'm " + this.getAge() + " years old.");
    }

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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}
