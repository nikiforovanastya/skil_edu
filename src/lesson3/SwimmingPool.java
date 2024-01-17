package lesson3;

public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200; // volume pool
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int curVolume = 0;
        int time = 0;

        while (curVolume < volume) {
            curVolume = curVolume + fillingSpeed;
            curVolume = curVolume - devastationSpeed;
            time++;
        }

        System.out.println("Бассейн наполнится за " + time + " минут");

    }
}
