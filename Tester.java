import java.util.Random;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        /*
        For more clarity
        ✔ - Correct
        ✘ - Very no good
        */
        
        // A. Simple tests
        printSection('A');
        compareSorts(randArray(3, 100), 'A');
        compareSorts(randArray(4, 50), 'A');
        compareSorts(randArray(5, 45), 'A');

        // B. Empty/Sorted array
        printSection('B');
        int[] empty = new int[0];
        try {
            Sorts.bubbleSort(empty);
            printGood("No error ocurred");
            if (Arrays.equals(empty, new int[0])) {
                printGood("Array Stayed Empty");
            } else {
                printBad('B');
            }
        } catch (RuntimeException e) {
            printBad('B');
        }
        int[] sorted = {0, 1, 2, 3, 4, 5, 8, 10, 12, 32};
        compareSorts(sorted, 'B');

        // C. Same elements
        printSection('C');
        int[] unsorted = {2, 2, 2, 2, 2, 2};
        compareSorts(unsorted, 'C');
        int[] unsorted2 = {2, 2, 4, 4, 2, 2, 3, 5, 5, 4};
        compareSorts(unsorted2, 'C');
        int[] unsorted3 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, -99}; // Also reverse sorted
        compareSorts(unsorted3, 'C');

        // D. Reverse Sorted
        printSection('D');
        int[] reversed = {12, 8, 6, 3, 1};
        compareSorts(reversed, 'D');
        int[] reversed2 = new int[32];
        for (int i = 0, j = reversed2.length; i < reversed2.length; i++, j--) {
            reversed2[i] = j;
        }
        compareSorts(reversed2, 'D');

        // E. More Randoms
        printSection('E');
        compareSorts(randArray(20, 3), 'E');
        compareSorts(randArray(12, 12), 'E');
        compareSorts(randArray(42, 24), 'E');
    }

    public static void compareSorts(int[] unsorted, char section) {
        int[] bubble = Arrays.copyOf(unsorted, unsorted.length);
        int[] selection = Arrays.copyOf(unsorted, unsorted.length);
        int[] insertion = Arrays.copyOf(unsorted, unsorted.length);

        Arrays.sort(unsorted); // variable name no longer makes sense, but whatevs, no one's looking

        System.out.println("---");
        System.out.println("Bubble Sort:");
        Sorts.bubbleSort(bubble);
        System.out.println("---");
        System.out.println("Selection Sort:");
        Sorts.selectionSort(selection);
        System.out.println("---");
        System.out.println("Insertion Sort:");
        Sorts.insertionSort(insertion);
        System.out.println("---");
    
        System.out.println("  " + Arrays.toString(unsorted) + " - Arrays.sort()");
        System.out.println("  " + Arrays.toString(bubble) + " - bubble sort");
        System.out.println("  " + Arrays.toString(selection) + " - selection sort");
        System.out.println("  " + Arrays.toString(insertion) + " - insertion sort");
        if (Arrays.equals(bubble, unsorted)) {
            printGood("Bubble is correct");
        } else {
            printBad(section);
        }
        if (Arrays.equals(selection, unsorted)) {
            printGood("Selection is correct");
        } else {
            printBad(section);
        }
        if (Arrays.equals(insertion, unsorted)) {
            printGood("Insertion is correct");
        } else {
            printBad(section);
        }
    }

    public static int[] randArray(int length, int bound) {
        Random rand = new Random();
        int[] out = new int[length];
        for (int i = 0; i < length; i++) {
            out[i] = rand.nextInt(bound);
        }
        return out;
    }

    public static void printGood(String comment) {
        System.out.println("✔ " + comment);
    }

    public static void printBad(char section) {
        System.out.println("✘ Whoops! Something went wrong in section " + section);
    }

    public static void printSection(char section) {
        System.out.println("\nSection " + section + ":");
    }
}