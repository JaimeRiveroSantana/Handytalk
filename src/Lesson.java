import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String title; // Título de la lección
    private String description; // Descripción de la lección
    private int level; // Nivel de dificultad (por ejemplo: 1 = básico, 2 = intermedio, etc.)
    private List<Activity> activities; // Lista de actividades asociadas con la lección
    private int progress; // Porcentaje de progreso en la lección (0-100)

    // Constructor
    public Lesson(String title, String description, int level) {
        this.title = title;
        this.description = description;
        this.level = level;
        this.activities = new ArrayList<>();
        this.progress = 0; // Progreso inicial
    }

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public int getProgress() {
        return progress;
    }
