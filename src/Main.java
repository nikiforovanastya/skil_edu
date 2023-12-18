
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int fuelType = 95;
        int amount = 500;
        int maxAmount = 400;

        double fuel92price = 61.1;
        double fuel95price = 65.88;

        double fuelPrice = 0;

        if (fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Указан неверный тип топлива!");
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива!");
            amount = 0;
        }

        if (amount > maxAmount){
            System.out.println("Указанное количество топлива превышает максимально допустимое!");
            System.out.println("Будет продано " + maxAmount + " литров!");
            amount = maxAmount;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");



    }
}