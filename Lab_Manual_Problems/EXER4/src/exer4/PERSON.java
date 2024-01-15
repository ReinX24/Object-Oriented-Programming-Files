package exer4;

public class PERSON {

    /*
    2. Open a New Java class as PERSON. Copy & paste and MODIFY the attributes in EXER3.java.
        • It has a sexValue() method which tests for the sex code and output the message sex as either
        "Male" or "Female".
        • It has a a TaxCalc() method which computes for the tax as 10% of the salary.
        • It has a Results() method which output the following details:
        Hi, <name>.
        You're doing good with your salary at <salary>.
        And your prevailing Income Tax at 10% of your Gross Salary is: <tax>.
        And you're a <sex>.
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

    public double TaxCalc() {
        return this.salary * .10;
    }

    public void Results() {
        System.out.println("Hi, " + this.name + ".");
        System.out.println("You're doing good with your salary at " + this.salary + ".");
        System.out.println("And your prevailing Income Tax at 10% of your Gross Salary is: " + this.TaxCalc() + ".");
        System.out.println("And you're a " + this.sexValue() + ".");
    }
}
