package exer5;

public class DOG extends ANIMAL {

    /* 
    3. Open a New Java class as DOG.
    a. It inherits from its super class.
    b. It has an attribute as dogBreed.
    c. It a blank constructor and another one which borrows the from the super class.
    d. It has implementation of the AnimalSound() method specific for the DOG class. And the output of
    which is as follows:
    The DOG says… Arf! Arf! Arf!
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

}
