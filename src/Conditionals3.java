import java.util.Scanner;

/**
 * Checks if a year is a leap year.
 */
public class Conditionals3 {
    public void run() {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
