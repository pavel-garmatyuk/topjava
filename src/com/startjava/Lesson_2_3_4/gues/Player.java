package Lesson_2_3_4.gues;

public class Player {
    private final String name;
    private int[] numbers = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public void setNumbers(int number, int count) {
        this.numbers[count] = number;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getArrayValue(int count) {
        return numbers[count];
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (int i = 0; i <= count; i++) {
            sb.append(numbers[i]).append(" ");
        }
        return String.format("Числа игрока %s : %s", name, sb);
    }
}
