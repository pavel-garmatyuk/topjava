public class WolfTest Wolf {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 5;
        wolf.color = "grey";
        wolf.gender = "male";
        wolf.weightBody = 30;
        wolf.nickname = "Grey Wolf";

        System.out.println("Age: " + wolf.age);
        System.out.println("Color: " + wolf.color);
        System.out.println("Gender: " + wolf.gender);
        System.out.println("Weight: " + wolf.weightBody);
        System.out.println("Nickname: " + wolf.nickname);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}