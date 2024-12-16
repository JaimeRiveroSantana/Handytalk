public interface InterfaceProgress {
    void completeLesson(Lesson lesson);
    int getProgressPercentage();
    boolean isCourseCompleted();
    String showProgress();
}
