package Lesson4_problem;

import java.util.Scanner;
import java.util.Set;

public class Method {

    public static void main(String[] args) {
        User dima = new User("Дмитрий", 45);
        User nastya = new User("Анастасия", 33);
        User max = new User("Максим", 1114);
        printUserInfo(dima);
        printUserInfo(nastya);
        printUserInfo(max);


    }

    public static void printUserInfo(User currentUser) {
        String tailString = "";
        int tailAge = currentUser.getUserAge() % 10;
        int teenTail = (currentUser.getUserAge() / 10) % 10;
        if (teenTail == 1) {
            tailString = " лет";
        } else if (tailAge == 1) {
            tailString = " год";
        }
        else if (Set.of(2, 3, 4).contains(tailAge)) {
            tailString = " года";
        } else {
            tailString = " лет";
        }
        System.out.println("Пользователь: " + currentUser.getUserName() + ", " + currentUser.getUserAge() + tailString);

    }

}
