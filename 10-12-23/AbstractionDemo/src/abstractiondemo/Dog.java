package abstractiondemo;

import java.util.Scanner;

public class Dog extends Animal {

    // Required implementation of methods since the parent class is abstract 
    @Override
    public void walk() {
        System.out.println("The Dog can walk...");
    }

    @Override
    public void eat() {
        System.out.println("The Dog can eat...");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog can sleep...");
    }

}
