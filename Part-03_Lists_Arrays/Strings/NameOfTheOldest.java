
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameofoldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            int age = getAge(input);
            String name = parts[0];

            if (age > oldest) {
                oldest = age;
                nameofoldest = name;
            }

        }
        System.out.println("Name of the oldest: " + nameofoldest);

    }

    public static int getAge(String input) {
        String[] parts = input.split(",");
        return Integer.valueOf(parts[1]);
    }

}


    

