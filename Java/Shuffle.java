package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            array.add(i);
        }

        // Shuffle the ArrayList
        Collections.shuffle(array);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = array.toArray(new Integer[0]);

        // Print the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
