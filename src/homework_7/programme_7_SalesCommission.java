package homework_7;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;
public class programme_7_SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        double commission = calculateCommission(salesAmount);
        scanner.close(); // scanner close
        System.out.println("_____");
        System.out.println("| Sales Commission Calculator |");
        System.out.println("|____|");
        System.out.println("| Sales ID: " + salesId + "               |");
        System.out.println("| Seller's Name: " + sellerName + "  |");
        System.out.println("| Sales Amount: " + salesAmount + "      |");
        System.out.println("| Basic Salary: " + basicSalary + "      |");
        System.out.println("| Commission: " + commission + "          |");
        System.out.println("|===========================|");    }
    public static double calculateCommission(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05;
        } else {
            return salesAmount * 0.02;
        }
    }
}
