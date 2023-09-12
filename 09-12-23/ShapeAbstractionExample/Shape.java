
/*
 * This is an example of an abstract class. An abstract class is a class
 * where we cannot instantiate objects of that class. This class is mainly
 * used for as somesort of a template for child classes of this class.
 * 
 */

public abstract class Shape {

    /*
     * This method is passed into child classes of this class
     */
    void shapeIntro() {
        System.out.println("This is a Shape...");
    }

    /*
     * This method cannot be instantiated here but once another
     * class become the child class of this class, that class
     * will now require this method to be instantiated in that
     * class.
     */
    abstract void shapeDraw();

}
