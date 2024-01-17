package lesson3;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        for (int i = a; i >= 1; i = i - 1) {
            if (a % i != 0) {
                continue;
            }
            int b = a / i;
            System.out.println(b + " * " + i);
        }
    }
}
