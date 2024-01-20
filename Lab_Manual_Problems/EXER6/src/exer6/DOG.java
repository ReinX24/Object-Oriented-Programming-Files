package exer6;

public class DOG extends ANIMAL implements landAnimal {

    /*
    4. Open a New Java class as DOG and inherits from ANIMAL and landAnimal classes.
    • Copy & Paste the contents of the DOG class from EXER5.java.
    • It will execute the LandDetails() as:
    <Name> is a Land Animal.
    All Land Animal can walk, run, and jump.
     */
    String dogBreed;

    public DOG() {
        // Blank constructor
    }

    public DOG(String dogBreed, String Name, String Kolor, int NoofLegs) {
        super(Name, Kolor, NoofLegs);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public void AnimalSound() {
        System.out.println("The DOG says... Arf! Arf! Arf!");
    }

    @Override
    public void LandDetails() {
        System.out.println(this.getName() + " is a Land Animal.");
        System.out.println("All Land Animal can walk, run, and jump.");
    }

}
