package mp3a;

public class STUDENT extends PERSON {

    /*
    3. Open a New Java Class as STUDENT. It has the following details:
        * It inherits the attributes of the PERSON class.
        * It has 4 attributes:
        a. Degree (ex. BSCS)
        b. Year (ex. 1 )
        c. No. of Units Enrolled (ex. 21)
        d. Miscellaneous Fee (fix value at 4750.00 )
        * It has a blank constructor and another one with 6 parameters.
        * It has the following methods:
        a. yearInWords() method returns the equivalent String value based from the Year.
        Year Words
        1 First Year
        2 Second Year
        3 Third Year
        4 Fourth Year
        b. tuitionFee() method returns the product of No. of Units Enrolled and 500.
        c. totalFees() method returns the sum of Miscellaneous Fee and tuitionFee().
        * Declare setters and Getters.
     */
    private String Degree;
    private int Year;
    private int NoUnitsEnrolled;
    private final double miscellaneousFee = 4750.00;

    public STUDENT() {
    }

    public STUDENT(String Name, String Sex, int Age, String Degree, int Year, int NoUnitsEnrolled) {
        this.Name = Name;
        this.Sex = Sex;
        this.Age = Age;
        this.Degree = Degree;
        this.Year = Year;
        this.NoUnitsEnrolled = NoUnitsEnrolled;
    }

    public String yearInWords() {
        switch (this.getYear()) {
            case 1:
                return "First Year";

            case 2:
                return "Second Year";

            case 3:
                return "Third Year";

            default:
                return "Fourth Year";
        }
    }

    public int tuitionFee() {
        return this.getNoUnitsEnrolled() * 500;
    }

    public double totalFees() {
        return this.miscellaneousFee + tuitionFee();
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getNoUnitsEnrolled() {
        return NoUnitsEnrolled;
    }

    public void setNoUnitsEnrolled(int NoUnitsEnrolled) {
        this.NoUnitsEnrolled = NoUnitsEnrolled;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}
