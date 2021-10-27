package sort;

/**
 * Selection Sort (Unstable)
 * O(n squared) - two loops
 * Performs better than Bubble Sort, because
 * it doesn't require much swapping as bubble sort, but
 * if we have duplicated items there is not guarantee that
 * they original order will be preserved (unstable).
 */
public class SelectionUnstableSort {

    public static void main(String[] args) {
        sort(new int[]{20, 35, 55, -15, 7, 55, 1, -22});
    }

    public static void sort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, largest, lastUnsortedIndex);

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
