package com.dh.demo;


public abstract class Hinh {
    private String ten;

    public Hinh(String ten) {
        this.ten = ten;
    }

    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public String toString(){
        return String.format("%s\nDien tich: %.2f\nChu vi: %.2f\n", this.ten, 
                this.tinhDienTich(), this.tinhChuVi());
    }
}
