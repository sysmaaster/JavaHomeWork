package com.pb.enot.hw8;

import com.pb.enot.hw8.exception.WrongPasswordException;
import com.pb.enot.hw8.exception.WrongLoginException;

public class Auth {
    private String login;
    private String password;

    public Auth() {
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        System.out.println(login + " << login||pass>> " + password + "// confirm pass>> " + confirmPassword);
        this.login = login;
        this.password = password;
    }

    public void signIn(String login2, String password2) throws WrongLoginException {
        if (this.login.equals(login2) && this.password.equals(password2)) {
            System.out.println("Успешный вход!.");
        } else {
            throw new WrongLoginException();


        }
    }
}
