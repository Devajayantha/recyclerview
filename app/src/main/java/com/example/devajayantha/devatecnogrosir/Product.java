package com.example.devajayantha.devatecnogrosir;

public class Product {

    private int id;
    private String title , desc, harga;
    private int image;

    public Product(int id, String title, String desc, String harga, int image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.harga = harga;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getHarga() {
        return harga;
    }

    public int getImage() {
        return image;
    }

}
