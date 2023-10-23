package homework_7;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO
 */
import java.util.Scanner;
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }
}

