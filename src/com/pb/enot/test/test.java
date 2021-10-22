package com.pb.enot.test;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);   // Пакет ввода с Клавиатури
        Random random = new Random();           //  Пакет Генератора Числа
        //Масиви та Масонни)
                       // Формула
        int hum;                           // число игрока
        int ii;                           // задуманое число

        //Начнем Гру
        System.out.println("Игра Угадай число");
        do { //хочеш начать Новую игру?

            // Загадываем натуральное число
            // от 1 до 100
            ii = 55;  //  (max - min) + min;
            System.out.println(ii);//удачи.Дебагинг.Удалить

            System.out.println("Я загадал число от 1 до 100. Угадай его!");

            do {
                System.out.println("* Введи число : ");
                hum = read.nextInt();

                //проверка Ответов
                if (hum >100 || hum <0) {
                    System.out.println("Я загадал число только от 1 до 100.");
                } else if (ii < hum) {
                    System.out.println("Не угадал! Моё число меньше.");
                } else if (ii > hum) {
                    System.out.println("Не угадал! Моё число больше.");
                } else if (hum == 666) {//проверка на Желания вийти. Удалить Игру!
                    System.out.println("Не угадал! Моё число больше.");
                } //повторем цикл до победного!
            }
            while (ii != hum);
            // Игрок угадал число
            System.out.println("Верно! Загадать еще число? (Y/N)");// как правильно?
            System.out.println(">>> 666 ");
            float retr = read.nextFloat();
        }
        while (hum == 666);// придумать Новое число?
        System.out.println("Спасибо За Игру");

        System.out.println("I'm free =) «all rights reserved by sysmaaster»");  // не удалять!!!
    }
}

