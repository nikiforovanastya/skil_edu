package Lesson4_problem;

public class User {
    public String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return name;
    }

    public int getUserAge() {
        return age;
    }

}
