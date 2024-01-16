package abstractemployee;

import java.util.Scanner;

public class abstractEmployee {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        Supervisor SV = new Supervisor();
        
        System.out.println("<<< Data Entry for Supervisor >>>");
        System.out.print("Name: ");
        SV.setEmpName(SC.nextLine());
        
        System.out.print("Salary: ");
        SV.setSalary(SC.nextDouble());
        
        System.out.print("No. of Years in Service: ");
        SV.setYrsOfService(SC.nextDouble());
        
        System.out.println("");
        System.out.println("<<< Supervisor Details Report >>>");
        SV.displayInfo();
    }

}
