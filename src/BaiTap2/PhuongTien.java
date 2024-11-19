/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class PhuongTien {

    private String id;
    private String hangSX;
    private double gia;

    public PhuongTien() {
    }

    public PhuongTien(String id, String hangSX, double gia) {
        this.id = id;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Hang san xuat: ");
        this.hangSX = sc.nextLine();
        System.out.println("Ma phuong tien: ");
        this.id = sc.nextLine();
        System.out.println("Gia phuong tien: ");
        this.gia = sc.nextDouble();
        sc.nextLine();
    }
    public void xuatThongTin() {
        System.out.println("Hang san xuat: " + this.hangSX
                + "\nMa phuong tien: " + this.id
                + "\nGia phuong tien: " + this.gia);
    }
}
