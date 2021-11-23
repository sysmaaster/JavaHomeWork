package com.pb.enot.hw8;

import com.pb.enot.hw8.exception.WrongLoginException;
import com.pb.enot.hw8.exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public Auth() {    }
    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (Pattern.matches("[a-zA-Z0-9]{5,20}", login)) { this.login = login;        }
        else {   throw new WrongLoginException("Логин не соответствует требованиям! ");     }
        if (Pattern.matches("[a-zA-Z0-9]{5,}(\\_*)",password)) {                      }
        else {   throw new WrongPasswordException("Пароль не соответствует требованиям! "); }
        if (password.equals(confirmPassword)) {           this.password = password;         }
        else {   throw new WrongPasswordException("Введений пароль не сoвпадає");           }
    }

    public void signIn(String login2, String password2) throws WrongPasswordException, WrongLoginException {
         if (this.login.equals(login2) && this.password.equals(password2)) {
            System.out.println("Успешный вход!.");
         } else throw new WrongLoginException("Введен неправильный логин или неверный пароль.");
    }
}
