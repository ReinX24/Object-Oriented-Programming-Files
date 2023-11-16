package mp3;

public class STUDENT extends PERSON {

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
