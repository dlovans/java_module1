import java.util.Scanner;

public class Conditionals6 {
    public void run() {
        String personnr = providePersonnummer();
        isPersonnummerValid(personnr);


    }

    /**
     * Ask user to provide a 10-digit personnummer.
     * @return personnummer.
     */
    private String providePersonnummer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter personnummer, 10 digits: ");
        return input.nextLine();
    }

    /**
     * Validates personnummer.
     * @param personnummer - User provided personnummer, 10-digits.
     */
    private void isPersonnummerValid(String personnummer) {
        int controlDigit = Character.getNumericValue(personnummer.charAt(personnummer.length() - 1));
        boolean multiplyWithTwo = true;
        String addNumbersToString = "";
        int sum = 0;

        for (int i = 0; i < personnummer.length() - 1; i++) {
            int digit = Character.getNumericValue(personnummer.charAt(i));
            if (multiplyWithTwo) {
                addNumbersToString += digit * 2;
            } else {
                addNumbersToString += digit;
            }
            multiplyWithTwo = !multiplyWithTwo;
        }

        for (int i = 0; i < addNumbersToString.length(); i++) {
            sum += Integer.parseInt(addNumbersToString.charAt(i) + "");
        }

        if ((10 - (sum % 10)) % 10 == controlDigit) {
            System.out.println("Valid personnummer");
        } else {
            System.out.println("Invalid personnummer");
        }
    }
}
