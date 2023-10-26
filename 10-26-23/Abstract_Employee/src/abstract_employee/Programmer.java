package abstract_employee;

// 4.	Create a subclass called Programmer that extends the Employee class.
public class Programmer extends Employee {

    // a.	 It has two (2) private attributes NoHrsWorked and RatePerHr 
    // both of which are of type double.
    double NoHrsWorked;
    double RatePerHr;

    // b.	It has a blank construct and another one with parameters.
    public Programmer() {
    }

    public Programmer(double NoHrsWorked, double RatePerHr, String empName, double basicSalary) {
        super(empName, basicSalary);
        this.NoHrsWorked = NoHrsWorked;
        this.RatePerHr = RatePerHr;
    }

    // c.	The grossSalary() method returns the value of the sum of 
    // basicSalary and the product of NoHrsWorked and RatePerHr.
    @Override
    double grossSalary() {
        return this.getBasicSalary() + (this.getNoHrsWorked() * this.getRatePerHr());
    }

    // d.	The displayInfo() method simply  outputs the following details:
    // i.	Programmer name: ______________
    // ii.	Basic Salary: ______________
    // iii.	No. of Hours Worked: ______________
    // iv.	Rate Per Hour: ______________
    // v.	Gross Salary: ______________
    @Override
    void displayInfo() {
        System.out.println("  i. Programmer Name: " + this.getEmpName());
        System.out.println(" ii. Basic Salary: " + this.getBasicSalary());
        System.out.println("iii. No. Of Hours Worked: " + this.getNoHrsWorked());
        System.out.println(" iv. Rate Per Hour: " + this.getRatePerHr());
        System.out.println("  v. Gross Salary: " + this.grossSalary());
    }

    // e.	It has setters and getters.
    public double getNoHrsWorked() {
        return NoHrsWorked;
    }

    public void setNoHrsWorked(double NoHrsWorked) {
        this.NoHrsWorked = NoHrsWorked;
    }

    public double getRatePerHr() {
        return RatePerHr;
    }

    public void setRatePerHr(double RatePerHr) {
        this.RatePerHr = RatePerHr;
    }

}
