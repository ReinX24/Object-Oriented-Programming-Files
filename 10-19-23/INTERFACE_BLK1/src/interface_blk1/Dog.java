package interface_blk1;

// The Dog class extends the HAYOP class and implements the Animal interface
public class Dog extends HAYOP implements Animal {

    // Constructors for our attributes from HAYOP class
    public Dog() {
    }

    public Dog(String animalName, String animalColor, String animalBreed) {
        super(animalName, animalColor, animalBreed);
    }

    // Implemented methods from Animal interface
    @Override
    public void Sound() {
        System.out.println("The Dog Barks... Aw aw aw!!!");
    }

    @Override
    public void Eat() {
        System.out.println("The Dog eats Dog food...");
    }

}
