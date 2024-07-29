import java.util.Scanner;

public class GalaxyMerchantTradingApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter intergalactic units separated by space:");
        String userInput = scanner.nextLine();

    
        String[] intergalacticUnits = userInput.split("\\s*,\\s*"); // Split input by commas and trim spaces
        String romanNumeral = IntergalacticUnitConverter.convertIntergalacticToRoman(intergalacticUnits);

        System.out.println("Roman Numeral: " + romanNumeral);
    }
}
