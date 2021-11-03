import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {

                System.out.println("Введите первый операнд, затем знак арифметической операции, и второй операнд.\n"
                        + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                        + "\nВозвести в степень ^ \nПолучить остаток от деления %");
                int result = Calculator.calculate(Integer.parseInt(console.nextLine()),
                        console.nextLine(), Integer.parseInt(console.nextLine()));
                System.out.println(result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine();
        } while (!answer.equalsIgnoreCase("no"));
    }
}