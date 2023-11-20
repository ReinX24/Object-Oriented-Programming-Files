package exer3;

public class PERSON {

    /*
    2. Create a PERSON class. Consider the following requirements.
        
        a. The PERSON class has 3 attributtes:
        * name
        * Salary
        * sex code
        b. The PERSON class has a blank constructor and a constructor with 3 parameters.
        c. The PERSON class has the following regular methods:
        * sexValue() method which tests for the sex code and output the message sex as either "Male" or "Female".
        * Results() method which output the following details:
        Hi, <name>.
        You're doing good with your salary at <salary>.
        And your Sex Code is <sexCode>.
     */
    private String name;
    private int salary;
    private char sexCode;

    public PERSON() {
    }

    public PERSON(String name, int Salary, char sexCode) {
        this.name = name;
        this.salary = Salary;
        this.sexCode = sexCode;
    }

    public String sexValue() {
        if (this.sexCode == 'M') {
            return "Male";
        }
        return "Female";
    }

    public void Results() {
        System.out.println("Hi, " + this.name);
        System.out.println("You're doing good with your salary at " + this.salary);
        System.out.println("And your Sex Code is " + this.sexCode);
    }
}
