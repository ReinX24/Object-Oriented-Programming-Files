package exer5;

public class BIRD extends ANIMAL {

    /*
    5. Open a New Java class as BIRD.
    e. It inherits from its super class.
    f. It has an attribute as birdBreed.
    g. It a blank constructor and another one which borrows the from the super class.
    h. It has implementation of the AnimalSound() method specific for the BIRD class. And the output of
    which is as follows:
    The BIRD says… Chirp! Chirp! Chirp!
     */
    String birdBreed;

    public BIRD() {
    }

    public BIRD(String birdBreed, String Name, String Kolor, int NoofLegs) {
        super(Name, Kolor, NoofLegs);
        this.birdBreed = birdBreed;
    }

    @Override
    public void AnimalSound() {
        System.out.println("The BIRD says... Chirp! Chirp! Chirp!");
    }

}
