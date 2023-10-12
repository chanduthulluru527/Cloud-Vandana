package Java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();

        int result = romanToInt(romanNumeral);
        System.out.println("The equivalent integer is: " + result);
        sc.close();
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        // romanToInteger.put('L', 50);
        // romanToInteger.put('C', 100);
        // romanToInteger.put('D', 500);
        // romanToInteger.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNum = romanToInteger.get(s.charAt(i));
            int nextNum = (i + 1 < s.length()) ? romanToInteger.get(s.charAt(i + 1)) : 0;

            if (currentNum < nextNum) {
                result -= currentNum;
            } else {
                result += currentNum;
            }
        }

        return result;
    }
}
