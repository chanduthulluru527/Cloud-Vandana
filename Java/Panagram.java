package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input);
        scanner.close();

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String s) {
        // Convert the input to lowercase to handle both uppercase and lowercase letters
        s = s.toLowerCase();

        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        for (char ch : s.toCharArray()) {
            if (alphabetSet.contains(ch)) {
                alphabetSet.remove(ch);
            }

            if (alphabetSet.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
