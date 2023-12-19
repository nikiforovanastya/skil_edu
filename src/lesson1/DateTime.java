package lesson1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
