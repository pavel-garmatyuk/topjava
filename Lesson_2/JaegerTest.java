public class JaegerTest {
    public static void main(String[] args) {
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
    }
}