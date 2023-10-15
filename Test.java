import java.io.Console;

public class Test {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available. Please run this program in a terminal.");
            System.exit(1);
        }

        // Read a password securely without displaying characters
        char[] password = console.readPassword("Enter your password: ");

        // You can convert the password to a String if needed
        String passwordString = new String(password);

        // Do something with the password
        System.out.println("Password: " + passwordString);
    }
}


