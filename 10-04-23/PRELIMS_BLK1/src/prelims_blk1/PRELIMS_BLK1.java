package prelims_blk1;

import java.util.Scanner;

public class PRELIMS_BLK1 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        STUDENT1 studentOne = new STUDENT1();

        /* 
        I/O Layout:
        <<< STUDENT DATA ENTRY >>>
        1] First Name: _
        2] Last Name: _
        3] Sex Code [M/F]: _
        4] Degree: _
        5] Section:_
        6] Year: _
        7] No. of Units Enrolled: _
        8] Prelim Grade: _
        9] Midterm Grade: _
        10] Final Grade: _
         */
        System.out.println("<<< STUDENT DATA ENTRY >>>");

        System.out.print("1] First Name: ");
        String firstName = userInput.nextLine();
        studentOne.setFirstName(firstName);

        System.out.print("2] Last Name: ");
        String lastName = userInput.nextLine();
        studentOne.setLastName(lastName);

        System.out.print("3] Sex Code [M/F]: ");
        char sexCode = userInput.next().charAt(0);
        studentOne.setSexCode(sexCode);

        userInput.nextLine(); // user input in the console will be formatted properly

        System.out.print("4] Degree: ");
        String studentDegree = userInput.nextLine();
        studentOne.setStudentDegree(studentDegree);

        System.out.print("5] Section: ");
        String studentSection = userInput.nextLine();
        studentOne.setStudentSection(studentSection);

        System.out.print("6] Year: ");
        int studentYear = userInput.nextInt();
        studentOne.setStudentYear(studentYear);

        System.out.print("7] No. of Units Enrolled: ");
        int NOU = userInput.nextInt();
        studentOne.setNOU(NOU);

        System.out.print("8] Prelim Grade: ");
        double prelimGrade = userInput.nextDouble();
        studentOne.setPrelimGrade(prelimGrade);

        System.out.print("9] Midterm Grade: ");
        double midtermGrade = userInput.nextDouble();
        studentOne.setMidtermGrade(midtermGrade);

        System.out.print("10] Final Grade: ");
        double finalGrade = userInput.nextDouble();
        studentOne.setFinalGrade(finalGrade);

        studentOne.RPUvalue();
        studentOne.TFValue();
        studentOne.MFValue();
        studentOne.allFees();
        studentOne.averageGrade();
        studentOne.remarksValue();
        studentOne.sexValue();

        System.out.println("==================================================");
        System.out.println("==================================================");

        /*
        <<< STUDENT DETAILS >>>
        1] First Name: _
        2] Last Name: _
        3] Sex: _
        4] Degree: _
        5] Section:_
        6] Year: _
        7] Rate Per Unit:_
        8] No. of Units Enrolled: _
        9] Tuition Fee: _
        10] Miscellaneous Fee: _
        11] Total Fees: _
        12] Average Grade: _
        13] Remarks:_
         */
        System.out.println("<<< STUDENT DETAILS >>>");
        System.out.println("1] First Name: " + studentOne.getFirstName());
        System.out.println("2] Last Name: " + studentOne.getLastName());
        System.out.println("3] Sex: " + studentOne.getStudentSex());
        System.out.println("4] Degree: " + studentOne.getStudentDegree());
        System.out.println("5] Section: " + studentOne.getStudentSection());
        System.out.println("6] Year: " + studentOne.getStudentYear());
        System.out.println("7] Rate Per Unit: " + studentOne.getRPU());
        System.out.println("8] No. of Units Enrolled: " + studentOne.getNOU());
        System.out.println("9] Tuition Fee: " + studentOne.getTuitionFee());
        System.out.println("10] Miscellaneous Fee: " + studentOne.getMiscFee());
        System.out.println("11] Total Fees: " + studentOne.getTotalFees());
        System.out.println("12] Average Grade: " + studentOne.getAverageGrade());
        System.out.println("13] Remarks: " + studentOne.getStudentRemarks());

    }

}
