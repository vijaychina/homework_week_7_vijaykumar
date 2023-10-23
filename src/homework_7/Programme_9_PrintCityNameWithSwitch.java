package homework_7;

/**
 * Same as above program-8 using switch statement.
 */
import java.util.Scanner;
public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        scanner.close();
        if (alphabet == 'A') {
            System.out.println("City: Atlanta");
        } else if (alphabet == 'B') {
            System.out.println("City: Boston");
        } else if (alphabet == 'C') {
            System.out.println("City: Chicago");
        } else if (alphabet == 'D') {
            System.out.println("City: Denver");
        } else if (alphabet == 'E') {
            System.out.println("City: Los Angeles");
        } else if (alphabet == 'F') {
            System.out.println("City: San Francisco");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }
}

