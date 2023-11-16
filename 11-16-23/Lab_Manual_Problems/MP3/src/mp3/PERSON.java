package mp3;

public class PERSON {

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
