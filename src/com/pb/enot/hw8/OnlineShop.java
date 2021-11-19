package com.pb.enot.hw8;
import com.pb.enot.hw8.exception.WrongLoginException;
import com.pb.enot.hw8.exception.WrongPasswordException;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Auth authUp = new Auth();
            Scanner init = new Scanner(System.in);
        System.out.println("Вітаю на нашому магазині. Для початку Закупів з раббвтой в 50% вам необхідно зареєструватися.");
        System.out.print("Введіть ваш Логін >>");
        String rLogin = init.nextLine();
        System.out.print("Введіть ваш Пароль >>");
        String rPass = init.nextLine();
        System.out.print("Повторіть пароль >>");
        String rPass2 = init.nextLine();
        authUp.signUp(rLogin,rPass,rPass2);


        System.out.println("*************************");
        System.out.println ("* Вход пользователя *");
        System.out.println("*************************");

        System.out.println("Введіть ваш Логін >>");
        String authLogin = init.nextLine();
        System.out.println("Введіть ваш Пароль >>");
        String authPass = init.nextLine();
        authUp.signIn(authLogin,authPass);


//        if (login.equals(br.readLine()) && pass.equals(br.readLine()))
       //  System.out.println("«Успешно вошел в систему, добро пожаловать " +rLogin+"!»");
//            System.out.Println («Имя пользователя и пароль не совпадают, пожалуйста, введите!»);
//




  }
}
