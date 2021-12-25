package Lesson_2_3_4.gues;

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
        do {
            inputNumber(playerOne);
            if (checkNumber(playerOne)) {
                break;
            }
            inputNumber(playerTwo);
        } while (!checkNumber(playerTwo));
        Player winner = checkNumber(playerOne) ? playerOne : playerTwo;
        String message = String.format("Поздравляю %s, число угадано!", winner.getName());
        System.out.println(message);
    }

    private void inputNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(input.nextInt());
    }

    private boolean checkNumber(Player player) {
        String matching = player.getNumber() > secretNumber ? "больше" : "меньше";
        String massage = String.format("%s, данное число %s того, что загадал компьютер", player.getName(), matching);
        System.out.println(massage);
        return player.getNumber() == secretNumber;
    }

}

