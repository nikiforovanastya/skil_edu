package Lesson4_problem2;

public class Main {
    public static void main(String[] args) {
        Employee egor = new Employee("Егор Максимович", 1072);
        Employee nastay = new Employee("Анастасия Викторовна", "leto@mail.com");
        Employee max = new Employee("Максим Олегович", "zima@mail.com", 5024);

        egor.printInfo();
        nastay.printInfo();
        max.printInfo();
    }
}
