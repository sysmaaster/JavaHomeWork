package com.pb.enot.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);   // Пакет ввода с Клавиатури
        Random random = new Random();           //  Пакет Генератора Числа
        //Масиви та Масонни)
        int min = 0;                          //мінімальне
        int max = 100;                       // Максимальне значеня
        int diff = max - min;               // Формула
        int hum;                           // число игрока
        int ii;                           // задуманое число

        //Начнем Гру
        System.out.println("Игра Угадай число");
        do { //хочеш начать Новую игру?

            // Загадываем натуральное число
            // от 1 до 100
            ii = random.nextInt(diff + 1) + min;  //  (max - min) + min;
            //System.out.println(ii);//удачи.Дебагинг.Удалить

            System.out.println("Я загадал число от 1 до 100. Угадай его!");
            System.out.println("для завершения используй 666");
            System.out.println("нет времени на Роздумия");
            // начать Цикл самой Игри
            do {   // как правильно?
                System.out.println("* Введи число : ");
                hum = read.nextInt();
                System.out.println(hum);
                //проверка на Желания вийти. Удалить Игру!
                // ***
                //  ***
                //проверка Ответов
                if (ii < hum) {
                    System.out.println(" Не угадал! Моё число меньше.");
                } else if (ii > hum) {
                    System.out.println(" << Не угадал! Моё число больше.");
                } //повторем цикл до победного!
            }
            while (ii != hum);
            // Игрок угадал число
            System.out.println("Верно! Загадать еще число? (Y/N)");
            System.out.println(">>> 666 ");
            float retr = read.nextFloat();
        }
        while (hum == 666);// придумать Новое число?
        System.out.println("Спасибо За Игру");

        System.out.println("I'm free =) «all rights reserved by sysmaaster»");  // не удалять!!!
    }
}
