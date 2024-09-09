import java.util.Scanner;

/**
 * Handle user sign-in and transaction.
 */
public class Variables5 {
    public void run() {
        boolean isLoggedIn = false;
        boolean purchaseComplete = false;
        String username;
        String password;
        String completeTransaction;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();

        System.out.println("Complete transaction? (Y/n) ");
        completeTransaction = input.next();

        if (!username.isEmpty() && !password.isEmpty()) {
            isLoggedIn = true;
        }

        if (completeTransaction.equalsIgnoreCase("Y")) {
            purchaseComplete = true;
        }

        if (isLoggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        if (purchaseComplete) {
            System.out.println("Transaction complete. Pleasure doing business...");
        } else {
            System.out.println("Transaction failed.");
        }

    }
}
