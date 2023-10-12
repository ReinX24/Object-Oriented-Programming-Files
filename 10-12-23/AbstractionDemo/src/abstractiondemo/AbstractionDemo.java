package abstractiondemo;

import java.util.Scanner;

public class AbstractionDemo {

    public static void main(String[] args) {

        // Asking the user which kind of animal do they want
        Scanner userInput = new Scanner(System.in);
        System.out.println("[Popoy's Pet Shop]");
        System.out.println("1] Dog");
        System.out.println("2] Cat");
        System.out.println("3] Bird");
        System.out.print("> ");
        int animalChoice = userInput.nextInt();

        // Evaluating the user's choice
        switch (animalChoice) {
            case 1:
                Dog dogOne = new Dog();

                dogOne.setAnimalName("Dave");
                dogOne.setAnimalColor("Brown");
                dogOne.setNoOfLegs(4);
                dogOne.print();

                dogOne.walk();
                dogOne.eat();
                dogOne.sleep();
                break;

            case 2:
                Cat catOne = new Cat();

                catOne.setAnimalName("Kitty");
                catOne.setAnimalColor("Orange");
                catOne.setNoOfLegs(4);
                catOne.print();

                catOne.walk();
                catOne.eat();
                catOne.sleep();
                break;

            case 3:
                Bird birdOne = new Bird();

                birdOne.setAnimalName("Tweety");
                birdOne.setAnimalColor("Yellow");
                birdOne.setNoOfLegs(2);
                birdOne.print();

                birdOne.walk();
                birdOne.eat();
                birdOne.sleep();
                break;

            // If the user does not enter a valid number choice 
            default:
                System.out.println("Animal does not exist!");
                break;
        }

    }

}
