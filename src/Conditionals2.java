import java.util.Scanner;

/**
 * Converts Swedish Crowns to Euro and US Dollar.
 */
public class Conditionals2 {
    public void run() {
        double crowns, euro, dollar;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount in Swedish Crowns: ");
        crowns = input.nextDouble();

        euro = crowns * 0.088;
        dollar = crowns * 0.096;

        System.out.println(crowns + "SEK is " + String.format("%.2f", euro) + "Euro.");
        System.out.println(crowns + "SEK is " + String.format("%.2f", dollar) + "USD.");

    }
}
