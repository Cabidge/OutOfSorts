import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        /*
        For more clarity
        ✔ - Correct
        ✘ - Very no good
        */

        
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