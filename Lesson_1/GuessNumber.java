import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Угадай число от 0 до 100.");
        Scanner console = new Scanner(System.in);
        int playerNumber;
        do {
            playerNumber = console.nextInt();
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerNumber < secretNumber){
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        } while (playerNumber != secretNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}