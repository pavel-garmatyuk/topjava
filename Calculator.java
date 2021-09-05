public class Calculator {

    public static void main(String[] args) {
        System.out.println("Введите знак первый операнад, знак арифметической операции, второй операнд.\n"
                + "Разрешенные знаки: \nСложение + \nВычитание - \nУмножение * \nДеление / \nВозвести в степень ^ \nПолучить остаток от деления %");
        Scanner console = new Scanner(System.in);
        int operandOne = Integer.parseInt(console.nextLine());
        String symbol = console.nextLine();
        int operandTwo = Integer.parseInt(console.nextLine());
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
                result = result * operandOne;
            }
        }
        System.out.println(result);

    }
}