
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            int age = getAge(input);

            if (age > oldest) {
                oldest = age;
            }

        }
        System.out.println("Age of the oldest: " + oldest);

    }

    public static int getAge(String input) {
        String[] parts = input.split(",");
        return Integer.valueOf(parts[1]);
    }

}
