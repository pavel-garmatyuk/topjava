import java.util.Random;
import java.util.Scanner;

/**
 * ввод чисел - это игровой процесс, а по заданию он должен размещаться в GuessNumber
 * в одном классе достаточно одного экземпляра Scanner
 * удали все пустые строки перед } while (answer.equalsIgnoreCase("yes"));
 * проверяй ответ игрока, а не то, что он выиграл или игра завершилась
 */

public class GuessNumber {
    private final int secretNumber;
    private final Player playerOne;
    private final Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.secretNumber = new Random().nextInt(101);
    }

    public void game() {
        while (!playerOne.isWinner() || !playerTwo.isWinner()) {
            System.out.println("Введите число:");
            Scanner input = new Scanner(System.in);

            playerOne.setNumber(input.nextInt());
            checkNumber(playerOne);
            if (playerOne.isWinner()) {
                break;
            } else {
                playerTwo.setNumber(input.nextInt());
                checkNumber(playerTwo);
            }
        }
    }

    private void checkNumber(Player player) {
        if (player.getNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю " + player.getName() + ", число угадано!");
            player.setWinner(true);
        }
    }
}
