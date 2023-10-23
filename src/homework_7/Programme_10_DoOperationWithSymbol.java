package homework_7;

/**
 * Write a java program to input any two number and ask user to enter
 * their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division
 * according to their symbol  (using if else)
 */
import java.util.Scanner;
public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.close();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter a mathematical symbol (+, -, /, *): ");
        char operator = scanner.next().charAt(0);
        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, /, or *.");
        }
    }
}

