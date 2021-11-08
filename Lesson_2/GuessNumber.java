import java.util.Random;
import java.util.Scanner;

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
            if (makeMove(playerOne) || makeMove(playerTwo)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(input.nextInt());
        checkNumber(player);
        return player.getNumber() == secretNumber;
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
}

