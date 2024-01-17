package lesson3;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число: ");
            int value = new Scanner(System.in).nextInt();
            int fact = 1;
            for (int i = 1; i <= value; i++) {
                fact = fact * i;
            }
            System.out.println("Факториал введенного числа равен " + fact);
        }

    }
}
