import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie eine Zahl ein.");
        int first =  Integer.valueOf(scanner.nextLine());
        
        int zahl = first * first;
        
        System.out.println(zahl);
    }
}
