package abstract_empleyado;

public class Manager extends Empleyado {

    private double salaryBonus;
    private double serviceBonus;

    public Manager() {
    }

    public Manager(double salaryBonus, double serviceBonus, String empName, double yrsofService, double Salary) {
        super(empName, yrsofService, Salary);
        this.salaryBonus = salaryBonus;
        this.serviceBonus = serviceBonus;
    }

    private double BonusSalary() {
        if (this.getSalary() >= 30000.0) {
            this.salaryBonus = this.getSalary() * 0.5;
        } else {
            this.salaryBonus = this.getSalary() * 0.3;
        }
        return this.salaryBonus;
    }

    protected double BonusService() {
        this.serviceBonus = this.getYrsofService() * 300;
        return this.serviceBonus;
    }

    @Override
    protected double bonusCalculate() {
        return this.BonusSalary() + this.BonusService();
    }

    @Override
    protected double grossSalary() {
        return this.getSalary() + this.bonusCalculate();
    }

    @Override
    public void displayInfo() {
        System.out.println("\n<<< Manager Details Report >>>");
        System.out.println("Manager Name: " + this.getEmpName());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Salary Bonus: " + this.BonusSalary());
        System.out.println("No. of years in service: " + this.getYrsofService());
        System.out.println("Service Bonus: " + this.BonusService());
        System.out.println("Total Bonus: " + this.grossSalary());
    }

}
