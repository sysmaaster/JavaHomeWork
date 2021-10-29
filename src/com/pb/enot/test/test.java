package com.pb.enot.test;

import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String tisA1 = "";// Створим масив 1
            String tisA2 = "";// Створим масив 2
            String to;

            for (int m = 1; m < 2; m++) {
                tisA2 = tisA1;
                System.out.println(" gjx : ");
                tisA1 = intupText(m);
                if (Objects.equals(tisA1, "")) {
                    System.out.println("Ой.! Знову    !( " );
                    break;
                } else
                    to = tokenizer(tisA1);
                    System.out.println(to);
            }
System.out.println(tisA2 + " +++");
        }
    }

    public static String intupText(int n){
        Scanner in = new Scanner(System.in);
        String Ais;
        System.out.println(" Введите Строку" + n + " : ");
        Ais = in.nextLine();///Зберегаєм в Чемодан.

        return Ais;
    }
    public static String tokenizer(String s){
        s=s.toLowerCase() + s.replaceAll("[^A-z]", "");
        StringTokenizer tok = new StringTokenizer(s,"`~!@#$%^&*()-_+=\\.,><? ");
        StringBuilder s1 = new StringBuilder();
        while(tok.hasMoreTokens()){
            s1.append(tok.nextToken());
        }
        return s1.toString();
    }




            //
            //    public static void upperCase(String tiA1 ,String tiA2) {
            //        int em = tiA1.length();
            //        char[] fm1 = new char[em];
            //        int[] am2 = new int[em];
            //        tiA1.getChars(0, em, fm1, 0); //Берем кейс переносим в Char. сохраняєм
            //        for (int j = 1; j < em; j++)  // Запустим цикл розберем кейс
            //        {
            //            am2[j] = fm1[j]; // проверим синхронизицию * дліну
            //            if (am2[j - 1] == ' ' && fm1[j] > 96)  // Якщо перед   синволом був пробіл.  і символ Буква =Тру
            //            {
            //                am2[j] = am2[j] - 32; // Повишаєм букву в Регистре
            //            }
            //            fm1[j] = (char) am2[j];
            //        }
            //        for (int k = 0; k < em; k++)  //
            //        {
            //            System.out.print(fm1[k]);
            //        }
            //
            //    }

}
