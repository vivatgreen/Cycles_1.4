package ru.skypro;

import java.time.LocalDate;
import java.time.Year;

public class Main {

    public static void main(String[] args) {
        // Задача №1
        int a = 0;
        while (a < 10) {
            System.out.print(++ a + " ");
        }
        System.out.println();


        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        // Задача №2
        for (int dayNumber = 4; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 4) {
                System.out.println("Сегодня пятница " + dayNumber + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        // Задача №3
        int currentYear = 2022;
        int start = currentYear - 200;
        int finish = currentYear + 100;
        for (int year = start; year <= finish; year+=79) {
            System.out.println(year);
        }
    }
}