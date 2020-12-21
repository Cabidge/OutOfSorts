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

    /**selection sort of an int array. 
     *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data - the elements to be sorted.
    */
    public static void selectionSort(int[] data) {
        for (int sortedCount = 0; sortedCount < data.length - 1; sortedCount++) {
            //System.out.println(Arrays.toString(data)); // testing
            int smol = sortedCount; // Stores the index of smallest element in current pass
            for (int i = sortedCount + 1; i < data.length; i++) {
                if (data[smol] > data[i]) {
                    smol = i;
                }
            }
            int temp = data[smol];
            data[smol] = data[sortedCount];
            data[sortedCount] = temp;
        }
    }
    
    /**insertion sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data - the elements to be sorted.
    */
    public static void insertionSort(int[] data) {
        for (int sortedCount = 1; sortedCount < data.length; sortedCount++) {
            //System.out.println(Arrays.toString(data)); // testing
            int currentValue = data[sortedCount];
            for (int i = sortedCount; i >= 0; i--) {
                if (i == 0 || currentValue >= data[i - 1]) {
                    data[i] = currentValue;
                    i = 0;
                } else {
                    data[i] = data[i - 1]; // copy the left element to the current index 
                }
            }
        }
    }
}