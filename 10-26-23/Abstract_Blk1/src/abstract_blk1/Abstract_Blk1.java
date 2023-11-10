package abstract_blk1;

// 1.	Create a new Project:  Abstract_Blk1 
import java.util.Scanner;

public class Abstract_Blk1 {

    public static void main(String[] args) {

        // Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Parisukat object to store Side, Area, and Perimeter values
        Parisukat mySquare = new Parisukat();

        // 4. Consider the Input/Output layout in the main program as shown below.
        // a. Display the heading.
        System.out.println("<<< The Shape Hierarchy >>>");

        // b. Call the attribute Remark from the Parisukat class.
        System.out.println("-");
        System.out.println(mySquare.Remark);

        // c. Display & Accept for ----> Enter a Value for the side: _________   
        System.out.print("Enter a Value for the side: ");
        double sideInput = userInput.nextDouble();
        mySquare.setSide(sideInput);

        // d. Display the Value of Side ---> The value of the side is: _________
        System.out.println("-");
        System.out.println("The value of the side of the Square is: " + mySquare.getSide());

        // e. Call Area() method.
        mySquare.Area();

        // f. Call Perimeter method.
        mySquare.Perimeter();

        // Parihaba object to store Length, Width, Area, and Perimeter values
        Parihaba myRectangle = new Parihaba();

        // 6. Consider the Input/Output layout in the main program as shown below.
        // a. Call the attribute Remark from the Parihaba class.
        System.out.println("-");
        System.out.println(myRectangle.Remark);

        // b. Display & Accept for ---->         Enter a Value for the Length: _________    
        System.out.print("Enter a Value for the Length: ");
        double lengthInput = userInput.nextDouble();
        myRectangle.setLength(lengthInput);

        // c. Display & Accept for ---->         Enter a Value for the Width : _________ 
        System.out.print("Enter a Value for the Width: ");
        double widthInput = userInput.nextDouble();
        myRectangle.setWidth(widthInput);

        // d. Display the Value of Length ---> The value of the Length is: _________
        System.out.println("-");
        System.out.println("The value of the Length of the Rectangle is: " + myRectangle.getLength());

        // e. Display the Value of Width --->  The value of the Width is: _________
        System.out.println("The value of the Width of the Rectangle is: " + myRectangle.getWidth());

        // f. Call Area() method.
        myRectangle.Area();

        // g. Call Perimeter method.
        myRectangle.Perimeter();

        // Bilog object to store Radius, Area, and Perimeter values
        Bilog myCircle = new Bilog();

        // 9. Consider the Input/Output layout in the main program as shown below.
        // a. Call the attribute Remark from the Bilog class.
        System.out.println("-");
        System.out.println(myCircle.Remarks);

        // b. Display & Accept for ---->         Enter a Value for the Radius: _________ 
        System.out.print("Enter a Value for the Radius: ");
        double radiusInput = userInput.nextDouble();
        myCircle.setRadius(radiusInput);

        // c. Display the value of Radius ---> The value of the Radius is: _________
        System.out.println("-");
        System.out.println("The value of the Radius of the Circle is: " + myCircle.getRadius());

        // d. Call Area() method.
        myCircle.Area();

        // e. Call Perimeter method.
        myCircle.Perimeter();

    }

}
