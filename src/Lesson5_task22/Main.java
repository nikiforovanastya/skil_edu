package Lesson5_task22;

public class Main {
    public static void main(String[] args) {
        Ass myAss = new Ass("Белая", true );
        myAss.setWeight(20.7);
        myAss.setGirth(116);
        System.out.println("Моя жопа - " + myAss.getColor());
        System.out.println("Весит: " + myAss.getWeight() + " кг");
        if (myAss.isCellulite()) {
            System.out.println("На ней есть цилюль");
        }
        else {
            System.out.println("Зато без целлюлита");
        }
        System.out.println("В обхвате она " + myAss.getGirth() + " см");
    }
}
