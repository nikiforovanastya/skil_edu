package Lesson5_task21;

public class Main {
    public static void main(String[] args) {
        Country russia = new Country("Россия");
        russia.setCapitalName("Москва");
        russia.setSeaPath(true);
        russia.setSquare(17125.2);
        System.out.println("Площадь России составляет: " + russia.getSquare() + "тыс кв км");
        System.out.println("Столица нашей родины - " + russia.getCapitalName());
    }
}
