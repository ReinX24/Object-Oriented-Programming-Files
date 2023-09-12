
/*
 * author: Rein Aldwin E. Solis
 */

public class Main {

    public static void main(String[] args) {

        /*
         * Creating a Person object
         * An object consists of different methods and attributes. Like how
         * pens have different colors and types. In this example, we will
         * be creating a Person object, this Person will have a first name,
         * last name, sex, and age. These values are defined in another file
         * so that our files are easier to maintain since it is not recommended
         * to have 2 classes in 1 Java file.
         * 
         * Note: I did not use packages in this example since it has not been
         * covered in class.
         */
        Person personOne = new Person(); // creating our Person object

        /* Setting personOne attributes */
        personOne.firstName = "Arnaldy";
        personOne.lastName = "Fortin";
        personOne.personSex = 'M';
        personOne.personAge = 30;

        /* Printing personOne attributes */
        System.out.println("************************************"); // dividers for cleaner console printing
        System.out.println("First Name: " + personOne.firstName);
        System.out.println("Last Name: " + personOne.lastName);
        System.out.println("Sex: " + personOne.personSex);
        System.out.println("Age: " + personOne.personAge);
        System.out.println("************************************");

        /*
         * Creating other Person objects, setting their attributes, and printing
         * their said attributes.
         */
        Person personTwo = new Person();

        personTwo.firstName = "John";
        personTwo.lastName = "Carmack";
        personTwo.personSex = 'M';
        personTwo.personAge = 53;

        System.out.println("************************************");
        System.out.println("First Name: " + personTwo.firstName);
        System.out.println("Last Name: " + personTwo.lastName);
        System.out.println("Sex: " + personTwo.personSex);
        System.out.println("Age: " + personTwo.personAge);
        System.out.println("************************************");

        Person studentOne = new Person();

        studentOne.firstName = "Sofia";
        studentOne.lastName = "Laforteza";
        studentOne.personSex = 'F';
        studentOne.personAge = 19;

        System.out.println("************************************");
        System.out.println("First Name: " + studentOne.firstName);
        System.out.println("Last Name: " + studentOne.lastName);
        System.out.println("Sex: " + studentOne.personSex);
        System.out.println("Age: " + studentOne.personAge);
        System.out.println("************************************");

    }

}