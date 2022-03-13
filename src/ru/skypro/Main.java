package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача №1
        int a = 1;
        while (a <= 10) {
            System.out.println(a++);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // Задача №2
        for (int dayNumber = 4; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 4) {
                System.out.println("Сегодня пятница " + dayNumber + "-е число. Необходимо подготовить отчет.");

            }
        }
        // Задача №3
        int arrivalTime = 79;
        int startYear = 1822;
        int lastYear = 2122;
        while (startYear <= lastYear) {
            startYear = startYear + arrivalTime;
            System.out.println (startYear);
        }
    }
}