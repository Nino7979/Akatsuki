package com.dh.demo;


public class TamGiac extends Hinh {
    private double a, b, c;

    public TamGiac(double a, double b, double c, String ten) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double tinhDienTich(){
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
    public double tinhChuVi(){
        return this.a + this.b + this.c;
    }
}
