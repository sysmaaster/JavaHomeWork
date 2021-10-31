package com.pb.enot.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //опрос пользователя
        System.out.println("Какую операцию необходимо провести (+,-,/,*) :"); //попробуйте и текст
        char sign = read.next().charAt(0); // С строк только первый символ!
        System.out.println("Введите первое число : ");
        int operand1 = read.nextInt();
        System.out.println("Введите второе число : ");
        int operand2 = read.nextInt();
        //Решения задачи
        int result;
        switch (sign) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат операции: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Результат операции: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Результат операции: " + result);
                break;
            case '/':
                if (operand2 == 0) { //хочеш поделить на 0 ???
                    System.out.println("Деление на Ноль Серьезно? не делай так Больше!");
                    break;
                } else {
                    result = operand1 / operand2;
                    System.out.println("Результат операции: " + result);
                    break;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }

    }

}
