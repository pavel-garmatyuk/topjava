import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String question = "";

        do {
            System.out.println("Введите первый операнд, затем знак арифметической операции, и второй операнд.\n"
                    + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                    + "\nВозвести в степень ^ \nПолучить остаток от деления %");
            System.out.println(Calculator.calculation(Integer.parseInt(console.nextLine()), console.nextLine(),
                    Integer.parseInt(console.nextLine())));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            question = console.nextLine();

            while (!question.equalsIgnoreCase("no")) {
            if (question.equalsIgnoreCase("no") || question.equalsIgnoreCase("yes")) {
                break;
            } else {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
            }
                question = console.nextLine();
            }


        } while ("yes".equals(question));
    }
}