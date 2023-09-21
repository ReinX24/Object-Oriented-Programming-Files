package prelimprojexercise;

import java.util.Scanner;

public class Employee extends Human {

    Scanner userInput = new Scanner(System.in);
    private double NHW, RPH, GS, LUV, SSS, PH, totalDeductions, netSalary;

    Employee() {
        // Blank constructor
    }

    public Employee(String lastName, String firstName, long contactNumber, int age, double weight, double NHW, double RPH, double GS, double LUV, double SSS, double PH) {
        super(lastName, firstName, contactNumber, age, weight);
        this.NHW = NHW;
        this.RPH = RPH;
        this.GS = GS;
        this.LUV = LUV;
        this.SSS = SSS;
        this.PH = PH;
    }

    public void askEmployeeDetails() {
        // Calls the askUserDetails and other variables that are exclusive to 
        // the Employee class (NWH, RPH, GS, LUV, SSS, PH)
        super.askUserDetails();

        System.out.print("6. Enter hours worked (NHW): ");
        double NHW = userInput.nextDouble();
        this.setNHW(NHW);

        System.out.print("7. Enter rate per hour (RPH): ");
        double RPH = userInput.nextDouble();
        this.setRPH(RPH);

        System.out.print("8. Enter Pag-Ibig (LUV): ");
        double LUV = userInput.nextDouble();
        if (LUV > 900) { // Pag-Ibig must not exceed P900
            System.out.println("Pag-Ibig cannot exceed P900!");
            System.exit(0); // this terminates the program
        }
        this.setLUV(LUV);

        System.out.print("9. Enter SSS (SSS): ");
        double SSS = userInput.nextDouble();
        if (SSS > 850) { // SSS cannot exceed P850
            System.out.println("SSS cannot exceed P850!");
            System.exit(0);
        }
        this.setSSS(SSS);

        System.out.print("10. Enter PhilHealth (PH): ");
        double PH = userInput.nextDouble();
        if (PH > 780) { // PH or PhilHealth cannot exceed P780
            System.out.println("PhilHealth cannot exceed P780!");
            System.exit(0);
        }
        this.setPH(PH);
    }

    public void calculateGrossSalary() {
        // Gross Salary = No. of Hours Worked * Rate per Hour
        this.setGS(this.getNHW() * this.getRPH());
    }

    public void calculateTotalDeductions() {
        // Pag-Ibig + SSS + PhilHealth
        this.setTotalDeductions(this.getLUV() + this.getSSS() + this.getPH());
    }

    public void calculateNetSalary() {
        // NetSalary = Gross Salary - TotalDeductions
        this.setNetSalary(this.getGS() - (this.getTotalDeductions()));
    }

    public void printEmployeeDetails() {
        super.printUserDetails();
        System.out.println("-----------------------------------------------");
        System.out.println("Gross Salary: P" + this.getGS());
        System.out.println("Total Deductions: P" + this.getTotalDeductions());
        System.out.println("Your Net Salary: P" + this.getNetSalary());
    }

    public double getNHW() {
        return NHW;
    }

    public void setNHW(double NHW) {
        this.NHW = NHW;
    }

    public double getRPH() {
        return RPH;
    }

    public void setRPH(double RPH) {
        this.RPH = RPH;
    }

    public double getGS() {
        return GS;
    }

    public void setGS(double GS) {
        this.GS = GS;
    }

    public double getLUV() {
        return LUV;
    }

    public void setLUV(double LUV) {
        this.LUV = LUV;
    }

    public double getSSS() {
        return SSS;
    }

    public void setSSS(double SSS) {
        this.SSS = SSS;
    }

    public double getPH() {
        return PH;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

}
