package abstract_blk1;

// 8.	Create a new Class, name it Bilog.
import java.awt.geom.Area;

// •	Inherit the characteristics of the Shape.
public class Bilog extends Shape {

    // •	Declare an attribute Remark as String, equivalent to "This is a Circle...".
    public String Remarks = "This is a Circle...";

    // •	Declare an attribute Area as double.
    private double Area;

    // •	Declare an attribute Perimeter as double.
    private double Perimeter;

    @Override
    public void Area() {
        // •	Create the implementation for the Area.
        // a.	Note: Area for is equivalent to the value of Pi x Radius x Radius
        // b.	Display the result as: The Area of the Circle is: _________      
        this.Area = Math.PI * this.getRadius() * this.getRadius();
        System.out.println("The Area of the Circle is: " + this.Area);
    }

    @Override
    public void Perimeter() {
        // •	Create the implementation for the Perimeter.
        // a.	Note: Perimeter is equivalent to 2 x Pi x Radius. 
        // b.	Display the result as: The Perimeter of the Circle is: _________
        this.Perimeter = 2 * Math.PI * this.getRadius();
        System.out.println("The Perimeter of the Circle is: " + this.Perimeter);
    }

}
