public class Calculator {

    public static int calculation(int operandOne,String tmpSymbol, int operandTwo) throws ArithmeticException {
        switch (tmpSymbol) {
            case "+": return addition(operandOne,operandTwo);
            case "-": return subtraction(operandOne,operandTwo);
            case "*": return multiplication(operandOne,operandTwo);
            case "/": return division(operandOne,operandTwo);
            case "%": return remainder(operandOne,operandTwo);
            case "^": return exponentiation(operandOne,operandTwo);
            default: throw new ArithmeticException();
        }
    }

    private static int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    private static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    private static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    private static int division(int a, int b) {
        int result = a / b;
        return result;
    }

    private static int remainder(int a, int b) {
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