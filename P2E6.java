import java.util.Scanner;

final class SecuritySystem {
    public boolean authenticateUser(String username, String password) {
        return "admin".equals(username) && "1234".equals(password);
    }
}

/*class AdvancedSecurity extends SecuritySystem {
    public boolean authenticateUser(String username, String password) {
        return true;
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecuritySystem system = new SecuritySystem();

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (system.authenticateUser(username, password)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        scanner.close();
    }
}
