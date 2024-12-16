import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String targetLanguage;
    private List<Lesson> lessons;

    public Course(String name, String targetLanguage) {
        this.name = name;
        this.targetLanguage = targetLanguage;
        this.lessons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        return "Course: " + name + ", Target Language: " + targetLanguage + ", Number of lessons: " + lessons.size();
    }
}