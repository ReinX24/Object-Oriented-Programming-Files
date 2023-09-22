package javaarraysreview.javatutorials;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        String[] originalArray = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto"};

        String[] copyArray = new String[7];

        // Source Array, start of copying in original array, copyArray, start of
        // copyArray, how many elements will be copied to copyArray
        System.arraycopy(originalArray, 3, copyArray, 0, 7);

//        for (String eachElement : copyArray) {
//            System.out.println(eachElement);
//        }
        int[] originalIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyIntArray = new int[5];

        // Copying elements from index 3 (4 in originalIntArray) to 7 (8)
        // source, start index of source, destination, destination start index, 
        // amount of elements starting at index of source
        System.arraycopy(originalIntArray, 3, copyIntArray, 0, 5);

//        for (int eachInt : copyIntArray) {
//            System.out.println(eachInt);
//        }
        // Using the Arrays.copyOfRange method
        // source array, start index in source array, end index in source array (exclusive)
        copyArray = Arrays.copyOfRange(originalArray, 0, originalArray.length);

//        for (String eachElement : copyArray) {
//            System.out.println(eachElement);
//        }
        // Using binary search method to search for an element
//        System.out.println(Arrays.binarySearch(copyArray, "Freddo")); // 3
//        System.out.println(Arrays.binarySearch(copyArray, "Chicken")); // -1
        // Using the equals method to check if two arrays are the same
//        System.out.println(Arrays.equals(originalArray, copyArray));
        // Using the fill method
        int[] fillTest = new int[6];
        Arrays.fill(fillTest, 5); // fills array with the element 5
//        System.out.println(Arrays.toString(fillTest));

        // Using the sort method 
        int[] unsortedArray = {1, 5, 7, 3, 8, 4, 6, 2, 7, 4, 7, 2, 1};
//        Arrays.sort(unsortedArray);
        Arrays.parallelSort(unsortedArray); // another way of sorting an array, better for larger data sets
        System.out.println(Arrays.toString(unsortedArray));

    }

}
