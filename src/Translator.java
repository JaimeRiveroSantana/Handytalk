import java.util.List;
import java.util.ArrayList;

// Translator.java
public class Translator {
    private List<Sign> dictionary;  // List of signs in the dictionary

    // Constructor
    public Translator() {
        dictionary = new ArrayList<>();
        initializeDictionary();
    }

    // Method to initialize the dictionary with some signs
    private void initializeDictionary() {
        dictionary.add(new Sign("greeting", "hello"));
        dictionary.add(new Sign("thanks", "thank you"));
        dictionary.add(new Sign("goodbye", "goodbye"));
    }

    // Method to translate a phrase into sign language
    public void translatePhrase(String phrase) {
        String[] words = phrase.split(" ");
        boolean translated = false;

        for (String word : words) {
            boolean found = false;
            for (Sign sign : dictionary) {
                if (sign.getTranslation().equalsIgnoreCase(word)) {
                    sign.displayInfo();
                    found = true;
                    translated = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Sign not found for word: " + word);
            }
        }

        if (!translated) {
            System.out.println("Phrase could not be translated.");
        }
    }

    // Method to add a new sign to the dictionary
    public void addSign(Sign sign) {
        dictionary.add(sign);
    }
}
