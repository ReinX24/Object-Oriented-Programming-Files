package abstractiondemo;

// When a class is abstract, we cannot create an object / instance of it
public abstract class Animal {

    private String animalName;
    private String animalColor;
    private int noOfLegs;

    // Abstract methods, implemented by child classes
    public abstract void walk();

    public abstract void eat();

    public abstract void sleep();

    public void print() {
        System.out.println("----------------------------------");
        System.out.println("Name: " + this.getAnimalName());
        System.out.println("Color: " + this.getAnimalColor());
        System.out.println("No. of Legs: " + this.getNoOfLegs());
        System.out.println("----------------------------------");
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

}
