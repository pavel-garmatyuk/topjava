import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = (int) Math.round(Math.random() * 100);
        System.out.println("Угадай число от 0 до 100.");
        int inputNumber;
        do {
            Scanner console = new Scanner(System.in);
            inputNumber = console.nextInt();
            if (inputNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        } while (inputNumber != secretNumber);
        if (inputNumber == secretNumber) {
            System.out.println("Поздравляю, число угадано!");
        }
    }
}