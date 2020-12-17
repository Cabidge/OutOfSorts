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
        compareSorts(3, 100, 'A');
        compareSorts(4, 50, 'A');
        compareSorts(5, 45, 'A');
    }

    public static void compareSorts(int length, int bound, char section) {
        int[] unsorted = randArray(length, bound); // in case we need to test other sorting algorithms
        int[] bubble = filledArray(unsorted);

        Arrays.sort(unsorted); // variable name no longer makes sense, but whatevs, no one's looking

        System.out.println("---");
        System.out.println("Bubble Sort:");
        Sorts.bubbleSort(bubble);
        System.out.println("---");
    
        System.out.println(" " + Arrays.toString(unsorted) + " - Arrays.sort()");
        System.out.println(" " + Arrays.toString(bubble) + " - bubble sort");
        if (Arrays.equals(bubble, unsorted)) {
            printGood("Arrays are equal");
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

    public static int[] filledArray(int[] contents) {
        int[] bag = new int[contents.length];
        for (int i = 0; i < contents.length; i++) {
            bag[i] = contents[i];
        }
        return bag;
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