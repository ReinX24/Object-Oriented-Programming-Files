package abstract_employee;

// 2.	Create a new Abstract class called Employee.
public abstract class Employee {

    // a.	It has two (2) attributes empName and basicSalary, each of which
    // is a String and double respectively. 
    String empName;
    double basicSalary;

    // b.	It has a blank constructor as well as another constructor with 2
    // parameters.
    public Employee() {
    }

    public Employee(String empName, double basicSalary) {
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    // c.	It contains two (2) abstract methods: grossSalary() and 
    // displayInfo(). 
    abstract double grossSalary();

    abstract void displayInfo();

    // d.	It has setters and getters.
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

}
