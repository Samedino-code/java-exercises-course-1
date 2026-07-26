
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (loginChecker(username, password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }


    }
   public static boolean loginChecker (String username, String password) {
    if (username.equals("alex") && password.equals("sunshine")) {
        return true;
    } else if (username.equals("emma") && password.equals("haskell")) {
        return true;
    } else {
        return false;
    }
}
}
