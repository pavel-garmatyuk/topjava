public class Wolf {
    private String gender;
    private String nickname;
    private int weightBody;
    private int age;
    private String color;

    public void move() {
        System.out.println("moving");
    }

    public void sit() {
        System.out.println("to sit down");
    }

    public void run() {
        System.out.println("to run");
    }

    public void howl() {
        System.out.println("to howl");
    }

    public void hunt() {
        System.out.println("to start the hunt");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeightBody() {
        return weightBody;
    }

    public void setWeightBody(int weightBody) {
        this.weightBody = weightBody;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
            System.exit(0);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}