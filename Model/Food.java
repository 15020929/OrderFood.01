package com.example.xuan.orderfood.Model;

/**
 * Created by Admin on 31-01-18.
 */

public class Food {
    private String name, image, description, price, discount, menuid;

    public Food(){

    }

    public Food(String Pname, String Pimage, String Pdescription, String Pprice, String Pdiscount, String Pmenuid )
    {
        name = Pname;
        image = Pimage;
        description = Pdescription;
        price = Pprice;
        discount = Pdiscount;
        menuid = Pmenuid;
    }

    public String getDescription() {
        return description;
    }

    public String getDiscount() {
        return discount;
    }

    public String getImage() {
        return image;
    }

    public String getMenuid() {
        return menuid;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setDescription(String Pdescription) {
        this.description = Pdescription;
    }

    public void setDiscount(String Pdiscount) {
        this.discount = Pdiscount;
    }

    public void setImage(String Pimage) {
        this.image = Pimage;
    }

    public void setMenuid(String Pmenuid) {
        this.menuid = Pmenuid;
    }

    public void setName(String Pname) {
        this.name = Pname;
    }

    public void setPrice(String Pprice) {
        this.price = Pprice;
    }
}

