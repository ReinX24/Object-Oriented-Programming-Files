package mp3a;

public class PERSON {

    /*
    2. Open a New Java Class as PERSON. It has the following details:
        * It has 3 attributes:
        a. Name (ex. Arnaldy D. Fortin)
        b. Sex (ex. Male)
        c. Age (ex. 38 )
        * It has a Heading() method, and it displays the following:
        Welcome to Universidad de Dagupan
        <<< DATA ENTRY >>>
        * Declare setters and getters.
     */
    String Name;
    String Sex;
    int Age;

    public void Heading() {
        System.out.println("Welcome to Universidad De Dagupan");
        System.out.println("<<< DATA ENTRY >>>");
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
