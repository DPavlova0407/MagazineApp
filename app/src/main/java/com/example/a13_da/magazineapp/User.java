package com.example.a13_da.magazineapp;

/**
 * Created by 13_da on 05.04.2018.
 */

public class User {
    private static User INSTANCE = new User();
    private User(){}
    public static User getInstance(){
        return INSTANCE;
    }

    private String login;
    private String password;
    private String name;
    public void setUser(String login, String password, String name){
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return login + '\n' +
                password +'\n' +
                name + '\n';
    }
}
