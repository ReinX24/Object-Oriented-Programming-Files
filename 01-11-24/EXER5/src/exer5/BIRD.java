package exer5;

public class BIRD extends ANIMAL {

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
