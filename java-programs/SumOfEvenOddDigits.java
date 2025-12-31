import java.util.Scanner;

public class SumOfEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        // Process each digit
        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num = num / 10;
        }

        // Display results
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);

        sc.close();
    }
}
