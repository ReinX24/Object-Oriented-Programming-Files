package interface_blk1;

public class Bird extends HAYOP implements Animal {

    public Bird() {
    }

    public Bird(String animalName, String animalColor, String animalBreed) {
        super(animalName, animalColor, animalBreed);
    }

    @Override
    public void Sound() {
        System.out.println("The Bird Sings... Tweet tweet tweet!!!");
    }

    @Override
    public void Eat() {
        System.out.println("The Bird eats worms and Bird seeds...");
    }

}
