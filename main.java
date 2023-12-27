import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Type your code here
        double[] values = new double[3];

        for (int i = 0; i < 3; i++) {
            values[i] = input.nextDouble()
;        }
        input.close();

        double sum = 0.0;

        for (double value : values) {
            sum += value;
        }
        double average = sum / 3.0;

        System.out.print("Array items: ");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(values[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Average: " + average);
    }
}
