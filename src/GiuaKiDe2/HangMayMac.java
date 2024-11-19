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
public class HangMayMac extends HangHoa {
    private String nguyenLieu;
    private int kichCo;

    public HangMayMac(String nguyenLieu, int kichCo, String tenHang, String hangSX, int gia) {
        super(tenHang, hangSX, gia);
        this.nguyenLieu = nguyenLieu;
        this.kichCo = kichCo;
    }

    public HangMayMac() {
    }

    public String getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(String nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }
    public void nhapHH(Scanner sc){
        System.out.println("=== HANG MAY MAC ===");
        super.nhapHH(sc);
        System.out.println("Nhap nguyen lieu: ");
        this.nguyenLieu = sc.nextLine();
        System.out.println("Nhap kich co: ");
        this.kichCo = sc.nextInt();
        sc.nextLine();
    }
    public void hienThi(){
        super.hienThi();
    }
    public String toString(){
        return "=== HANG MAY MAC ===\n" + super.toString() + "\nNguyen lieu: " + this.nguyenLieu + "\nKich co: " + this.kichCo;
    }
}
