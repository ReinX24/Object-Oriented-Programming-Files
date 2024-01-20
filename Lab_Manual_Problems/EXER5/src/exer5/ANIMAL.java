package exer5;

public abstract class ANIMAL {

    /*
    2. Open a New Java class as ANIMAL.
    a. It has the following attributes:
    • Animal name (Name)
    • Animal color (Kolor)
    • Animal legs (NoofLegs)
     */
    String Name;
    String Kolor;
    int NoofLegs;

    /* 
    b. It has an abstract method as AnimalSound().
    c. It has a blank constructor. And another one with 3 parameters.
     */
    public ANIMAL() {
        // Blank Constructor   
    }

    public ANIMAL(String Name, String Kolor, int NoofLegs) {
        // Constructor with 3 parameters.
        this.Name = Name;
        this.Kolor = Kolor;
        this.NoofLegs = NoofLegs;
    }

    /*    
    d. Use setters and getters 
     */
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getKolor() {
        return Kolor;
    }

    public void setKolor(String Kolor) {
        this.Kolor = Kolor;
    }

    public int getNoofLegs() {
        return NoofLegs;
    }

    public void setNoofLegs(int NoofLegs) {
        this.NoofLegs = NoofLegs;
    }

    public abstract void AnimalSound();

}
