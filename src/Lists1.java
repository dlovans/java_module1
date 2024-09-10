import java.util.ArrayList;
import java.util.Scanner;

public class Lists1 {
    public void run() {
        ArrayList<Integer> points = addPoints();
        int highScore = highScore(points);
        double averageScore = averageScore(points);

        System.out.println("The highest score is " + highScore);
        System.out.println("The average score is " + String.format("%.2f", averageScore));
    }

    /**
     * Asks user to provide participants' score.
     * @return An array of points.
     */
    private ArrayList<Integer> addPoints() {
        ArrayList<Integer> points = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to exit program.");
        System.out.println("Enter a participants score: ");

        while(true) {
            if (input.hasNextInt()) {
                points.add(input.nextInt());
                input.nextLine();
            } else {
                break;
            }
            System.out.println("Enter another score: ");
        }

        return points;
    }

    /**
     * Finds the highest score in the points' collection.
     * @param points - An integer array of points.
     * @return - Highest score.
     */
    private int highScore(ArrayList<Integer> points) {
        int highScore = 0;
        for (int point : points) {
            if (point > highScore) {
                highScore = point;
            }
        }
        return highScore;
    }

    /**
     * Calculates of the average score of all participants.
     * @param points - An integer array of points.
     * @return - Average score.
     */
    private double averageScore(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }
}
