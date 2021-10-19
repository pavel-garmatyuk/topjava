public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    /**
     * ==>Getter and Setter<==
     * public String getModelName() {
     * return modelName;
     * }
     * <p>
     * public void setModelName(String modelName) {
     * this.modelName = modelName;
     * }
     * <p>
     * public String getMark() {
     * return mark;
     * }
     * <p>
     * public void setMark(String mark) {
     * this.mark = mark;
     * }
     * <p>
     * public String getOrigin() {
     * return origin;
     * }
     * <p>
     * public void setOrigin(String origin) {
     * this.origin = origin;
     * }
     * <p>
     * public float getHeight() {
     * return height;
     * }
     * <p>
     * public void setHeight(float height) {
     * this.height = height;
     * }
     * <p>
     * public float getWeight() {
     * return weight;
     * }
     * <p>
     * public void setWeight(float weight) {
     * this.weight = weight;
     * }
     * <p>
     * public int getSpeed() {
     * return speed;
     * }
     * <p>
     * public void setSpeed(int speed) {
     * this.speed = speed;
     * }
     * <p>
     * public int getStrength() {
     * return strength;
     * }
     * <p>
     * public void setStrength(int strength) {
     * this.strength = strength;
     * }
     * <p>
     * public int getArmor() {
     * return armor;
     * }
     * <p>
     * public void setArmor(int armor) {
     * this.armor = armor;
     * }
     */

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }

    public Jaeger() {
    }

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


    @Override
    public String toString() {
        if (this.height == 0.0 && this.weight == 0.0 && this.speed == 0 && this.strength == 0 && this.armor == 0) {
            return this.modelName + " " + this.mark + " " + this.origin;
        }
        if (this.height != 0.0 && this.weight != 0.0 && this.speed == 0 && this.strength == 0 && this.armor == 0) {
            return this.modelName + " " + this.mark + " " + this.origin + " " + this.height + " " + this.weight;
        }
        return this.modelName + " " + this.mark + " " + this.origin + " " + this.height + " " + this.weight
                + " " + this.speed + " " + this.strength + " " + this.armor;
    }
}
