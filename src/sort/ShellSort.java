package sort;

/**
 * Shell Sort (Donald Shell) - Unstable
 * In-place algorithm
 * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n squared),
 * but can better much better than that.
 * A variation of Insertion Sort.
 * Insertion sort chooses which element to insert using a gap of 1.
 * Shell Sort starts out using a larger gap value.
 * As the algorithm runs, the gap is reduced.
 * Goal is to reduce the amount of shifting required, it doesn't require as much shifting as inserting sort,
 * so it usually performs better.
 * It does some preliminary work using gaps that are greater than one and
 * it puts the elements closer to their position and then at the vay last
 * iteration when the value because one it does an insertion sort.
 * Knuth Sequence
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        for (int j : intArray) {
            System.out.println(j);
        }

    }
}
