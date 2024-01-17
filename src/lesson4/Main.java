package lesson4;

public class Main {
    public static void main(String[] args) {
        Arithmetic numNastya = new Arithmetic(12, 6);
        System.out.println("Сумма чисел 12 и 6: " + numNastya.sum());
        System.out.println("Произведение чисел 12 и 6: "+ numNastya.mult());
        System.out.println("Максимальное число из 12 и 6: " + numNastya.max());
        System.out.println("Минимальное число из 12 и 6: " + numNastya.min());
    }
}
