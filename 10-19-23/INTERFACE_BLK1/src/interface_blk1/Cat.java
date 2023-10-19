package interface_blk1;

public class Cat extends HAYOP implements Animal {

    public Cat() {
    }

    public Cat(String animalName, String animalColor, String animalBreed) {
        super(animalName, animalColor, animalBreed);
    }

    @Override
    public void Sound() {
        System.out.println("The Cat says... Meow Meow Meow!");
    }

    @Override
    public void Eat() {
        System.out.println("The Cat eats Cat food!");
    }

}
