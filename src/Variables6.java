import java.util.Scanner;

/**
 * String manipulation.
 */
public class Variables6 {
    public void run() {
        String someText;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text: ");
        someText = input.nextLine();

        System.out.println(someText.toUpperCase());
        System.out.println(someText.toLowerCase());

        for (int i = 0; i < someText.length(); i++) {
            System.out.println(someText.charAt(i));
        }
    }
}
