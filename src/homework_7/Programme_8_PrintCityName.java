package homework_7;

/**
 *  Input any alphabet from “A" to “F” and print their city name accordingly
 *  (use if else) if any other alphabet should be invalid entry
 */
import java.util.Scanner;
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        scanner.close();
        switch (alphabet) {
            case 'A':
                System.out.println("City: Atlanta");
                break;
            case 'B':
                System.out.println("City: Boston");
                break;
            case 'C':
                System.out.println("City: Chicago");
                break;
            case 'D':
                System.out.println("City: Denver");
                break;
            case 'E':
                System.out.println("City: Los Angeles");
                break;
            case 'F':
                System.out.println("City: San Francisco");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }
}

