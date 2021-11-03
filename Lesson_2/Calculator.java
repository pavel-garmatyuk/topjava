public class Calculator {

    public static int calculate(int operandOne, String mathSign, int operandTwo) {
        return switch (mathSign) {
            case "+" -> operandOne + operandTwo;
            case "-" -> operandOne - operandTwo;
            case "*" -> operandOne * operandTwo;
            case "/" -> div(operandOne, operandTwo);
            case "%" -> operandOne % operandTwo;
            case "^" -> power(operandOne, operandTwo);
            default -> 0;
        };
    }

    private static int power(int operandOne, int operandTwo) {
        int result = 1;
        for (int i = 1; i <= operandTwo; i++) {
            result *= operandOne;
        }
        return result;
    }

    private static int div(int operandOne, int operandTwo) {
        if (operandTwo == 0) {
            System.out.println("Деление на ноль!");
            return 0;
        }
        return operandOne / operandTwo;
    }
}