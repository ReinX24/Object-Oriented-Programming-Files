
/* 
 * This is a child class of the Shape class, it inherits all of the methods 
 * and attributes (though there are none) from the abstract Shape class. 
 */

public class Circle extends Shape {

    @Override // this is an annotation, it is similar to how a comment works
    void shapeIntro() {
        System.out.println("This is a Circle..."); // overriding original method
    }

    @Override
    void shapeDraw() {
        System.out.println("The Circle is being drawn... O");
    }

}
