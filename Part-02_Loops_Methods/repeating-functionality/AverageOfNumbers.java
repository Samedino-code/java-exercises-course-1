
import java.util.Scanner;

public class AverageOfNumbers {

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
            }
            sum = sum + number;
            numbers = numbers + 1;
            avg = (double)sum / numbers;
            
        }
        System.out.println("Average of the numbers: " + avg);

    }
}
