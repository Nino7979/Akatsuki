/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiuaKiDe2;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class HangHoa {

    private String tenHang, hangSX;
    private int gia;

    public HangHoa() {
    }

    public HangHoa(String tenHang, String hangSX, int gia) {
        this.tenHang = tenHang;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void nhapHH(Scanner sc) {
       
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        this.hangSX = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        this.gia = sc.nextInt();
        sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Gia tien: " + gia + "\nTen hang: " + tenHang);
    }
    public String toString() {
        return "Ten hang: " + this.tenHang + "\nHang san xuat: "
                + this.hangSX + "\nGia tien: " + this.gia;
    }
    
}
