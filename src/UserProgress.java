public class UserProgress {
    private int userId;
    private String learningLanguage;
    private int lessonCompleted;
    private int totalPoints;

    // Constructor
    public UserProgress(int userId, String learningLanguage, int lessonCompleted, int totalPoints) {
        this.userId = userId;
        this.learningLanguage = learningLanguage;
        this.lessonCompleted = lessonCompleted;
        this.totalPoints = totalPoints;
    }

    // Métodos Getter y Setter

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLearningLanguage() {
        return learningLanguage;
    }

    public void setLearningLanguage(String learningLanguage) {
        this.learningLanguage = learningLanguage;
    }

    public int getLessonCompleted() {
        return lessonCompleted;
    }

    public void setLessonCompleted(int lessonCompleted) {
        this.lessonCompleted = lessonCompleted;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void addPoints(int i) {
    }

    public void increaseLessonCompleted(int i) {
    }
}
