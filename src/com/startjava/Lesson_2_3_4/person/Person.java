package Lesson_2_3_4.person;

public class Person {
    String gender = "male";
    String name = "Pavel";
    double height = 1.82;
    int weightBody = 120;
    int age = 35;

    boolean learnJava() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sit down");
    }

    void run() {
        System.out.println("to run");
    }

    void speak() {
        System.out.println("to speak");
    }
}