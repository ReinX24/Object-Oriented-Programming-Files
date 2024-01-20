package mp3;

import java.util.Scanner;

public class MP3B {

    public static void main(String[] args) {
        /* 1. Create a new Project: MP3.java */
 /*
        4. The main program has the following details:
        //import a Scanner
        //after the public static void main (String[] args){
        //instantiate a Scanner variable as SC
        //instantiate a Manager class as M and an Array of 5 managers.
        //display <<< Data Entry for Supervisor >>>
        //display and accept 5 inputs for the following
        //Entry No: 1
        // Name: __
        // Salary: __
        // No. of Years in Service: __
        //Entry No: 2
        // Name: __
        // Salary: __
        // No. of Years in Service: __
        //Entry No: 3
        // Name: __
        // Salary: __
        // No. of Years in Service: __
        //Entry No: 4
        // Name: __
        // Salary: __
        // No. of Years in Service: __
        //Entry No: 5
        // Name: __
        // Salary: __
        // No. of Years in Service: __
        //display <<< Manager Details Report >>>
        //Generate the results for each of the 5 Managers
        //call displayInfo() from Manager class
         */
        Scanner SC = new Scanner(System.in);
        Manager M = new Manager();

        Manager[] myManagers = new Manager[5];

        System.out.println("<<< Data Entry for Supervisor");

        for (int i = 0; i < myManagers.length; i++) {
            System.out.println("Entry No: " + (i + 1));

            myManagers[i] = new Manager(); // creating our Manager object.

            System.out.print("\tName: ");
            myManagers[i].setEmpName(SC.nextLine());

            System.out.print("\tSalary: ");
            myManagers[i].setSalary(SC.nextDouble());

            System.out.print("\tNo. of Years in Service: ");
            myManagers[i].setYrsOfService(SC.nextDouble());

            SC.nextLine(); // for fixing formatting errors inside the console.
        }

        for (Manager eachManager : myManagers) {
            System.out.println("");
            System.out.println("<<< Manager Details Report >>>");
            eachManager.displayInfo();
        }

    }

}
