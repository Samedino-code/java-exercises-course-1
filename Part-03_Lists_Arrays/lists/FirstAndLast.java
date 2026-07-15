
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        int lastindex = list.size() -1;
        int firstindex = 0;
        
        System.out.println(list.get(firstindex));
        System.out.println(list.get(lastindex));

    }
}
