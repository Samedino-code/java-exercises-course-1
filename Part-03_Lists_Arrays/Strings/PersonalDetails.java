
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int count = 0;
        int sum = 0;
        String longestname = "";
        int longest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            String name = parts[0];
            int namelen = name.length();
            

            if (namelen > longest) {
                longest = namelen;
                longestname = name;
            }

        }
        avg = (double)sum / count;
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth years:" + avg);

    }
}
