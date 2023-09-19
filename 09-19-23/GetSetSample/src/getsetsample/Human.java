package getsetsample;

public class Human {

    // Attributes of our Human class
    private String lastName, firstName, sex;
    private int age;

    // This is a blank constructor
    public Human() {
    }

    // Human class constructor for instantiating lastName, firstName, sex, and
    // age
    public Human(String lastName, String firstName, String sex, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = sex;
        this.age = age;
    }

    // Method that can be called by Human objects
    public void sing() {
        System.out.println("This Human is singing!");
    }

    // Setters and Getters for our Human object attributes
    // To generate getters and setters automatically, go to the "Source" tab and
    // choose the "Insert Code" option. After that choose where you want to 
    // generate getters, setters, or both. You also get to choose which 
    // attributes you want to generate getters and setters for.
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
