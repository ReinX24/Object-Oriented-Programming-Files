package abstract_empleyado;

import java.util.Scanner;

public class Abstract_Empleyado {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        Manager M = new Manager();

        System.out.println("<<< Data Entry for Manager >>>");

        System.out.print("Name: ");
        String managerName = SC.nextLine();
        M.setEmpName(managerName);

        System.out.print("Salary: ");
        double managerSalary = SC.nextDouble();
        M.setSalary(managerSalary);

        System.out.print("No. of Years in Service: ");
        double managerYears = SC.nextDouble();
        M.setYrsofService(managerYears);

        M.displayInfo();
    }

}
