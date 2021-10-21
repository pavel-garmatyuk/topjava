import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Введите первый операнд, затем знак арифметической операции, и второй операнд.\n"
                    + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                    + "\nВозвести в степень ^ \nПолучить остаток от деления %");
            System.out.println(Calculator.calculate(console.nextInt(), console.nextLine(),
                    console.nextInt()));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine();

            while (!answer.equalsIgnoreCase("no")) {
                if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                }
                answer = console.nextLine();
            }
        } while ("yes".equals(answer));
    }
}