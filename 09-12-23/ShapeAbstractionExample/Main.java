
/*
 * author: Rein Aldwin E. Solis
 */

public class Main {
    public static void main(String[] args) {

        /*
         * Note: This represents the idea behind abstract classes
         * and how they are implemented and used. This is an advanced
         * topic that is still further ahead in the course and it will
         * seem confusing without the proper foundations of Object
         * Oriented Programming.
         */

        /*
         * This throws an error since Shape is an abstract class
         * and we cannot create abstract class object.
         */
        // Shape shapeOne = new Shape();

        /* Creating Circle and Square objects */
        Circle circleOne = new Circle();
        Square squareOne = new Square();

        /* Using our Circle and Square methods */
        circleOne.shapeIntro();
        circleOne.shapeDraw();

        squareOne.shapeIntro();
        squareOne.shapeDraw();

    }

}