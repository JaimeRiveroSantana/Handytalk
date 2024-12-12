import java.util.HashMap;
import java.util.Map;

// Database.java
public class Database {
    private Map<String, String> database;  // A map to store sign words and their translations

    // Constructor
    public Database() {
        database = new HashMap<>();
        database.put("greeting", "hello");
        database.put("thanks", "thank you");
        database.put("goodbye", "goodbye");
    }

    // Method to get a translation for a word
    public String getTranslation(String word) {
        return database.getOrDefault(word, "Translation not found");
    }

    // Method to add a new translation
    public void addTranslation(String word, String translation) {
        database.put(word, translation);
    }
}


