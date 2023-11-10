package abstract_blk1;

// 2.	Create a new Abstract Class called Shape
public abstract class Shape {

    /*
    •	Declare the following attributes as private:
a.	Radius as double
b.	Length as double
c.	Width  as double
d.	Base   as double
e.	Height as double
f.	Side as double
     */
    private double Radius;
    private double Length;
    private double Width;
    private double Base;
    private double Height;
    private double Side;

    // •	Declare a blank constructor.
    public Shape() {
    }

    // •	Declare a constructor with the 6 attributes shown above.
    public Shape(double Radius, double Length, double Width, double Base, double Height, double Side) {
        this.Radius = Radius;
        this.Length = Length;
        this.Width = Width;
        this.Base = Base;
        this.Height = Height;
        this.Side = Side;
    }

    // •	Declare an abstract method called Area.
    public abstract void Area();

    // •	Declare an abstract method called Perimeter.
    public abstract void Perimeter();

    // •	Declare the necessary Setter and Getter.\
    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

}
