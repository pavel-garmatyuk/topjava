import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Введите имя первого игрока : ");
            Player playerOne = new Player(console.nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player playerTwo = new Player(console.nextLine());
            System.out.println("Начнем игру! Угадай число от 0 до 100");
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.play();

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    break;
                }

                if (answer.equalsIgnoreCase("no")) {
                    break;
                }
            }

        } while (answer.equalsIgnoreCase("yes"));
    }
}
