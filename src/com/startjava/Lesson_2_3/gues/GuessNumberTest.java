package Lesson_2_3.gues;

import java.util.Scanner;

import static java.lang.System.in;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Введите имя первого игрока : ");
                Player playerOne = new Player(sc.nextLine());
                System.out.println("Введите имя второго игрока: ");
                Player playerTwo = new Player(sc.nextLine());
                System.out.println("Начнем игру! Угадай число от 0 до 100");
                GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
                guessNumber.play();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = sc.nextLine();
        } while (!answer.equalsIgnoreCase("no"));
    }
}