package exer4;

public class PERSON {

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
        System.out.println("Hi, " + this.name);
        System.out.println("You're doing good with your salary at " + this.salary);
        System.out.println("And your prevailing Income Tax at 10% of your Gross Salary is: " + TaxCalc());
        System.out.println("And you're a " + this.sexValue());
    }
}
