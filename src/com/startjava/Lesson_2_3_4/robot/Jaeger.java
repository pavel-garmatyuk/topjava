package Lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this(modelName, mark, origin);
        this.height = height;
        this.weight = weight;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed,
                  int strength, int armor) {
        this(modelName, mark, origin, height, weight);
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("???? ?????????? ?? ??????????");
        return true;
    }

    public void move() {
        System.out.println("???? ???????????? 5 ??????????");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }

    @Override
    public String toString() {
        return modelName + " " + mark + " " + origin + " " + height + " " + weight
                + " " + speed + " " + strength + " " + armor;
    }
}