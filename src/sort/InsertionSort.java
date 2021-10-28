package sort;

/**
 *  Insertion Sort
 *  O(n squared) - two loops
 * Recoding from the Course: Data Structures and Algorithms: Deep Dive Using Java, Created by:
 * Tim Buchalka, Goran Lochert, Tim Buchalka's Learn Programming Academy with Sarah Ettritch
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }

}
