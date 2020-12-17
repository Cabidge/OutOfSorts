//import java.util.Arrays;

public class Sorts {
    /**Bubble sort of an int array. 
     *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data) {
        for (int passes = data.length - 1; passes > 0; passes--) { // Check all values, then one less value, then one less
            //System.out.println(Arrays.toString(data)); // testing
            
            boolean swapped = false;
            for (int i = 0; i < passes; i++) {
                if (data[i] > data[i + 1]) {
                    // swap values
                    swapped = true;
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
            if (!swapped) {
                return; // if no swaps, exit function; alternatively, 'passes = 0;' can work as well
            }
        }
    }
}