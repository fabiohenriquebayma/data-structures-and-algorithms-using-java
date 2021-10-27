package sort;

/**
 * Bubble Sort - traverse the array
 * Bubbles the largest value to the end of the array.
 * O(n squared) time complexity - quadratic.
 * More steps will take more time.
 * Normally each loops corresponds to N, as we have two loops
 * it is N times N (quadratic)
 */
public class BubbleStableSort {

    public static void main(String[] args) {
        sort(new int[]{20, 35, -15, 7, 55, 1, -22});
    }

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                int j = i + 1;
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
