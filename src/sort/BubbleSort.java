package sort;

/**
 * Bubble Sort - traverse the array
 * Bubbles the largest value to the end of the array.
 * O(n squared) time complexity - quadratic.
 * More steps will take more time.
 * Normally each loops corresponds to N, as we have two loops
 * it is N times N (quadratic)
 * Recoding from the Course: Data Structures and Algorithms: Deep Dive Using Java, Created by:
 * Tim Buchalka, Goran Lochert, Tim Buchalka's Learn Programming Academy with Sarah Ettritch
 */
public class BubbleSort {

    public static void main(String[] args) {
        sort(new int[]{20, 35, -15, 7, 55, 1, -22});
    }

    public static void sort(int[] values) {
        for (int lastUnsortedIndex = values.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                int j = i + 1;
                if (values[i] > values[j]) {
                    swap(values, i, j);
                }
            }
        }

        for (int j : values) {
            System.out.println(j);
        }
    }

    private static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

}
