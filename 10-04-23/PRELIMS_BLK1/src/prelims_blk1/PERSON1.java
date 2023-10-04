package prelims_blk1;

/* 
❖ The PERSON1 class has the following attributes.
i. firstName / string
ii. lastName / string
iii. sexCode / char
 */
public class PERSON1 {

    // ❖ Set all attributes to private
    private String firstName;
    private String lastName;
    private char sexCode;

    // ❖ Create a blank Constructor
    public PERSON1() {
    }

    // ❖ Create a Constructor that will have the 3 parameters shown above
    public PERSON1(String firstName, String lastName, char sexCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexCode = sexCode;
    }

    // ❖ Create Setters & Getters.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSexCode() {
        return sexCode;
    }

    public void setSexCode(char sexCode) {
        this.sexCode = sexCode;
    }
}
