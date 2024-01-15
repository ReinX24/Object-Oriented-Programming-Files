package abstractemployee;

public class Supervisor extends Employee {

    private double salaryBonus;
    private double serviceBonus;

    public Supervisor() {
    }

    public Supervisor(String empName, double yrsOfService) {
        super(empName, yrsOfService);
    }

    public double BonusSalary() {
        if (this.getSalary() >= 30000) {
            return this.getSalary() * 0.40;
        } else {
            return this.getSalary() * 0.20;
        }
    }

    public double BonusService() {
        return this.getYrsOfService() * 500;
    }

    @Override
    public double bonusCalculate() {
        return this.BonusSalary() + this.BonusService();
    }

    @Override
    public double grossSalary() {
        return this.getSalary() + this.bonusCalculate();
    }

    public void displayInfo() {
        System.out.println("Manager Name: " + this.getEmpName());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Salary Bonus: " + this.getSalaryBonus());
        System.out.println("No. of years in service: " + this.getYrsOfService());
        System.out.println("Service Bonus: " + this.BonusService());
        System.out.println("Total Amount: " + this.bonusCalculate());
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public double getServiceBonus() {
        return serviceBonus;
    }

    public void setServiceBonus(double serviceBonus) {
        this.serviceBonus = serviceBonus;
    }

}
