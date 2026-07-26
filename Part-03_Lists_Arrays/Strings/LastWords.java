
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            printLast(input);
        }

    }

    public static void printLast(String text) {
        String[] pieces = text.split(" ");
        System.out.println(pieces[pieces.length -1]);
    }
}
