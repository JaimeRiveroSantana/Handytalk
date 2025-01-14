public class User {
    private String name;
    private String surname;
    private String email;
    private int level;
    private String nativeLanguage;
    private int id;

    public User(String name, String nativeLanguage, String surname, String email, int level, int id) {
        this.name = name;
        this.nativeLanguage = nativeLanguage;
        this.surname = surname;
        this.email = email;
        this.level = level;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

}
