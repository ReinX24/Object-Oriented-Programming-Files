package vehicleprelimprojsample;

public class Vehicle {

    // Private attributes for our Vehicle class
    private String brandName;
    private String modelName;
    private String modelYear;
    private String modelColor;

    // Blank constructor
    public Vehicle() {
    }

    // Constructor with 4 parameters
    public Vehicle(String brandName, String modelName, String modelYear, String modelColor) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelColor = modelColor;
    }

    // Getters and setters
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelColor() {
        return modelColor;
    }

    public void setModelColor(String modelColor) {
        this.modelColor = modelColor;
    }

}
