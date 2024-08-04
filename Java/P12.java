import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the number of inputs from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Initializing variables for max, min, sum, and count
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0.0;
        int count = 0;

        // Taking n inputs from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            
            // Updating max and min
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            
            // Updating sum and count
            sum += number;
            count++;
        }
        
        // Calculating average
        double average = sum / count;

        // Displaying the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);

        scanner.close();
    }
}
