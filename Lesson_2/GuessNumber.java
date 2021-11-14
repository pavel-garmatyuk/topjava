import java.util.Random;
import java.util.Scanner;

/*GuessNumber
- после import оставляй пустую строку https://docs.google.com/document/d/1CcFKdXwgnL3h65izX1oY6PtUKQe9DV-I-YEQQ2RKu74/edit#bookmark=id.ynarjmc6p6m8
- проверки if (makeMove(playerOne) || makeMove(playerTwo)) { можно поместить в while (сюда) {, а внутри его тела выводить какое-то сообщение
- проверку player.getNumber() == secretNumber; из makeMove помести в checkNumber
- в методе для проверки чисел для веток с проверкой > и < используй тернарный оператор.
При этом дублирования кода/текста сообщения не должно быть.
Данный оператор должен упростить проверку и вывод сообщения, а не усложнить или сделать ее громоздкой или нечитаемой
checkNumber должен возвращать boolean*/
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
        Player player = playerTwo;
        do {
            makeMove(playerOne);
            if (checkNumber(playerOne)) {
                player = playerOne;
                break;
            } else {
                makeMove(playerTwo);
            }
        }
        while (!checkNumber(playerTwo));
        System.out.println("Поздравляю " + player.getName() + ", число угадано!");
    }

    private void makeMove(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(input.nextInt());
    }

    private boolean checkNumber(Player player) {
        String massage = player.getNumber() > secretNumber ? ", данное число больше того, что загадал компьютер" :
                ", данное число меньше того, что загадал компьютер";
        System.out.println(player.getName() + massage);
        return player.getNumber() == secretNumber;
    }
}

