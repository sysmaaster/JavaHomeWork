package com.pb.enot.hw4;

import java.util.Objects;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите Строку : ");
        String thisArray;  // Створим масив
        thisArray = in.nextLine();                ///Зберегаєм в Чемодан.
        if (Objects.equals(thisArray, "")) {
            System.out.println("Чемотан Пуст. Что-то пошло не так.!  ПОчиним  !. но можливо це повторитьсяя Знову!)");
        } else
            thisArray = thisArray.substring(0, 1).toUpperCase() + thisArray.substring(1).toLowerCase(); //кейс переносим в lowerC.

        upperCase(thisArray);
    }
    public static void upperCase(String thisArr) {
        int em = thisArr.length();
        char[] fm1 = new char[em];
        int[] am2 = new int[em];
        thisArr.getChars(0, em, fm1, 0);
        for (int j = 1; j < em; j++) {
            am2[j] = fm1[j];
            if (am2[j - 1] == ' ' && fm1[j] > 96) {
                am2[j] = am2[j] - 32;
            }
            fm1[j] = (char) am2[j];
        }
        for (int k = 0; k < em; k++) {
            System.out.print(fm1[k]);
        }
    }
}