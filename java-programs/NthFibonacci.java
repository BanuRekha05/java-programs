import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N value
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        if (n == 1) {
            System.out.println("Nth Fibonacci number is: " + a);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci number is: " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci number is: " + b);
        }

        sc.close();
    }
}
