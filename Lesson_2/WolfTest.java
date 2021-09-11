public class WolfTest extends Wolf {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 5;
        wolf.color = "grey";
        wolf.gender = "male";
        wolf.weightBody = 30;
        wolf.nickname = "Grey Wolf";
        String result = "Age: " + wolf.age
                + System.lineSeparator() + "Color: " + wolf.color
                + System.lineSeparator() + "Gender: " + wolf.gender
                + System.lineSeparator() + "Weight: " + wolf.weightBody
                + System.lineSeparator() + "Nickname: " + wolf.nickname;
        System.out.println(result);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}