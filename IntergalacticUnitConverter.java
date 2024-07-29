import java.util.HashMap;
import java.util.Map;

public class IntergalacticUnitConverter {
    private static final Map<String, String> intergalacticToRoman = new HashMap<>();

    static {
        intergalacticToRoman.put("glob", "I");
        intergalacticToRoman.put("prok", "V");
        intergalacticToRoman.put("pish", "X");
        intergalacticToRoman.put("tegj", "L");
        intergalacticToRoman.put("zog", "C"); 
        intergalacticToRoman.put("dorn", "D"); 
        intergalacticToRoman.put("mook", "M"); 
    }

    public static String convertIntergalacticToRoman(String[] intergalacticUnits) {
        StringBuilder romanNumeral = new StringBuilder();
        for (String unit : intergalacticUnits) {
            if (intergalacticToRoman.containsKey(unit)) {
                romanNumeral.append(intergalacticToRoman.get(unit));
            } else {
                return null; // Invalid unit
            }
        }
        return romanNumeral.toString();
    }
}
