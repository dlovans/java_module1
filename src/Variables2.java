import java.util.Scanner;

public class Variables2 {
    public void run() {
        int age;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Your name is " + name + " and you're " + age + " yo.");
    }
}
