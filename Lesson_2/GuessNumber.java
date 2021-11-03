import java.util.Random;
import java.util.Scanner;
/**
 * проверки
 * if (isTurn(playerOne)) {
 *                 break;
 *             }
 *             if (isTurn(playerTwo)) {
 *                 break;
 *             }
 * можно объединить в одну
 * isTurn можно назвать makeMove (сделать шаг)
 * вместо метода isWinner ты можешь возвращать boolean сразу из checkNumber*/
public class GuessNumber {
    private final int secretNumber;
    private final Player playerOne;
    private final Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.secretNumber = new Random().nextInt(101);
    }

    public void play() {
        while (true) {
            if (makeMove(playerOne)) {
                break;
            }

            if (makeMove(playerTwo)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(input.nextInt());
        checkNumber(player);
        return isWinner(player);
    }

    private void checkNumber(Player player) {
        if (player.getNumber() > secretNumber) {
            System.out.println(player.getName() + ", данное число больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println(player.getName() + ", данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю " + player.getName() + ", число угадано!");
        }
    }

    private boolean isWinner(Player player) {
        return player.getNumber() == secretNumber;
    }
}

