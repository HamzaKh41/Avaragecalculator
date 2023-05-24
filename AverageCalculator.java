import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / n;
        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}