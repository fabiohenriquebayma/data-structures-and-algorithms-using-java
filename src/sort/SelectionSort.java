package sort;

/**
 * Selection Sort (Unstable)
 * O(n squared) - two loops
 * Performs better than Bubble Sort, because
 * it doesn't require much swapping as bubble sort, but
 * if we have duplicated items there is not guarantee that
 * they original order will be preserved (unstable).
 * Recoding from the Course: Data Structures and Algorithms: Deep Dive Using Java, Created by:
 * Tim Buchalka, Goran Lochert, Tim Buchalka's Learn Programming Academy with Sarah Ettritch
 */
public class SelectionSort {

    public static void main(String[] args) {
        sort(new int[]{50, 20, 35, 55, -15, 7, 55, 1, -22, -40});
    }

    public static void sort(int[] values) {

        for (int lastUnsortedIndex = values.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (values[i] > values[largest]) {
                    largest = i;
                }
            }

            swap(values, largest, lastUnsortedIndex);

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
