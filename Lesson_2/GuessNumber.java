import java.util.Random;

public class GuessNumber {
    private final int secretNumber;
    private boolean gameStart = true;

    public GuessNumber() {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        secretNumber = random.nextInt(diff + 1) + min;
    }

    public boolean isGameStart() {
        return gameStart;
    }

    public void game(Player player) {
        if (player.getNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю " + player.getName() + ", число угадано!");
            gameStart = false;
        }
    }
}
