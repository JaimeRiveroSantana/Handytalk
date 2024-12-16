class Lesson {
    private String title;
    private String description;
    private boolean completed;

    public Lesson(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        completed = true;
    }

    @Override
    public String toString() {
        return "Lesson: " + title + ", Description: " + description + ", Completed: " + (completed ? "Yes" : "No");
    }
}