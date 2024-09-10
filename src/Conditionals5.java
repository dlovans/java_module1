import java.util.Scanner;

public class Conditionals5 {
    public void run() {
        int level;
        int correctNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the correct number!");
        System.out.println("Enter difficulty level: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        level = input.nextInt();
        input.nextLine();
        correctNumber = generateRandomNumbers(level);
        makeGuess(correctNumber, level);
    }

    /**
     * Generates a random number within a range.
     *
     * @param level - Difficulty level.
     * @return Random number.
     */
    private int generateRandomNumbers(int level) {
        int maxRange = 0;
        if (level == 1) {
            maxRange = 10;
        } else if (level == 2) {
            maxRange = 100;
        } else if (level == 3) {
            maxRange = 1000;
        } else {
            System.out.println("Invalid difficulty level.");
            System.exit(0);
        }

        return (int)(Math.random() * (maxRange - 1) + 1);
    }

    /**
     * Asks user to make a guess.
     * @param correctNumber - The number randomly generated.
     * @param level - Difficulty level.
     */
    private void makeGuess(int correctNumber, int level) {
        int tries = 0;
        int currentGuess;

        Scanner input = new Scanner(System.in);
        if (level == 1) System.out.println("Enter a number between 1 and 10: ");
        if (level == 2) System.out.println("Enter a number between 1 and 100: ");
        if (level == 3) System.out.println("Enter a number between 1 and 1000: ");

        currentGuess = input.nextInt();
        input.nextLine();
        tries++;

        while (currentGuess != correctNumber) {
            tries++;
            if (currentGuess > correctNumber) {
                System.out.println("Too hot!");
            } else {
                System.out.println("Too cold!");
            }

            System.out.println("Try again: ");
            currentGuess = input.nextInt();
            input.nextLine();
        }

        System.out.println("Correct!");
        System.out.println("You guessed " + tries + " times.");
    }
}
