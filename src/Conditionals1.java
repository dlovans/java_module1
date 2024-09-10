import java.util.Scanner;

/**
 * Converts lengths in different units to centimeter.
 */
public class Conditionals1 {
    public void run() {
        int lengthUnit = 1;
        double length = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length unit: ");
        System.out.println("1. Famnar");
        System.out.println("2. Alnar");
        System.out.println("3. Tum");
        System.out.println("4. Fot");

        if (input.hasNextInt()) {
            lengthUnit = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("Exiting program");
            System.exit(0);
        }

        System.out.println("Enter the length: ");
        if (input.hasNextDouble()) {
            length = input.nextDouble();
        } else {
            System.out.println("Exiting program");
            System.exit(0);
        }

        switch(lengthUnit) {
            case 1:
                System.out.println(lengthUnit + " famnar equals " + length * 182.88 + "cm");
                break;
            case 2:
                System.out.println(lengthUnit + " alnar equals " + length * 59.38 + "cm");
                break;
            case 3:
                System.out.println(lengthUnit + " tum equals " + length * 2.54 + "cm");
                break;
            case 4:
                System.out.println(lengthUnit + " fot equals " + length * 30.48 + "cm");
                break;
            default:
                System.out.println("Incorrect length unit!");
                System.out.println("Exiting program.");
                System.exit(0);
        }
    }
}
