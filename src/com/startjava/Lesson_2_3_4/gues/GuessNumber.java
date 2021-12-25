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
        var playerOneIndexArray = 0;
        var playerTwoIndexArray = 0;
        do {
            inputNumber(playerOne, playerOneIndexArray++);
            if (checkNumber(playerOne)) {
                break;
            }
            inputNumber(playerTwo, playerTwoIndexArray++);
        } while (!checkNumber(playerTwo));
        Player winner = checkNumber(playerOne) ? playerOne : playerTwo;
        var message = String.format("Игрок %s угадал число %d с %d попытки%n%s%n%s"
                , winner.getName(), secretNumber, winner.getIndexArray() + 1, playerOne, playerTwo);
        System.out.println(message);
    }

    private void inputNumber(Player player, int indexArray) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setCount(indexArray);
        player.setArrayNumber(Integer.parseInt(input.nextLine()), indexArray);
    }

    private boolean checkNumber(Player player) {
        var matching = player.getArrayNumber(player.getIndexArray()) > secretNumber
                ? "больше" : "меньше";
        var massage = String.format("%s, данное число %s того, что загадал компьютер%n",
                player.getName(), matching);

        if (player.getIndexArray() == 9) {
            massage += String.format("У %s закончились попытки", player.getName());
        }
        System.out.println(massage);
        return player.getArrayNumber(player.getIndexArray()) == secretNumber;
    }
}

