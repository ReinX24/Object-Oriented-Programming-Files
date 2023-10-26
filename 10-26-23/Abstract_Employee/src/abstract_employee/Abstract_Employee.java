package abstract_employee; // 1.	Create a new Project:  Abstract_Employee

import java.util.Scanner; //import a Scanner

public class Abstract_Employee {

    public static void main(String[] args) {

        //instantiate a Scanner variable as SC
        Scanner SC = new Scanner(System.in);

        //instantiate a Manager class as M
        Manager M = new Manager();

        //display <<< Data Entry for Manager >>>
        //display and accept an input for the following
        //	Name: __
        //	Salary: __
        //	Bonus (Annual): __
        //display <<< Manager Details Report >>>
        //call displayInfo() from Manager class
        System.out.println("<<< Data Entry for Manager >>>");
        System.out.print("Name: ");
        String managerName = SC.nextLine();
        M.setEmpName(managerName);

        System.out.print("Salary: ");
        double managerSalary = SC.nextDouble();
        M.setBasicSalary(managerSalary);

        System.out.print("Bonus (Annual): ");
        double userBonus = SC.nextDouble();
        M.setBonus(userBonus);

        M.displayInfo();

        SC.nextLine();
        //display 20 dashes );
        System.out.println("--------------------");

        //instantiate a Programmer class as P
        //display <<< Data Entry for Programmer >>>
        //display and accept an input for the following
        //	Name: __
        //	Salary: __
        //	Total Hours Worked: __
        //	Rate / Hour: __
        //display <<< Programmer Details Report >>>
        //call displayInfo() from Programmer class
        Programmer P = new Programmer();

        System.out.println("<<< Data Entry for Programmer >>>");
        System.out.print("Name: ");
        String programmerName = SC.nextLine();
        P.setEmpName(programmerName);

        System.out.print("Salary: ");
        double programmerSalary = SC.nextDouble();
        P.setBasicSalary(programmerSalary);

        System.out.print("Total Hours Worked: ");
        double programmerTotalHoursWorked = SC.nextDouble();
        P.setNoHrsWorked(programmerTotalHoursWorked);

        System.out.print("Rate / Hour: ");
        double programmerRatePerHour = SC.nextDouble();
        P.setRatePerHr(programmerRatePerHour);

        P.displayInfo();
    }

}
