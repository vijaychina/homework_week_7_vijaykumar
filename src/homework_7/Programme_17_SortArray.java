package homework_7;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Sorting a Numeric Array
        int[] numericArray = {4, 1, 8, 2, 6, 7, 3, 9, 5, 11};
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending): " + Arrays.toString(numericArray));
        // Sorting a String Array
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Fig"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));
    }
}

