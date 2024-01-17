package lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        // int value = 15;
        System.out.println("Угадай целое число, которое я загадал. Оно от 0 до 100");
        while (true){
            int attempt = new Scanner(System.in).nextInt();
            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Угадал!");
                break;
            }
        }

    }
}
