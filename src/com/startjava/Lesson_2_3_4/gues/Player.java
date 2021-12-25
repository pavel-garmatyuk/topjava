package Lesson_2_3_4.gues;


public class Player {
    private final String name;
    private int[] arrayNumber = new int[10];
    private int indexArray = 0;

    public Player(String name) {
        this.name = name;
    }

    public void setArrayNumber(int number, int count) {
        this.arrayNumber[count] = number;
    }

    public void setCount(int count) {
        this.indexArray = count;
    }

    public String getName() {
        return name;
    }

    public int getIndexArray() {
        return this.indexArray;
    }

    public int getArrayNumber(int indexArray) {
        return this.arrayNumber[indexArray];
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (int i = 0; i <= indexArray; i++) {
            sb.append(arrayNumber[i]).append(" ");
        }
        return String.format("Числа игрока %s : %s", name, sb);
    }
}
