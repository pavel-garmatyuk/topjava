public class JaegerTest extends Jaeger{
    public static void main(String[] args) {

        /**  ==>Getter and Setter<==
        Jaeger chernoAlpha = new Jaeger();
        Jaeger coyoteTango = new Jaeger();
        Jaeger horizonBrave = new Jaeger();

        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russian Federation");
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setHeight(85.34F);
        chernoAlpha.setWeight(2412.0F);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);


        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setHeight(85.34F);
        coyoteTango.setWeight(2312.0F);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);


        horizonBrave.setMark("Mark-1");
        horizonBrave.setOrigin("China");
        horizonBrave.setModelName("Horizon Brave");
        horizonBrave.setHeight(72.54F);
        horizonBrave.setWeight(7.890F);
        horizonBrave.setSpeed(8);
        horizonBrave.setStrength(4);
        horizonBrave.setArmor(6);

        System.out.println("mark: " + chernoAlpha.getMark() + "\n" + "origin: " + chernoAlpha.getOrigin()
                + "\n" + "name: " + chernoAlpha.getModelName() + "\n" + "height: " + chernoAlpha.getHeight()
                + "\n" + "wight: " + chernoAlpha.getWeight() + "\n" + "speed: " + chernoAlpha.getSpeed()
                + "\n" + "strength: " + chernoAlpha.getStrength() + "\n" + "armor: " + chernoAlpha.getArmor());
        chernoAlpha.drift();
        chernoAlpha.move();
        chernoAlpha.scanKaiju();

        System.out.println("\n" + "mark: " + coyoteTango.getMark() + "\n" + "origin: " + coyoteTango.getOrigin()
                + "\n" + "name: " + coyoteTango.getModelName() + "\n" + "height: " + coyoteTango.getHeight()
                + "\n" + "wight: " + coyoteTango.getWeight() + "\n" + "speed: " + coyoteTango.getSpeed()
                + "\n" + "strength: " + coyoteTango.getStrength() + "\n" + "armor: " + coyoteTango.getArmor());
        coyoteTango.drift();
        coyoteTango.move();
        coyoteTango.scanKaiju();

        System.out.println("\n" + "mark: " + horizonBrave.getMark() + "\n" + "origin: " + horizonBrave.getOrigin()
                + "\n" + "name: " + horizonBrave.getModelName() + "\n" + "height: " + horizonBrave.getHeight()
                + "\n" + "wight: " + horizonBrave.getWeight() + "\n" + "speed: " + horizonBrave.getSpeed()
                + "\n" + "strength: " + horizonBrave.getStrength() + "\n" + "armor: " + horizonBrave.getArmor());
        horizonBrave.drift();
        horizonBrave.move();
        System.out.println(horizonBrave.scanKaiju());
         */


        Jaeger chernoAlpha = new JaegerTest("Cherno Alpha","Mark-1", "Russian Federation");
        Jaeger coyoteTango = new JaegerTest("Coyote Tango", "Mark-1", "Japan", 85.34F,
                2312.0F, 5, 7, 4);
        Jaeger horizonBrave = new JaegerTest("Horizon Brave", "Mark-1", "China", 72.54F, 7.890F, 8, 4, 6);

        System.out.println(chernoAlpha.scanKaiju());
        coyoteTango.move();
        horizonBrave.useVortexCannon();
        System.out.println(chernoAlpha);
        System.out.println(coyoteTango);
        System.out.println(horizonBrave);

    }
    public JaegerTest() {
        super();
    }

    public JaegerTest(String modelName, String mark, String origin) {
        super(modelName, mark, origin);
    }

    public JaegerTest(String modelName, String mark, String origin, float height, float weight, int speed,
                      int strength, int armor) {
        super(modelName, mark, origin, height, weight, speed, strength, armor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}