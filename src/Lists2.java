import java.util.ArrayList;
import java.util.HashMap;

public class Lists2 {
    public void run() {
        // VERSION 1
        highestUniqueNumberOfList(generateIntegerList());

        // VERSION 2
        // highestUniqueNumber(generateIntegerMap());
    }

    // VERSION 1
    /**
     * Generates a list of random numbers between 1 and 1000.
     * @return - A list of random numbers.
     */
    private ArrayList<Integer> generateIntegerList() {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 999 + 1);
            System.out.println(randomNumber);
            numberList.add(randomNumber);
        }
        return numberList;
    }

    /**
     * Finds the highest unique number in list argument.
     *
     * @param numberList - List of random numbers.
     */
    private void highestUniqueNumberOfList(ArrayList<Integer> numberList) {
        int highestUniqueNumber = 0;

        for (int i = 0; i < numberList.size(); i++) {
            int numberFrequency = 0;
            innerLoop:
            for (Integer integer : numberList) {
                if (numberList.get(i).equals(integer)) {
                    numberFrequency++;
                }
                if (numberFrequency > 1) break innerLoop;
            }
            if (numberFrequency == 1 && numberList.get(i) > highestUniqueNumber) highestUniqueNumber = numberList.get(i);
        }

        if (highestUniqueNumber == 0) {
            System.out.println("No highest unique number found.");
        } else {
            System.out.println("Highest unique number found: " + highestUniqueNumber);
        }
    }


    // VERSION 2
//    /**
//     * Generates numbers between 1 and 1000, adds number as key in map.
//     *
//     * @return - Map of numbers.
//     */
//    private HashMap<Integer, Integer> generateIntegerMap() {
//        HashMap<Integer, Integer> numbers = new HashMap<>();
//
//        for (int i = 0; i < 1000; i++) {
//            int randomNumber = (int) (Math.random() * 999 + 1);
//            System.out.println(randomNumber);
//            if (numbers.containsKey(randomNumber)) {
//                numbers.put(i, numbers.get(randomNumber) + 1);
//            } else {
//                numbers.put(randomNumber, 1);
//            }
//        }
//        return numbers;
//    }
//
//    /**
//     * Finds the highest unique number in a map.
//     * @param numbers - A map of numbers.
//     */
//    private void highestUniqueNumber(HashMap<Integer, Integer> numbers) {
//        int highestUniqueNumber = 0;
//        for (HashMap.Entry<Integer, Integer> mapEntry: numbers.entrySet()) {
//            if (mapEntry.getValue() == 1 && mapEntry.getKey() > highestUniqueNumber) {
//                highestUniqueNumber = mapEntry.getKey();
//            }
//        }
//
//        if (highestUniqueNumber == 0) {
//            System.out.println("No highest unique number found.");
//        } else {
//            System.out.println("Highest unique number found: " + highestUniqueNumber);
//        }
//    }
}
