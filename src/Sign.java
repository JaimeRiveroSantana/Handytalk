// Sign.java
public class Sign {
    private String name;  // Name of the sign in sign language
    private String translation;  // Translation in the spoken language

    // Constructor
    public Sign(String name, String translation) {
        if (name == null || translation == null) {
            throw new IllegalArgumentException("Name and translation cannot be null.");
        }
        this.name = name;
        this.translation = translation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getTranslation() {
        return translation;
    }

    // Method to display sign information
    public void displayInfo() {
        System.out.println("Sign: " + name + " -> Translation: " + translation);
    }
}
