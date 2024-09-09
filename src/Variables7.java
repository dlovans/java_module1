import java.util.Scanner;

/**
 * Converts value to integer or double.
 */
public class Variables7 {
    public void run() {
        int wholeNumber;
        double floatingNumber;
        String number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer or a double: ");

        number = input.nextLine();
        floatingNumber = Double.parseDouble(number);
        // Type casting or rounding?
        // wholeNumber = (int) floatingNumber;
        wholeNumber = (int) Math.round(floatingNumber);


        System.out.println("You entered " + number);
        System.out.println(number + " is " + floatingNumber + " in floating-point format.");
        System.out.println(number + " is " + wholeNumber + " in integer format.");

    }
}
