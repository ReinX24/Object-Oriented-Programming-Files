package abstractiondemo;

public class Cat extends Animal {

    @Override
    public void walk() {
        System.out.println("The Cat can walk...");
    }

    @Override
    public void eat() {
        System.out.println("The Cat can eat...");
    }

    @Override
    public void sleep() {
        System.out.println("The Cat can sleep...");
    }

}
