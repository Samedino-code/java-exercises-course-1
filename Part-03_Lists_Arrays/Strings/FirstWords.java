
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            printFirst(input);
        }

    }
    public static void printFirst (String text) {
        String[] pieces = text.split(" ");
        System.out.println(pieces[0]);
    }
}
