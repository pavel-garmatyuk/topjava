import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println("Угадай число от 0 до 100.");
        while (true){
            int input_number = Integer.parseInt(console.nextLine());
            if (input_number == number){
                System.out.println("Поздравляю, число угадано!");
                break;
            } else if (input_number > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
                continue;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                continue;
            }
        }
    }
}