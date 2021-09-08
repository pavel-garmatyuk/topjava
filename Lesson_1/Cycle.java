public class Cycle {   
    public static void main(String[] args) {
        System.out.println("for");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("while");
        int counter = -6;
        int endRange = 6;
        while(counter <= endRange) {
            System.out.println(counter);
            counter += 2;
        }

        System.out.println("do while");
        int counter = 10;
        int sumOdd = 0;
        do {
            if (counter % 2 != 0) {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 20);
        System.out.println(sumOdd);
    }
}