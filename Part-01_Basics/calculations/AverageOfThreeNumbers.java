
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int z1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int z2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int z3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double)z1+(double)z2+(double)z3)/3);

    }
}
