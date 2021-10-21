import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите имя первого игрока : ");
            Player playerOne = new Player(console.nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player playerTwo = new Player(console.nextLine());
            System.out.println("Начнем игру! Угадай число от 0 до 100");
            GuessNumber guessNumber = new GuessNumber();

            while (guessNumber.isGameStart()) {
                System.out.println(playerOne.getName() + " вводит число:");
                playerOne.setNumber(console.nextInt());
                guessNumber.game(playerOne);
                if (!guessNumber.isGameStart()){
                    break;
                }
                System.out.println(playerTwo.getName() + " вводит число:");
                playerTwo.setNumber(console.nextInt());
                guessNumber.game(playerTwo);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            Scanner sc = new Scanner(System.in);
            answer = sc.nextLine();


        } while (answer.equalsIgnoreCase("yes"));
    }
}
