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
        System.out.println("У каждого игрока по 10 попыток");
        do {
            inputNumber(playerOne);
            if (checkNumber(playerOne)) {
                break;
            }
            inputNumber(playerTwo);
        } while (!checkNumber(playerTwo));
        Player winner = checkNumber(playerOne) ? playerOne : playerTwo;
        var message = String.format("Игрок %s угадал число %d с %d попытки%n%s%n%s"
                , winner.getName(), secretNumber, winner.getCount() + 1, playerOne, playerTwo);
        System.out.println(message);
    }

    private void inputNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        var index = player.getCount();
        player.setCount(++index);
        player.setNumbers(input.nextInt(), index);
    }

    private boolean checkNumber(Player player) {
        var matching = player.getArrayValue(player.getCount()) > secretNumber
                ? "больше" : "меньше";
        var massage = player.getCount() == 9 ? String.format("%s, данное число %s того, что загадал компьютер",
                player.getName(), matching) : String.format("У %s закончились попытки", player.getName());
        System.out.println(massage);
        return player.getArrayValue(player.getCount()) == secretNumber;
    }
}

