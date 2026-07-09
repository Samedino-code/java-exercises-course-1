
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int numbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                numbers = numbers + 1;

            } else {
                continue;
            }

        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = (double) sum / numbers;
            System.out.println("Average of the numbers: " + avg);
        }

    }
}
