package com.pb.enot.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("Введите число : ");
        int n = read.nextInt();   // Запрос для ввода число
        String sms = "Введенное число " + n + ", попадает в промежуток :";   // Строка для виводу екрана смс
        //Проверка
        if (n >= 0 && n <= 14) {
            System.out.println(sms + " [0 -14]  ");
        } else if (n >= 15 && n < 35) {
            System.out.println(sms + "  [15 - 35] ");
        } else if (n >= 36 && n < 50) {
            System.out.println(sms + "  [36 - 50] ");
        } else if (n >= 51 && n < 100) {
            System.out.println(sms + "  [51 - 100] ");
        } else {
            System.out.println("Скорее всего, вы допустили ошибку и неверно указали число");
        }

    }
}
