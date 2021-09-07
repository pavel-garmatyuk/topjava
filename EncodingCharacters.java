public class EncodingCharacters {
    public static void main(String[] args) {
        char rangeStart = 9398;
        char rangeEnd = 10178;
        for (int i = rangeStart; i < rangeEnd; i++) {
            char result = (char) i;
            System.out.println(result);
        }
    }
}