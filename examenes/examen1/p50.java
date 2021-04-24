package examen1;

import java.time.LocalTime;

public class p50 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM":"otra";
        System.out.println(amPm);
    }
}