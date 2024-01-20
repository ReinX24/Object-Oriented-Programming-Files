package mp3;

public abstract class Employee {

    /* 
    2. Create a new Abstract class called Employee. Copy & Paste the contents of the Employee class from the
    abstractEmployee.java.
     */
    private String empName;
    private double yrsOfService;
    private double Salary;

    public Employee() {
    }

    public Employee(String empName, double yrsOfService) {
        this.empName = empName;
        this.yrsOfService = yrsOfService;
    }

    public abstract double bonusCalculate();

    public abstract double grossSalary();

    public void displayInfo() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getYrsOfService() {
        return yrsOfService;
    }

    public void setYrsOfService(double yrsOfService) {
        this.yrsOfService = yrsOfService;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

}
