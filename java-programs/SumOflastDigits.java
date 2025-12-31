import java.util.Scanner;

public class SumOfLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Get last digits
        int lastDigit1 = Math.abs(num1 % 10);
        int lastDigit2 = Math.abs(num2 % 10);

        // Calculate sum
        int sum = lastDigit1 + lastDigit2;

        // Display result
        System.out.println("Sum of last digits: " + sum);

        sc.close();
    }
}
