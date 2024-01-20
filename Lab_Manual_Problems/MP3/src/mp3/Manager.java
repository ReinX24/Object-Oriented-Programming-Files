package mp3;

public class Manager extends Employee {

    /*
    3. Create a subclass called Manager that extends the Employee class. Copy & Paste the contents of the Employee
    class from the abstractEmployee.java.
     */
    private double salaryBonus;
    private double serviceBonus;

    public Manager() {
    }

    public Manager(double salaryBonus, double serviceBonus, String empName, double yrsOfService) {
        super(empName, yrsOfService);
        this.salaryBonus = salaryBonus;
        this.serviceBonus = serviceBonus;
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
        // Calculating and setting salaryBonus and serviceBonus.
        this.setSalaryBonus(this.BonusSalary());
        this.setServiceBonus(this.BonusService());

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
