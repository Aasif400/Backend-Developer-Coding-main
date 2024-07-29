import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
    private static final Map<Character, Integer> romanToArabic = new HashMap<>();

    static {
        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
        romanToArabic.put('L', 50);
        // Add more mappings as needed
    }

    public static int convertRomanToArabic(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanToArabic.get(currentChar);

            if (i < romanNumeral.length() - 1) {
                char nextChar = romanNumeral.charAt(i + 1);
                int nextValue = romanToArabic.get(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}
