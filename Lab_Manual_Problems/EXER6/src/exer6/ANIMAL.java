package exer6;

public abstract class ANIMAL {

    String Name;
    String Kolor;
    int NoofLegs;

    public ANIMAL() {
        // Blank Constructor   
    }

    public ANIMAL(String Name, String Kolor, int NoofLegs) {
        // Constructor with 3 parameters.
        this.Name = Name;
        this.Kolor = Kolor;
        this.NoofLegs = NoofLegs;
    }

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
