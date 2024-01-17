package mp3;

import java.util.Scanner;

public class MP3B {

    public static void main(String[] args) {

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
