package interface_blk1;

import java.util.Scanner;

public class INTERFACE_BLK1 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

//        Animal animalOne = new Animal(); // throws an exception

        /*
        Dog dogOne = new Dog();

        // Setting dogOne attributes
        System.out.print("Enter Dog Name: ");
        String dogName = userInput.nextLine();
        dogOne.setAnimalName(dogName);

        System.out.print("Enter Dog Color: ");
        String dogColor = userInput.nextLine();
        dogOne.setAnimalColor(dogColor);

        System.out.print("Enter Dog Breed: ");
        String dogBreed = userInput.nextLine();
        dogOne.setAnimalBreed(dogBreed);

        // Printing dogOne attributes
        System.out.println("The Dog Name is: " + dogOne.getAnimalName());
        System.out.println("The Dog Color is: " + dogOne.getAnimalColor());
        System.out.println("The Dog Breed is: " + dogOne.getAnimalBreed());
        
        // Using dogOne methods
        dogOne.Sound();
        dogOne.Eat();

         */
 /* 
        Bird birdOne = new Bird();

        System.out.print("Enter Bird Name: ");
        String birdName = userInput.nextLine();
        birdOne.setAnimalName(birdName);

        System.out.print("Enter Bird Color: ");
        String birdColor = userInput.nextLine();
        birdOne.setAnimalColor(birdColor);

        System.out.print("Enter Bird Breed: ");
        String birdBreed = userInput.nextLine();
        birdOne.setAnimalBreed(birdBreed);

        System.out.println("The Bird Name is: " + birdOne.getAnimalName());
        System.out.println("The Bird Color is: " + birdOne.getAnimalColor());
        System.out.println("The Bird Breed is: " + birdOne.getAnimalBreed());

        birdOne.Sound();
        birdOne.Eat();

         */
 /*
        Cat catOne = new Cat();

        System.out.print("Enter Cat Name: ");
        String catName = userInput.nextLine();
        catOne.setAnimalName(catName);

        System.out.print("Enter Cat Color: ");
        String catColor = userInput.nextLine();
        catOne.setAnimalColor(catColor);

        System.out.print("Enter Cat Breed: ");
        String catBreed = userInput.nextLine();
        catOne.setAnimalBreed(catBreed);

        System.out.println("The Cat Name is: " + catOne.getAnimalName());
        System.out.println("The Cat Color is: " + catOne.getAnimalColor());
        System.out.println("The Cat Breed is: " + catOne.getAnimalBreed());

        catOne.Sound();
        catOne.Eat();
         */
        System.out.println("<<< ANIMAL LIST >>>");
        System.out.println("1] Bird");
        System.out.println("2] Cat");
        System.out.println("3] Dog");
        System.out.print("Choice Please [1..3]: ");
        int userChoice = userInput.nextInt();
        userInput.nextLine(); // for fixing console formatting

        switch (userChoice) {

            case 1:
                Bird birdOne = new Bird();

                System.out.println("==========================================");
                System.out.print("Enter Bird Name: ");
                String birdName = userInput.nextLine();
                birdOne.setAnimalName(birdName);

                System.out.print("Enter Bird Color: ");
                String birdColor = userInput.nextLine();
                birdOne.setAnimalColor(birdColor);

                System.out.print("Enter Bird Breed: ");
                String birdBreed = userInput.nextLine();
                birdOne.setAnimalBreed(birdBreed);

                System.out.println("==========================================");
                System.out.println("The Bird Name is: " + birdOne.getAnimalName());
                System.out.println("The Bird Color is: " + birdOne.getAnimalColor());
                System.out.println("The Bird Breed is: " + birdOne.getAnimalBreed());
                System.out.println("==========================================");

                birdOne.Sound();
                birdOne.Eat();
                break;

            case 2:
                Cat catOne = new Cat();

                System.out.println("==========================================");
                System.out.print("Enter Cat Name: ");
                String catName = userInput.nextLine();
                catOne.setAnimalName(catName);

                System.out.print("Enter Cat Color: ");
                String catColor = userInput.nextLine();
                catOne.setAnimalColor(catColor);

                System.out.print("Enter Cat Breed: ");
                String catBreed = userInput.nextLine();
                catOne.setAnimalBreed(catBreed);

                System.out.println("==========================================");
                System.out.println("The Cat Name is: " + catOne.getAnimalName());
                System.out.println("The Cat Color is: " + catOne.getAnimalColor());
                System.out.println("The Cat Breed is: " + catOne.getAnimalBreed());
                System.out.println("==========================================");

                catOne.Sound();
                catOne.Eat();
                break;

            case 3:
                Dog dogOne = new Dog();

                System.out.println("==========================================");
                System.out.print("Enter Dog Name: ");
                String dogName = userInput.nextLine();
                dogOne.setAnimalName(dogName);

                System.out.print("Enter Dog Color: ");
                String dogColor = userInput.nextLine();
                dogOne.setAnimalColor(dogColor);

                System.out.print("Enter Dog Breed: ");
                String dogBreed = userInput.nextLine();
                dogOne.setAnimalBreed(dogBreed);

                System.out.println("==========================================");
                System.out.println("The Dog Name is: " + dogOne.getAnimalName());
                System.out.println("The Dog Color is: " + dogOne.getAnimalColor());
                System.out.println("The Dog Breed is: " + dogOne.getAnimalBreed());
                System.out.println("==========================================");

                dogOne.Sound();
                dogOne.Eat();
                break;

            default:
                System.err.println("Invalid Animal Choice");
                break;

        }

    }

}
