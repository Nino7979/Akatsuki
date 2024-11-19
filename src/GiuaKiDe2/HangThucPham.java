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
public class HangThucPham extends HangHoa {
    private String ngaySX, hanSD;

    public HangThucPham() {
        
    }

    public HangThucPham(String ngaySX, String hanSD, String tenHang, String hangSX, int gia) {
        super(tenHang, hangSX, gia);
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
    }

    

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getHanSD() {
        return hanSD;
    }

    public void setHanSD(String hanSD) {
        this.hanSD = hanSD;
    }
    public void nhapHH(Scanner sc){
        System.out.println("=== HANG THUC PHAM ===");
        super.nhapHH(sc);
        System.out.println("Nhap ngay san xuat: ");
        this.ngaySX = sc.nextLine();
        System.out.println("Nhap han su dung: ");
        this.hanSD = sc.nextLine();
    }
    public void hienThi(){
        super.hienThi();
    }
    public String toString(){
        return "=== HANG THUC PHAM ===\n" + super.toString() + "\nNgay san xuat: " + this.ngaySX + "\nHan su dung: " + this.hanSD;
    }
}
