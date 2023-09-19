package getsetsample;

// This class is a child class, which means it inherits all attribute and
// methods in the parent class (Human)
public class Student extends Human {

    public Student() {
    }

    public Student(String lastName, String firstName, String sex, int age) {
        // This calls the constructor of the parent class (not yet covered as of
        // writing this code)
        super(lastName, firstName, sex, age);
    }

    @Override
    public void sing() {
        System.out.println("This Student is singing!");
    }

}
