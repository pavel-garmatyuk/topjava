package Lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(int operandOne, String mathSign, int operandTwo) {
        return switch (mathSign) {
            case "+" -> Math.addExact(operandOne, operandTwo);
            case "-" -> Math.subtractExact(operandOne, operandTwo);
            case "*" -> Math.multiplyExact(operandOne, operandTwo);
            case "/" -> Math.floorDiv(operandOne, operandTwo);
            case "%" -> Math.floorMod(operandOne, operandTwo);
            case "^" -> (int) Math.pow(operandOne, operandTwo);
            default -> 0;
        };
    }
}