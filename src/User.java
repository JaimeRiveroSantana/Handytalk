public class User {
    private String name;
    private String email;
    private int level;
    private InterfaceLifeSystem lifeSystem;
    private InterfaceProgress progress;

    public User(String name, String email, InterfaceLifeSystem lifeSystem, InterfaceProgress progress) {
        this.name = name;
        this.email = email;
        this.level = 1;
        this.lifeSystem = lifeSystem;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getLevel() {
        return level;
    }

    public InterfaceLifeSystem getLifeSystem() {
        return lifeSystem;
    }

    public InterfaceProgress getProgress() {
        return progress;
    }

    public void incrementLevel() {
        level++;
    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: " + email + ", Level: " + level + ", " + lifeSystem;
    }
}
