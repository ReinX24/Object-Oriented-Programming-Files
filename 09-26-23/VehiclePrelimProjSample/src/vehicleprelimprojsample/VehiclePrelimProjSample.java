package vehicleprelimprojsample;

import java.util.Scanner;

public class VehiclePrelimProjSample {

    public static void main(String[] args) {

        // Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Car object where we will put our user inputs
        Car myCar = new Car();

        System.out.println("<<< CAR DATA ENTRY >>>");

        System.out.print("1] Brand Name: ");
        String brandName = userInput.nextLine();
        myCar.setBrandName(brandName);

        System.out.print("2] Model Name: ");
        String modelName = userInput.nextLine();
        myCar.setModelName(modelName);

        System.out.print("3] Model Year: ");
        String modelYear = userInput.nextLine();
        myCar.setModelYear(modelYear);

        System.out.print("4] Model Color: ");
        String modelColor = userInput.nextLine();
        myCar.setModelColor(modelColor);

        System.out.print("5] Has Siren [true/false]?: ");
        boolean hasSiren = userInput.nextBoolean();
        myCar.setHasSiren(hasSiren);

        System.out.println("<<< CAR DETAILS >>>");
        System.out.println("The car is a " + myCar.getModelColor() + ", " + myCar.getBrandName() + ".");
        System.out.println("It's a " + myCar.getModelYear() + " " + myCar.getModelName() + ".");
        myCar.sirenResult();

    }

}
