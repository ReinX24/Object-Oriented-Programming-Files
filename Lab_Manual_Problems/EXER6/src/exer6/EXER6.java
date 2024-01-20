package exer6;

import java.util.Scanner;

public class EXER6 {

    public static void main(String[] args) {
        /* 
        EXER6.java
        1. Open a New Project in Java as EXER6.java (main program)
         */

 /*
        6. The main program has the following requirements.
        a. Import the Scanner class
        b. Instantiate a scanner variable as SC.
        c. Instantiate an object of type DOG, as Chihuahua.
         */
        Scanner SC = new Scanner(System.in);

        // Menu to test the creation of DOG and BIRD objects
        System.out.println("[DATA ENTRY MENU]");
        System.out.println("1] DOG DATA ENTRY");
        System.out.println("2] BIRD DATA ENTRY");
        System.out.print("> ");
        int userChoice = SC.nextInt();
        SC.nextLine(); // to fix console formatting errors

        if (userChoice == 1) {
            DOG Chihuahua = new DOG();

            /* 
        d. Follow the I/O Layout as shown below.
        I/O Layout:
        <<< DOG DATA ENTRY >>>
        -
        1] Dog Breed (pls. specify): _______
        2] Dog Name: __________
        3] Dog Color: __________
        4] No. of Legs: _________
        -
        <<< DOG DETAILS >>>
        The dog’s name is <Name>.
        Its breed is <dogBreed>.
        It is color <Kolor>.
        And it has <NoofLegs> legs.
        -
        <Name> is a Land Animal.
        All Land Animal can walk, run, and jump.
             */
            System.out.println("<<< DOG DATA ENTRY >>>");
            System.out.println("-");

            System.out.print("1] Dog Breed (pls specify): ");
            Chihuahua.setDogBreed(SC.nextLine());

            System.out.print("2] Dog Name: ");
            Chihuahua.setName(SC.nextLine());

            System.out.print("3] Dog Color: ");
            Chihuahua.setKolor(SC.nextLine());

            System.out.print("4] No. of Legs: ");
            Chihuahua.setNoofLegs(SC.nextInt());

            System.out.println("-");
            System.out.println("<<< DOG DETAILS >>>");
            System.out.println("The dog's name is " + Chihuahua.getName() + ".");
            System.out.println("Its breed is " + Chihuahua.getDogBreed() + ".");
            System.out.println("It is color " + Chihuahua.getKolor() + ".");
            System.out.println("And it has " + Chihuahua.getNoofLegs() + " legs.");

            System.out.println("-");
            Chihuahua.LandDetails();
        } else if (userChoice == 2) {
            BIRD Parrot = new BIRD();
            System.out.println("");
            System.out.println("<<< BIRD DATA ENTRY >>>");
            System.out.println("-");

            System.out.print("1] Bird Breed (pls. specify): ");
            Parrot.setBirdBreed(SC.nextLine());

            System.out.print("2] Bird Name: ");
            Parrot.setName(SC.nextLine());

            System.out.print("3] Bird Color: ");
            Parrot.setKolor(SC.nextLine());

            System.out.print("4] No. of Legs: ");
            Parrot.setNoofLegs(SC.nextInt());

            System.out.println("-");
            System.out.println("<<< BIRD DETAILS >>>");
            System.out.println("The bird's name is " + Parrot.getName() + ".");
            System.out.println("Its breed is " + Parrot.getBirdBreed() + ".");
            System.out.println("It is color " + Parrot.getKolor() + ".");
            System.out.println("And it has " + Parrot.getNoofLegs() + " legs.");

            System.out.println("-");
            Parrot.airDetails();
        }

    }

}
