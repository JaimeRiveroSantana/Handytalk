public class Main {
    public static void main(String[] args) {
        InterfaceLifeSystem lifeSystem = new LifeSystem(3);

        Course signLanguageCourse = new Course("Introduction to Sign Language", "American Sign Language");

        Lesson lesson1 = new Lesson("Basic Greetings", "Learn how to greet using basic signs.");
        Lesson lesson2 = new Lesson("Numbers", "Learn how to count from 1 to 10 using signs.");
        Lesson lesson3 = new Lesson("Colors", "Learn the basic colors in sign language.");

        signLanguageCourse.addLesson(lesson1);
        signLanguageCourse.addLesson(lesson2);
        signLanguageCourse.addLesson(lesson3);

        InterfaceProgress progress = new Progress(new User("John Doe", "john.doe@example.com", lifeSystem, null), signLanguageCourse);

        User user = new User("John Doe", "john.doe@example.com", lifeSystem, progress);
        System.out.println(user);

        System.out.println("\nInitial Progress:");
        System.out.println(progress.showProgress());

        progress.completeLesson(lesson1);
        progress.completeLesson(lesson2);

        System.out.println("\nProgress after completing some lessons:");
        System.out.println(progress.showProgress());

        System.out.println("Progress Percentage: " + progress.getProgressPercentage() + "%");

        progress.completeLesson(lesson3);
        System.out.println("\nProgress after completing the course:");
        System.out.println(progress.showProgress());
        System.out.println("Course Completed: " + progress.isCourseCompleted());

        if (progress.isCourseCompleted()) {
            user.incrementLevel();
        }
        System.out.println("\nUser state after completing the course:");
        System.out.println(user);

        System.out.println("\nTesting life system:");
        user.getLifeSystem().loseLife();
        user.getLifeSystem().loseLife();
        System.out.println(user.getLifeSystem());
        user.getLifeSystem().recoverLife();
        System.out.println(user.getLifeSystem());
    }
}
