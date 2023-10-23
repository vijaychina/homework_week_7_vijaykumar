package homework_7;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 */
import java.util.Scanner;
public class Programme_2_LeapYear {
    // create a scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        scanner.close(); // scanner close
        // if else used
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


