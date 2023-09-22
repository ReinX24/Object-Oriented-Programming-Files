package javaarraysreview.javatutorials;

public class JavaArraysReview {

    public static void main(String[] args) {

        // Creating an array of integers and printing their values
        int[] anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }

    }

}
