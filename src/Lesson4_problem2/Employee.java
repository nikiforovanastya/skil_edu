package Lesson4_problem2;

import java.sql.SQLOutput;

public class Employee {
    private String name;
    private String email = "не задан";
    private int phoneNumber = 0;
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Employee(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Employee(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + ((phoneNumber > 0) ? phoneNumber: "не задан"));
        System.out.println();
    }

}
