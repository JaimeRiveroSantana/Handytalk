public class Lesson {
    private String title;
    private String content;

    public Lesson(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void addContent(String additionalContent) {
        this.content += "\n" + additionalContent;
    }

    public void displayLesson() {
        System.out.println("Lesson: " + title);
        System.out.println("Content: " + content);
    }
}
