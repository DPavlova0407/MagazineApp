package com.example.a13_da.magazineapp;

/**
 * Created by 13_da on 05.04.2018.
 */

public class Magazine {
    private String name;
    private String adress;
    private String user;

    public Magazine(String name, String adress, String user){
        this.name = name;
        this.adress = adress;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getUser() {
        return user;
    }
}
