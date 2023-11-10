package abstract_blk1;

// 5.	Create a new Class, name it Parihaba.
// •	Inherit the characteristics of the Shape.
public class Parihaba extends Shape {

    // •	Declare an attribute Remark as String, equivalent to "This is a Rectangle...".
    public String Remark = "This is a Rectangle...";

    // •	Declare an attribute Area as double.
    private double Area;

    // •	Declare an attribute Perimeter as double
    private double Perimeter;

    @Override
    public void Area() {
        // •	Create the implementation for the Area.
        // a.	Note: Area for is equivalent to the value of Length x Width
        // b.	Display the result as: The Area of the Rectangle is: _________      
        this.Area = this.getLength() * this.getWidth();
        System.out.println("The Area of the Rectangle is: " + this.Area);
    }

    @Override
    public void Perimeter() {
        // •	Create the implementation for the Perimeter.
        // a.	Note: Perimeter is equivalent to (2x the value of the Length + 2x the value of the Width). 
        // b.	Display the result as: The Perimeter of the Rectangle is: _________
        this.Perimeter = (2 * this.getLength()) + (2 * this.getWidth());
        System.out.println("The Perimeter of the Rectangle is: " + this.Perimeter);
    }

}
