package com.pb.enot.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int[] masson = new int[10];//
        int cv1 = 0;
        int n = masson.length;
        for (int element : masson) {
            System.out.print("Введите " + (cv1 + 1) + "-й элемент массива: ");
            masson[cv1] = in.nextInt();
            cv1++;
        }
        System.out.println("Ваш масив: ");
        for (int k : masson) {
            System.out.print(k + ".");
        }
        System.out.println("");
        int sum = 0;
        int posit = 0;
        for (int j : masson) {
            if (j > 0) {
                posit++;
            }
            sum = j + sum;
        }
        System.out.print("");
        System.out.println("Загальна сума Складає >> " + sum);
        System.out.println(">>" + posit + " позитивних елементів");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (masson[j] > masson[j + 1]) {
                    int temp = masson[j];
                    masson[j] = masson[j + 1];
                    masson[j + 1] = temp;
                }
        }
        System.out.println("Результат (bubble sort)");
        for (int j : masson) {
            System.out.print(j + ".");
        }
        // end soda&
    }
}

