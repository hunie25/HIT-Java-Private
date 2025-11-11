package Tuan4.BTVN.Model;

import java.util.Random;

public class Product {
    private int iD;
    private String name;
    private String description;
    private double price;
    private static int autoId = 1;

    public Product(String name, String description, double price) {
        this.iD = autoId++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getInfo() {
        return String.format("ID: %d | Name: %s | Description: %s | Price: %.2f", iD, name, description, price);
    }


    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class Smartphone {
    }
}
