package com.example.xuan.orderfood.Model;

/**
 * Created by xuan on 30/01/2018.
 */

public class User {

    private String name;
    private String password;

    public User() {
    }

    public User(String Pname, String Ppassword) {


        name = Pname;
        password = Ppassword;
    }

    public String setname(String Pname) {
        name = Pname;
        return name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}