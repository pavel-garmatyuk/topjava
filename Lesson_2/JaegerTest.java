public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();

        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setHeight(79.25F);
        gipsyDanger.setWeight(1.980F);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

        System.out.println("mark: " + gipsyDanger.getMark() + "\n" + "origin: " + gipsyDanger.getOrigin()
                + "\n" + "name: " + gipsyDanger.getModelName() + "\n" + "height: " + gipsyDanger.getHeight()
                + "\n" + "wight: " + gipsyDanger.getWeight() + "\n" + "speed: " + gipsyDanger.getSpeed()
                + "\n" + "strength: " + gipsyDanger.getStrength() + "\n" + "armor: " + gipsyDanger.getArmor());
        gipsyDanger.drift();
        gipsyDanger.move();
        gipsyDanger.scanKaiju();

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha","Mark-1", "Russian Federation");
        Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34F,
                2312.0F, 5, 7, 4);
        Jaeger horizonBrave = new Jaeger("Horizon Brave", "Mark-1",
                "China", 72.54F, 7.890F, 8, 4, 6);

        System.out.println(chernoAlpha.scanKaiju());
        coyoteTango.move();
        horizonBrave.useVortexCannon();
        System.out.println(chernoAlpha);
        System.out.println(coyoteTango);
        System.out.println(horizonBrave);

    }
}