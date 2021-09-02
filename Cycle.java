public class Cycle {   
    public static void main(String[] args) {
        System.out.println("for");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        System.out.println("while");
        int a = -6;
        int b = 6;
        while(a <= b) {
            System.out.println(a);
            a+=2;
        }

        System.out.println("do while");
        int numA = 10;
        //int numB = 20;
        int sum = 0;
        do {
            if (numA % 2 != 0) {
                sum += numA;
            }
            numA++;
        } while (numA <= 20);
            System.out.println(sum);

    }
}