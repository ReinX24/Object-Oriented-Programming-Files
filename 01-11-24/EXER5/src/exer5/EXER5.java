package exer5;

import java.util.Scanner;

public class EXER5 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        DOG Chihuahua = new DOG();

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
    }

}
