import java.util.Scanner;

public class Arrays2 {
    public void run() {
        String[] foodList = new String[10];
        int currentIndex = 0;
        String currentItem = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Type 'done' to exit program.\n");

        while (!currentItem.equalsIgnoreCase("done")) {
            System.out.println("Enter an item to the shopping list: ");
            currentItem = input.nextLine();

            // If user exits, print all list items and exit.
            if (currentItem.equalsIgnoreCase("done")) {
                for (int i = 0; i < foodList.length; i++) {
                    if (foodList[i] != null) {
                        System.out.println(i + ". " + foodList[i]);
                    }
                }
                System.out.println("Exiting program.");
                System.exit(0);
            }

            // If shopping list is full, ask user at which index position to replace with new item.
            if (currentIndex > 9) {
                System.out.println("Shopping list full. Enter a digit to replace item: ");
                for (int i = 0; i < foodList.length; i++) {
                    System.out.println((i + 1) + ". " + foodList[i]);
                }

                int replaceOnIndex = input.nextInt();
                input.nextLine();

                // Make sure user-provided index is not out of bounds.
                while (replaceOnIndex < 1 || replaceOnIndex > 10) {
                    System.out.println("Invalid number. Select between 1 and 10.");
                    for (int i = 0; i < foodList.length; i++) {
                        System.out.println((i + 1) + ". " + foodList[i]);
                    }
                    replaceOnIndex = input.nextInt();
                    input.nextLine();
                }
                foodList[replaceOnIndex - 1] = currentItem;
            } else {
                foodList[currentIndex] = currentItem;
            }
            // Print the list each time a new item is added.
            for (int i = 0; i < foodList.length; i++) {
                if (foodList[i] != null) {
                    System.out.println((i + 1) + ". " + foodList[i]);
                }
            }
            currentIndex++;
        }
    }
}
