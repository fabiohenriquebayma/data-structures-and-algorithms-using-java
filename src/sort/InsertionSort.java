package sort;

/**
 * Insertion Sort - Stable
 * O(n squared) - two loops
 * Recoding from the Course: Data Structures and Algorithms: Deep Dive Using Java, Created by:
 * Tim Buchalka, Goran Lochert, Tim Buchalka's Learn Programming Academy with Sarah Ettritch
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] values = { 20, 35, -15, 7, 55, 1, -22 };

        for (int currentUnsortedIndex = 1; currentUnsortedIndex < values.length;
             currentUnsortedIndex++) {

            int currentUnsortedValue = values[currentUnsortedIndex];

            int i;

            for (i = currentUnsortedIndex; i > 0 && values[i - 1] > currentUnsortedValue; i--) {
                values[i] = values[i - 1];
            }

            values[i] = currentUnsortedValue;
        }

        for (int j : values) {
            System.out.println(j);
        }
    }

}
