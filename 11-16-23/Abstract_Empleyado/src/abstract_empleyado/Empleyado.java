package abstract_empleyado;

public abstract class Empleyado {

    private String empName;
    private double yrsofService;
    private double Salary;

    public Empleyado() {
    }

    public Empleyado(String empName, double yrsofService, double Salary) {
        this.empName = empName;
        this.yrsofService = yrsofService;
        this.Salary = Salary;
    }

    protected abstract double bonusCalculate();

    protected abstract double grossSalary();

    protected abstract void displayInfo();

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getYrsofService() {
        return yrsofService;
    }

    public void setYrsofService(double yrsofService) {
        this.yrsofService = yrsofService;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

}
