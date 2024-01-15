package exer5;

public class DOG extends ANIMAL {

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

}
