/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class NhanVienC extends NhanVien {
    private double phuCap;
    public NhanVienC(String hoTen, String cmnd, String queQuan, String gioiTinh, String dienThoai, double pc) {
        super(hoTen, cmnd, queQuan, gioiTinh, dienThoai);
        this.phuCap = pc;
    }
    public double tinhLuong(int soNgayLam){
        return super.tinhLuong(soNgayLam) * 2.5 + this.phuCap;
    }
    public String toString(){
        return super.toString() + "\nPhu cap: " + this.phuCap;
    }
}
