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
        int count = 0;                   // лічильник Спроб
        char re;                       // Для питаня про повторну Гру

        //Начнем Гру
        System.out.println("Игра Угадай число");
        do { //хочеш начать Новую игру?

            // Загадуєм число от 1 до 100
            ii = random.nextInt(diff + 1) + min;  //  (max - min) + min;
            System.out.println(ii);//удачи.Дебагинг.Удалить
            System.out.println("Я загадал число от 1 до 100. Угадай его!");
            System.out.println("для виходу використати пароль 666");
            System.out.println("нет Часу на роздуми");
            // начать Цикл самої гри
            do {
                System.out.println("* Введи число : ");
                hum = read.nextInt();
                count++;  // ***
                //проверка Ответов => Правил
                if (hum == 666) {  //проверка на Желания вийти. Удалить Игру!
                    System.out.println("Дякую  за Гру!");
                    return;
                } else if (hum > 100 || hum < 0) {
                    System.out.println("Я загадал число только от 1 до 100.");
                } else if (ii < hum) {
                    System.out.println("Не угадал! Моє число меньше.");
                } else if (ii > hum) {
                    System.out.println("Не угадал! Моє число больше.");
                }//повторем цикл до победного!
            }
            while (ii != hum);  // Игрок угадал число?
            System.out.println("Верно. ви угадали!!");
            System.out.println("Використано >>> " + count + " спроб!");
            System.out.println(" Загадать еще число? (+/-)");
            re = read.next().charAt(0);

        }
        while (re == '+');// придумать Новое число?
        System.out.println("Спасибо За Игру");
        System.out.println("I'm free =) «all rights reserved by sysmaaster»");  // не удалять!!!
    }
}
