package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
        int vasyaAge = 0;
        int katyaAge = 0;
        int mishaAge = 0;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if ((vasyaAge >= katyaAge) && (katyaAge >= mishaAge)) {
            max = vasyaAge;
            middle = katyaAge;
            min = mishaAge;
        } else if ((vasyaAge >= mishaAge) && (mishaAge >= katyaAge)) {
            max = vasyaAge;
            middle = mishaAge;
            min = katyaAge;
        } else if ((katyaAge >= vasyaAge) && (vasyaAge >= mishaAge)) {
            max = katyaAge;
            middle = vasyaAge;
            min = mishaAge;
        } else if ((katyaAge >= mishaAge) && (mishaAge >= vasyaAge)) {
            max = katyaAge;
            middle = mishaAge;
            min = vasyaAge;
        } else if ((mishaAge >= vasyaAge) && (vasyaAge >= katyaAge)) {
            max = mishaAge;
            middle = vasyaAge;
            min = katyaAge;
        } else if ((mishaAge >= katyaAge) && (katyaAge >= vasyaAge)) {
            max = mishaAge;
            middle = katyaAge;
            min = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);


    }
}
