package com.example.xuan.orderfood.Model;

import java.util.List;

/**
 * Created by Admin on 01-02-18.
 */

public class Request {
    private String phone;
    private String name;
    private String address;
    private String total;

    private List<Order> foods; //List of food order

    public Request() {

    }

    public Request(String phone, String name, String address, String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.foods = foods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public String getAddress() {
        return address;
    }

    public String getTotal() {
        return total;
    }
}
