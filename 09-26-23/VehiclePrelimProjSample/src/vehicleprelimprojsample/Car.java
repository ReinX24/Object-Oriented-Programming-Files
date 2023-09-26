package vehicleprelimprojsample;

public class Car extends Vehicle {

    boolean hasSiren;

    public Car() {
    }

    public Car(boolean hasSiren, String brandName, String modelName, String modelYear, String modelColor) {
        super(brandName, modelName, modelYear, modelColor);
        this.hasSiren = hasSiren;
    }

    public boolean isHasSiren() {
        return hasSiren;
    }

    public void setHasSiren(boolean hasSiren) {
        this.hasSiren = hasSiren;
    }

    public void sirenResult() {
        if (this.hasSiren) {
            System.out.println("The car is equipped with a Siren.");
        } else {
            System.out.println("The car is not equipped with a Siren.");
        }
    }

}
