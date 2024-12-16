import java.util.HashMap;
import java.util.Map;

public class Progress implements InterfaceProgress {
    private User user;
    private Course course;
    private Map<Lesson, Boolean> completedLessons;

    public Progress(User user, Course course) {
        this.user = user;
        this.course = course;
        this.completedLessons = new HashMap<>();
        for (Lesson lesson : course.getLessons()) {
            completedLessons.put(lesson, false);
        }
    }

    @Override
    public void completeLesson(Lesson lesson) {
        if (completedLessons.containsKey(lesson) && !completedLessons.get(lesson)) {
            completedLessons.put(lesson, true);
            System.out.println("Lesson completed: " + lesson.getTitle());
        }
    }

    @Override
    public int getProgressPercentage() {
        long completed = completedLessons.values().stream().filter(isCompleted -> isCompleted).count();
        return (int) ((completed * 100) / completedLessons.size());
    }

    @Override
    public boolean isCourseCompleted() {
        return completedLessons.values().stream().allMatch(isCompleted -> isCompleted);
    }

    @Override
    public String showProgress() {
        StringBuilder progress = new StringBuilder("Course Progress:\n");
        for (Lesson lesson : completedLessons.keySet()) {
            progress.append(lesson.getTitle()).append(": ")
                    .append(completedLessons.get(lesson) ? "Completed" : "Pending").append("\n");
        }
        return progress.toString();
    }
}
