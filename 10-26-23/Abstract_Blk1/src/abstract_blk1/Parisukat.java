package abstract_blk1;

// 3.	Create a new Class, name it Parisukat.
// •	Inherit the characteristics of the Shape.
public class Parisukat extends Shape {

    // •	Declare an attribute Remark as String, equivalent to "This is a Square...".
    public String Remark = "This is a Square...";

    // •	Declare an attribute Area as double.
    private double Area;

    // •	Declare an attribute Perimeter as double.
    private double Perimeter;

    // •	Declare a blank constructor.
    public Parisukat() {
    }

    // •	Declare a constructor just like the parent class, 
    public Parisukat(double Area, double Perimeter, double Radius, double Length, double Width, double Base, double Height, double Side) {
        // and declare the super keyword afterwards.
        super(Radius, Length, Width, Base, Height, Side);
        this.Area = Area;
        this.Perimeter = Perimeter;
    }

    @Override
    public void Area() {
        // •	Create the implementation for the Area.
        // a.	Note: Area for Square is equivalent to the value of side x side
        // b.	Display the result as: The Area of the Square is: _________      
        this.Area = this.getSide() * this.getSide();
        System.out.println("The Area of the Square is: " + this.Area);
    }

    @Override
    public void Perimeter() {
        // •	Create the implementation for the Perimeter.
        // a.	Note: Perimeter is equivalent to 4 x the value of side
        // b.	Display the result as: The Perimeter of the Square is: _________
        this.Perimeter = this.getSide() * 4;
        System.out.println("The Perimeter of the Square is: " + this.Perimeter);
    }

}
