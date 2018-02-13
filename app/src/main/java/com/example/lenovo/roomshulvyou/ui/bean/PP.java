package com.example.lenovo.roomshulvyou.ui.bean;

/**
 * Created by lenovo on 2018/1/30.
 */

public class PP {
    private int img;
    private int img1;

    @Override
    public String toString() {
        return "PP{" +
                "img=" + img +
                ", img1=" + img1 +
                '}';
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public PP(int img, int img1) {
        this.img = img;
        this.img1 = img1;
    }
}
