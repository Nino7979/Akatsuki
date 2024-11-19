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
public class HangDienMay extends HangHoa {
    private int thoiGianBH;

    public HangDienMay(int thoiGianBH, String tenHang, String hangSX, int gia) {
        super(tenHang, hangSX, gia);
        this.thoiGianBH = thoiGianBH;
    }

    public HangDienMay() {
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }
    public void nhapHH(Scanner sc){
        System.out.println("=== HANG DIEN MAY ===");
        super.nhapHH(sc);
        System.out.println("Nhap thoi gian bao hanh: ");
        this.thoiGianBH = sc.nextInt();
        sc.nextLine();
    }
    public void hienThi(){
        super.hienThi();
    }
    public String toString(){
        return "=== HANG DIEN MAY ===\n" + super.toString() + "\nThoi gian bao hanh: " + this.thoiGianBH;
    }
}
