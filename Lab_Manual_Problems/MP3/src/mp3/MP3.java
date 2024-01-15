package mp3;

import java.util.Scanner;

public class MP3 {
    // TODO: Do MP3 tomorrow, this problem has been changed from the last one.

    public static void main(String[] args) {
        /*
        MP3.java
        1. Open a New Project in Java as MP2.java.
         */

 /*
         4. The main class has the following details:
        * Import a Scanner class.
        * Instantiate a Scanner class as Kbd.
        * Instantiate a STUDENT class as Stud.
        * Display & Accept values based from the I/O Layout below.
        * Generate the output based from the I/O Layout below.
        I/O Layout:
        Welcome to Universidad de Dagupan
        <<< DATA ENTRY >>>
        1] Enter Name: ___
        2] Enter Sex : ___
        3] Enter Age : ___
        4] Enter Degree: ___
        5] Enter Year[1,2,3,4]: ___
        6] Enter No. of Units Enrolled: ___
        -
        -
        1] Name: ___
        2] Sex: ___
        3] Age: ___
        4] Degree: ___
        5] Year (Words): ___
        6] Units Enrolled: ___
        7] Tuition Fee: ___
        8] Total Fees: ___
         */
        Scanner Kbd = new Scanner(System.in);

        STUDENT Stud = new STUDENT();

        Stud.Heading();

        System.out.print("1] Enter Name: ");
        String nameInput = Kbd.nextLine();
        Stud.setName(nameInput);

        System.out.print("2] Enter Sex: ");
        String sexInput = Kbd.nextLine();
        Stud.setSex(sexInput);

        System.out.print("3] Enter Age: ");
        int ageInput = Kbd.nextInt();
        Stud.setAge(ageInput);

        Kbd.nextLine(); // fix console formatting

        System.out.print("4] Enter Degree: ");
        String degreeInput = Kbd.nextLine();
        Stud.setDegree(degreeInput);

        System.out.print("5] Enter Year[1,2,3,4]: ");
        int yearInput = Kbd.nextInt();
        Stud.setYear(yearInput);

        System.out.print("6] Enter No. of Units Enrolled: ");
        int unitsInput = Kbd.nextInt();
        Stud.setNoUnitsEnrolled(unitsInput);

        System.out.println("-");
        System.out.println("-");

        System.out.println("1] Name: " + Stud.getName());
        System.out.println("2] Sex: " + Stud.getSex());
        System.out.println("3] Age: " + Stud.getAge());
        System.out.println("4] Degree: " + Stud.getDegree());
        System.out.println("5] Year (Words): " + Stud.yearInWords());
        System.out.println("6] Units Enrolled: " + Stud.getNoUnitsEnrolled());
        System.out.println("7] Tuition Fee: " + Stud.tuitionFee());
        System.out.println("8] Total Fees: " + Stud.totalFees());
    }

}
