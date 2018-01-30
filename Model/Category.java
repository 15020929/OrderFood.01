package com.example.xuan.orderfood.Model;

/**
 * Created by xuan on 30/01/2018.
 */

public class Category {
    private String name;
    private String image;

    public Category(){

    }

    public Category(String Pname, String Pimage) {
        name = Pname;
        image = Pimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String Pname) {
        this.name = Pname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String Pimage) {
        this.image = Pimage;
    }
}
