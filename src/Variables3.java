import java.util.Scanner;

/**
 * Calculate area and circumference of a circle with a user-inputted radius.
 */
public class Variables3 {
    public void run() {
        double pi = Math.PI;
        double radius;
        double area, circumference;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("The area and circumference of the circle is " + area + " and " + circumference);
    }
}
