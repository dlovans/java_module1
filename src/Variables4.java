import java.util.Scanner;

/**
 * Calculate age in days, months, minutes.
 */
public class Variables4 {
    public void run() {
        byte age;
        int ageInDays;
        short ageInMonths;
        long ageInMinutes;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextByte();

        ageInMonths = Short.parseShort(String.valueOf(age * 12));
        ageInDays = age * 365;
        ageInMinutes = age * 365 * 24 * 60;

        System.out.println("Age: " + age + "\n" + "Age in months: " + ageInMonths + "\n" + "Age in days: " + ageInDays + "\n" + "Age in minutes: " + ageInMinutes);
    }
}
