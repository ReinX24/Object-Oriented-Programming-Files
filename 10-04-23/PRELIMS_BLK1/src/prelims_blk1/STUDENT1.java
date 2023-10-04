package prelims_blk1;

/* 
❖ Set the STUDENT1 class to Inherit from the PERSON1 class.
❖ The STUDENT1 class has the following attributes.
i. Year / integer
ii. Degree / string
iii. Section / string
iv. NOU / integer (No. of Units Enrolled)
v. prelimGrd / double
vi. midtermGrd / double
vii. finalGrd / double
viii. RPU / double (Derived based from the Year level)
ix. TuitionFee / double (Derived based from the NOU and Rate per Unit (RPU))
x. MiscFee / double (Derived based from the Year Level)
xi. TotalFees / double (Derived based from the sum of TuitionFee and MiscFee)
xii. avgGrd / double (Derived based from the average of the 3 grades)
xiii. remarks / string (Derived based from the range of the avgGrd)
xiv. sex / string (Derived based from the sexCode)
 */
public class STUDENT1 extends PERSON1 {

    private int studentYear;
    private String studentDegree;
    private String studentSection;
    private int NOU; // number of units enrolled
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    private double RPU; // rate per unit
    private double tuitionFee;
    private double miscFee;
    private double totalFees;
    private double averageGrade;
    private String studentRemarks;
    private String studentSex;

    // ❖ Create a blank Constructor.
    public STUDENT1() {
    }

    // ❖ Create a Constructor that will have the 7 parameters along with the 3 
    // parameters from the PERSON1 class as shown above.
    public STUDENT1(int studentYear, String studentDegree, 
            String studentSection, int NOU, double prelimGrade, 
            double midtermGrade, double finalGrade, 
            String firstName, String lastName, char sexCode) {
        super(firstName, lastName, sexCode);
        this.studentYear = studentYear;
        this.studentDegree = studentDegree;
        this.studentSection = studentSection;
        this.NOU = NOU;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    /* 
    ❖ NOTE:
    i. Create a RPUvalue method
    Rate per Unit computation
    Year RPU
    1 650.00
    2 600.00
    3 550.00
    4 500.00
     */
    public void RPUvalue() {

        switch (studentYear) {

            case 1:
                this.setRPU(650.00);
                break;

            case 2:
                this.setRPU(600.00);
                break;

            case 3:
                this.setRPU(550.00);
                break;

            case 4:
                this.setRPU(500.00);
                break;

        }

    }

    /* 
    ii. Create a TFvalue method
    TuitionFee = NOU * RPU
     */
    public void TFValue() {
        this.setTuitionFee(this.getNOU() * this.getRPU());
    }

    /* 
    iii. Create a MFvalue method
    MiscFee computation
    Year MiscFee
    1 10% of TuitionFee
    2 15% of TuitionFee
    3 20% of TuitionFee
    4 25% of TuitionFee
     */
    public void MFValue() {

        switch (studentYear) {

            case 1:
                this.setMiscFee(this.getTuitionFee() * 0.10);
                break;

            case 2:
                this.setMiscFee(this.getTuitionFee() * 0.15);
                break;

            case 3:
                this.setMiscFee(this.getTuitionFee() * 0.20);
                break;

            case 4:
                this.setMiscFee(this.getTuitionFee() * 0.25);
                break;

        }

    }

    /* 
    iv. Create a AllFees method
    TotalFees = TuitionFee + MiscFee
     */
    public void allFees() {
        this.setTotalFees(this.getTuitionFee() + this.getMiscFee());
    }

    /* 
    v. Create AveGrd method
    avgGrd = (prelimGrd+midtermGrd+finalGrd)/3
     */
    public void averageGrade() {
        this.setAverageGrade((this.getPrelimGrade() + this.getMidtermGrade() + this.getFinalGrade()) / 3);
    }

    /* 
    vi. Create RemarksValue method
    Test avgGrd to derive remarks
    avgGrd remarks
    Above 100 Invalid Grade
    96.00-100.00 With Highest Honors
    91.00-95.99 With High Honors
    87.00-90.99 With Honors
    74.50-86.99 Passed
    Below 74.50 Failed
     */
    public void remarksValue() {

        if (this.getAverageGrade() > 100.00) {
            this.setStudentRemarks("Invalid Grade");
        } else if (this.getAverageGrade() >= 96.00 && this.getAverageGrade() <= 100.00) {
            this.setStudentRemarks("With Highest Honors");
        } else if (this.getAverageGrade() >= 91.00 && this.getAverageGrade() <= 95.99) {
            this.setStudentRemarks("With High Honors");
        } else if (this.getAverageGrade() >= 87 && this.getAverageGrade() <= 90.99) {
            this.setStudentRemarks("With Honors");
        } else if (this.getAverageGrade() >= 74.50 && this.getAverageGrade() <= 86.99) {
            this.setStudentRemarks("Passed");
        } else if (this.getAverageGrade() < 74.50) {
            this.setStudentRemarks("Failed");
        }

    }

    /*
    vii. Create a SexValue method
    Test for sexCode
    sexCode sex
    ‘F’ ‘Female’
    ‘M’ ‘Male
     */
    public void sexValue() {

        switch (super.getSexCode()) {

            case 'F':
                this.setStudentSex("Female");
                break;

            case 'M':
                this.setStudentSex("Male");
                break;

        }

    }

    // ❖ Create the appropriate number of Setters & Getters
    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(String studentDegree) {
        this.studentDegree = studentDegree;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public int getNOU() {
        return NOU;
    }

    public void setNOU(int NOU) {
        this.NOU = NOU;
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getRPU() {
        return RPU;
    }

    public void setRPU(double RPU) {
        this.RPU = RPU;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getMiscFee() {
        return miscFee;
    }

    public void setMiscFee(double miscFee) {
        this.miscFee = miscFee;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getStudentRemarks() {
        return studentRemarks;
    }

    public void setStudentRemarks(String studentRemarks) {
        this.studentRemarks = studentRemarks;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

}
