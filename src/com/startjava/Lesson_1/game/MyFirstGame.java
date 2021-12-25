package Lesson_1.game;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Guess the number from 0 to 100.");
        Scanner console = new Scanner(System.in);
        int playerNumber;
        do {
            playerNumber = console.nextInt();
            if (playerNumber > secretNumber) {
                System.out.println("This number is more than what the computer has made up");
            } else if (playerNumber < secretNumber){
                System.out.println("This number is less than what the computer made up");
            }
        } while (playerNumber != secretNumber);
        System.out.println("Congratulations, the number is guessed!");
    }
}