public class Main {
    public static void main(String[] args) {
        // Creo una instancia de la clase User
        User user = new User("Itziar", "Spanish", "Marrero Rodríguez", "itziar@gmail.com", 1, 100);

        // Mostrar los detalles del Usuario
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + user.getName());
        System.out.println("Apellido: " + user.getSurname());
        System.out.println("Correo Electrónico: " + user.getEmail());
        System.out.println("Idioma Nativo: " +  user.getNativeLanguage());
        System.out.println("Nivel: " + user.getLevel());
        System.out.println("ID: "+ user.getId());


        // Creo una instancia de UserProgress asociada a este usuario
        UserProgress progress = new UserProgress(user.getId(), "English", 5, 100);

        // Mostrar el progreso inicial
        System.out.println("\nProgreso inicial del usuario:");
        System.out.println("Idioma que esta aprendiendo: " + progress.getLearningLanguage());
        System.out.println("Lecciones completadas: " + progress.getLessonCompleted());
        System.out.println("Puntos totales: " + progress.getTotalPoints());

        // Actualizo el progreso
        progress.increaseLessonCompleted(3);
        progress.addPoints(50);

        // Mostrar el progreso actualizado
        System.out.println("\nProgreso actualizado del usuario:");
        System.out.println("Idioma que está aprendiendo: " + progress.getLearningLanguage());
        System.out.println("Lecciones completadas: " + progress.getLessonCompleted());
        System.out.println("Puntos totales: " + progress.getTotalPoints());
    }
}