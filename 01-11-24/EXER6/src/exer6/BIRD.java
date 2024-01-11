package exer6;

public class BIRD extends ANIMAL implements airAnimal {

    String birdBreed;

    public BIRD() {
    }

    public BIRD(String birdBreed, String Name, String Kolor, int NoofLegs) {
        super(Name, Kolor, NoofLegs);
        this.birdBreed = birdBreed;
    }

    public String getBirdBreed() {
        return birdBreed;
    }

    public void setBirdBreed(String birdBreed) {
        this.birdBreed = birdBreed;
    }

    @Override
    public void AnimalSound() {
        System.out.println("The BIRD says... Chirp! Chirp! Chirp!");
    }

    @Override
    public void airDetails() {
        System.out.println(this.getName() + " is an Air Animal.");
        System.out.println("All Air Animal can walk, run, jump, fly, and dive.");
    }

}
