
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            } else {
                lineByLine(input);
            }
        }

    }

    public static void lineByLine(String text) {
        String[] pieces = text.split(" ");
        for (String piece : pieces) {
            System.out.println(piece);
        }

    }
}
