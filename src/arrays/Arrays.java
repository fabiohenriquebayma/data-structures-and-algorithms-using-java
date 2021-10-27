package arrays;

/**
 * Arrays are memory efficient
 *
 * - Contiguous block in memory. Static length cannot scale in memory.
 * - Every element occupies the same amount of space in memory.
 * - When we create a stream of objects they are stored as references in array,
 * so they also will have the same size.
 * - If an array starts at memory x, and the size of each element in the array
 * is y, and i is the index of an item in the array, we can calculate the memory address of the each ith element by using the following
 * expression: x + (i * y).
 * - If we know the index of an element, the time to retrieve the element will be
 * the same, not matter where it is in the array.
 * intArray[0] = 12 + (0 * 4) = 12 then intArray[1] = 12 + (1 * 4) = 16.
 *
 * If JVM is doing a loop it can simple add 4 to the
 * previous item address so will not be necessary to multiply.
 *
 * Retrieve with index: O(1)
 * Retrieve without index: O(n)
 * Add an element to a full array: O(n)
 * Add an element to the end of an array (has space): O(1)
 * Insert or update an element at a specific index: O(1)
 * Delete an element by setting it to null: O(1)
 * Delete an element by shifting elements: O(n)
 *
 * If we code requires a loop is gonna be constant time, if the code requires
 * a loop will be a linear time.
 */
public class Arrays {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        //Constant Time Complexity O(1)
        System.out.println(intArray[3]);


        // Linear Time Complexity o(n), because we do not know where is 7
        int index = -1;
        for (int i : intArray) {
           if (intArray[i] == 7) {
               index = i;
               break;
           }
        }

        System.out.println("index = " + index);
    }
}





