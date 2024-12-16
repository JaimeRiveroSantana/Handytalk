public class LifeSystem implements InterfaceLifeSystem {
    private int lives;

    public LifeSystem(int initialLives) {
        this.lives = initialLives;
    }

    @Override
    public int getLives() {
        return lives;
    }

    @Override
    public void loseLife() {
        if (lives > 0) {
            lives--;
        } else {
            System.out.println("No lives left!");
        }
    }

    @Override
    public void recoverLife() {
        lives++;
    }

    @Override
    public String toString() {
        return "Lives: " + lives;
    }
}
