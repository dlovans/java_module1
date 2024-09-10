import java.util.Scanner;

public class Arrays1 {
    public void run() {
        String[] names = provideNames(numberOfNames());

        printNamesInReverse(names);
    }

    /**
     * Ask user the size of name array.
     *
     * @return - Name array.
     */
    private String[] numberOfNames() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        return new String[input.nextInt()];
    }

    /**
     * Ask user to provide names.
     *
     * @param names - User-provided name.
     * @return - Name array.
     */
    private String[] provideNames(String[] names) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i + 1) + " of " + names.length + ": ");
            names[i] = input.nextLine();
        }

        return names;
    }

    /**
     * Print name in reverse.
     *
     * @param names - Name array.
     */
    private void printNamesInReverse(String[] names) {
        for (String name : names) {
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
