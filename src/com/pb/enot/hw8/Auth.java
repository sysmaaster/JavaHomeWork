package com.pb.enot.hw8;

public class Auth {
    private String login;
    private String password;

    public Auth(){  }
    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String signUp(String login, String password, String confirmPassword){

        System.out.println(login + " << login||pass>> " + password + "// confirm pass>> " + confirmPassword);
        return login;
    }

    public void signIn (String login, String password) {
        System.out.println("logine : " + login +  "<< login||pass>> " + password);
    }
    public String getLogin() {        return login;    }
    public void setLogin(String login) {        this.login = login;    }
    public String getPassword() {        return password;    }
    public void setPassword(String password) {        this.password = password;    }
}
