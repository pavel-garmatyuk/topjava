import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Введите первый операнд, затем знак арифметической операции, и второй операнд.\n"
                    + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                    + "\nВозвести в степень ^ \nПолучить остаток от деления %");

            System.out.println(Calculator.calculate(Integer.parseInt(console.nextLine()),
                    console.nextLine(), Integer.parseInt(console.nextLine())));

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

        } while ("yes".equals(answer));
    }
}