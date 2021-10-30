package com.pb.enot.hw4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {
    public static void main(String[] args) {
        String tisA1 ;// Створим масив 1
        String tisA2 ;// Створим масив 2
        tisA1 = tokenizer(intText(1));
        tisA2 = tokenizer(intText(2));
        if (tisA1.compareTo(tisA2) == 0) {
            System.out.println("Это слово или фраза є Анаграммой");
        } else {
            System.out.println("НЕ Анаграмма!");
        }
    }
    public static String intText(int n) {
        Scanner in = new Scanner(System.in);
        String inText;
        do {
            System.out.println(" Введите Строку " + n + " :");
            inText = in.nextLine();///Зберегаєм в Чемодан.
            if (Objects.equals(inText, "")) {
                System.out.println("Ой.! Строка пуста( ");
            }
        } while (Objects.equals(inText, ""));
        return inText;
    }
    public static String tokenizer(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        StringTokenizer tok = new StringTokenizer(s, "`~!@#$%^&*()-—/_+=\\.,><? ");
        String s1 = "";
        while (tok.hasMoreTokens()) {
            s1 = tok.nextToken();
        }
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String sortString = new String(charArray);
        return sortString;
    }
}
