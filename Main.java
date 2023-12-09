import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        String password;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Please enter a username: ");
            username = sc.nextLine();

            try {
                if (!isValidUsername(username)) {
                    throw new IllegalArgumentException("Invalid username. Please choose a different one without spaces or special characters.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!isValidUsername(username));

        do {
            System.out.print("Welcome, " + username + ". Now please enter a password: ");
            password = sc.nextLine();

            try {
                if (!isValidPassword(password)) {
                    throw new IllegalArgumentException("Password must contain at least one upper case letter and one special character");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!isValidPassword(password));

        System.out.println("You have been registered! Make sure to save your username and password!");
    }

    private static boolean isValidUsername(String username) {
        return !(username.matches(".*[^a-zA-Z0-9].*") || username.contains(" "));
    }

    private static boolean isValidPassword(String password) {
        return !password.contains(" ") && password.matches(".*[A-Z].*") && password.matches(".*[^a-zA-Z0-9].*");
    }
}
