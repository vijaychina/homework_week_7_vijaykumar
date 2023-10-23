package homework_7;

/**
 * Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)
 */
import java.util.Scanner;
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner
        scanner.close();
    }
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number ");
    }
}

