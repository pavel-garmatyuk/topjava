package Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Используйте следующий формат ввода (пример): Введите математическое выражение: 2 ^ 10");
                var message = console.nextLine().split(" ");
                var operandOne = Integer.parseInt(message[0]);
                var mathSign = message[1];
                var operandTwo = Integer.parseInt(message[2]);
                var result = Lesson_2_3_4.calculator.Calculator.calculate(operandOne, mathSign, operandTwo);
                System.out.println(result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine();
        } while (!answer.equalsIgnoreCase("no"));
    }

}