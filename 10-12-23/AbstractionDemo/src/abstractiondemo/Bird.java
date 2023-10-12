package abstractiondemo;

public class Bird extends Animal {

    @Override
    public void walk() {
        System.out.println("The Bird can walk...");
    }

    @Override
    public void eat() {
        System.out.println("The Bird can eat...");
    }

    @Override
    public void sleep() {
        System.out.println("The Bird can sleep...");
    }

}
