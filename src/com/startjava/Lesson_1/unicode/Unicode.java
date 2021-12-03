package Lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        char startRange = 9398;
        char endRange = 10178;
        for (int i = startRange; i < endRange; i++) {
            System.out.println((char) i);
        }
    }
}