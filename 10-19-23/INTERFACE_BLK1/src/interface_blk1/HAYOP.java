package interface_blk1;

public abstract class HAYOP {

    String animalName, animalColor, animalBreed;

    // Blank constructor and constructor with parameters
    public HAYOP() {
    }

    public HAYOP(String animalName, String animalColor, String animalBreed) {
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalBreed = animalBreed;
    }

    // Getters and setters
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

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

}
