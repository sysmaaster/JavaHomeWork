package com.pb.enot.hw4;

import java.util.Objects;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        for(int i = 0; i < 10;i++) {                      // не обовязкове.!
            Scanner in = new Scanner(System. in);
            System.out.println(" Введите Строку : ");
            String thisArray = new String("");  // Створим масив
            thisArray = in.nextLine();                ///Зберегаєм в Чемодан.
            if(Objects.equals(thisArray, "")) {
                System.out.println("Чемотан Пуст. Что-то пошло не так.!  ПОчиним  !. но можливо це повторитьсяя Знову!)");
                break;
            }else//
            thisArray = thisArray.substring(0,1).toUpperCase() + thisArray.substring(1).toLowerCase(); //кейс переносим в lowerC.

            upperCase(thisArray);                            // Зарос Метода
        }
    }
    public static void upperCase(String thisArr) {
        int em = thisArr.length();                       //знаєм дліну
        char[] fm1 =new char[em];                       //буффер текста
        int[] am2 =new int[em];                        //буфф в форматі чар
        thisArr.getChars(0,em,fm1,0); //Берем кейс переносим в Char. сохраняєм
        for(int j=1;j<em;j++)                        // Запустим цикл розберем кейс
        {
            am2[j]=fm1[j];                         // проверим синхронизицию * дліну
            if(am2[j-1]==' ' && fm1[j]>96)        // Якщо перед   синволом пробіл.  і символ є Буквой =Тру
            {  am2[j]=am2[j]-32;   }             // Повишаєм букву в Регистре
            fm1[j]=(char)am2[j];                // вертаєм значеня Чарс назад в Букву
        }
        for(int k=0;k<em;k++)
        {
            System.out.print(fm1[k]);       // вивод строки результатов
        }

    }
}