public class Calculator {

    public static void main(String[] args) {
        System.out.println("Введите первый операнад, затем знак арифметической операции, и второй операнд.\n"
                + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                + "\nВозвести в степень ^ \nПолучить остаток от деления %");
        Scanner console = new Scanner(System.in);
        int operandOne = console.nextInt();
        String symbol = console.nextLine();
        int operandTwo = console.nextInt();
        int result = 0;
        if (symbol.equals("+")) {
            result = operandOne + operandTwo;
        } else if (symbol.equals("-")) {
            result = operandOne - operandTwo;
        } else if (symbol.equals("*")) {
            result = operandOne * operandTwo;
        } else if (symbol.equals("/")) {
            result = operandOne / operandTwo;
        } else if (symbol.equals("%")) {
            result = operandOne % operandTwo;
        } else if (symbol.equals("^")) {
            result = 1;
            for (int i = 1; i <= operandTwo; i++) {
                result *= operandOne;
            }
        }
        System.out.println(result);
    }
}