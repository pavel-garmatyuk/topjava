package Lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(5);
        wolf.setColor("grey");
        wolf.setGender("male");
        wolf.setWeightBody(30);
        wolf.setNickname("Grey animal.Wolf");

        System.out.println("Age: " + wolf.getAge());
        System.out.println("Color: " + wolf.getColor());
        System.out.println("Gender: " + wolf.getGender());
        System.out.println("Weight: " + wolf.getWeightBody());
        System.out.println("Nickname: " + wolf.getNickname());

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}