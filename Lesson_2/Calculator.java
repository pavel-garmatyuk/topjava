public class Calculator {

    public static int calculate(int operandOne, String mathSign, int operandTwo) {
        switch (mathSign) {
            case "+": return add(operandOne,operandTwo);
            case "-": return subtract(operandOne,operandTwo);
            case "*": return multiply(operandOne,operandTwo);
            case "/": return divide(operandOne,operandTwo);
            case "%": return getRemainder(operandOne,operandTwo);
            case "^": return exponentiation(operandOne,operandTwo);
            default: return 0;
        }
    }

    private static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    private static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    private static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    private static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    private static int getRemainder(int a, int b) {
        int result = a % b;
        return result;
    }

    private static int exponentiation(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}