import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String title;
    private String content;
    private List<String> quizQuestions;
    private List<String> correctAnswers;
    private int score;

    public Lesson(String title, String content) {
        this.title = title;
        this.content = content;
        this.quizQuestions = new ArrayList<>();
        this.correctAnswers = new ArrayList<>();
        this.score = 0;
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

    public void addQuizQuestion(String question, String correctAnswer) {
        quizQuestions.add(question);
        correctAnswers.add(correctAnswer);
    }

    public void answerQuiz(int questionIndex, String answer) {
        if (questionIndex < quizQuestions.size()) {
            if (correctAnswers.get(questionIndex).equalsIgnoreCase(answer)) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Incorrect answer. Try again.");
            }
        } else {
            System.out.println("There is no such question.");
        }
    }

    public void displayLesson() {
        System.out.println("Lesson: " + title);
        System.out.println("Content: " + content);
        System.out.println("Quiz results: " + score + "/" + quizQuestions.size());
    }

    public void displayQuiz() {
        for (int i = 0; i < quizQuestions.size(); i++) {
            System.out.println("Question " + (i + 1) + ": " + quizQuestions.get(i));
        }
    }
}
