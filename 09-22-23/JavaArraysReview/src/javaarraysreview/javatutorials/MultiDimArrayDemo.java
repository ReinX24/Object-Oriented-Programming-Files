package javaarraysreview.javatutorials;

public class MultiDimArrayDemo {

    public static void main(String[] args) {

        String[][] myNames = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        // Print Mr. Smith
        System.out.println(myNames[0][0] + myNames[1][0]);

        // Print Ms. Jones
        System.out.println(myNames[0][2] + myNames[1][1]);

        // Print Mrs. Smith and Mrs. Jones
        System.out.println(myNames[0][1] + myNames[1][0]);
        System.out.println(myNames[0][1] + myNames[1][1]);

    }

}
