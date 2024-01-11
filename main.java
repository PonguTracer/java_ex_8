import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        double[] values = new double[3];
        double sum = 0.0;


        // Get user input
        for (int i = 0; i < values.length; i++) {
            values[i] = scnr.nextDouble();
            sum += values[i];
        }
        scnr.close();

        // Calculating the average
        double average = sum / values.length;

        // Outputting the array values
        System.out.print("Array items: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }

        // Outputting the average
        System.out.println("\nAverage: " + average);

    }
}
