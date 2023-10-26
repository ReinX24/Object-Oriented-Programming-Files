package abstract_employee;

// 3.	Create a subclass called Manager that extends the Employee class.
public class Manager extends Employee {

    // a.	 It has a private attribute Bonus of type double.
    double Bonus;

    // b.	It has a blank constructor and another one with parameters.
    public Manager() {
    }

    public Manager(double Bonus, String empName, double basicSalary) {
        super(empName, basicSalary);
        this.Bonus = Bonus;
    }

    // c.	The grossSalary() method returns the value of the sum of 
    // basicSalary and Bonus.
    @Override
    double grossSalary() {
        return this.getBasicSalary() + this.getBonus();
    }

    // d.	The displayInfo() method simply  outputs the following details:
    // i.	Manager Name: ______________
    // ii.	Basic Salary: ______________
    // iii.	Annual Bonus: ______________
    // iv.	Total Salary: ______________
    @Override
    void displayInfo() {
        System.out.println("  i.Manager Name: " + this.getEmpName());
        System.out.println(" ii. Basic Salary: " + this.getBasicSalary());
        System.out.println("iii. Annual Bonus: " + this.getBonus());
        System.out.println(" iv. Total Salary: " + this.grossSalary());
    }

    // e.	It has a setter and getter.
    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

}
