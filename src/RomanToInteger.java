/*
Given a roman numeral, convert it to an integer.
 */
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        // First we map Roman symbols to values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Second we iterate through the Roman numeral from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            // Check if the current character is a valid Roman numeral symbol
            if (!romanValues.containsKey(currentChar)) {
                continue;
            }

            int value = romanValues.get(currentChar);

            // Add or subtract the value based on its position
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;
    }
}
