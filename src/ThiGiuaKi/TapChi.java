/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiGiuaKi;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private String thangPhatHanh;
    public TapChi(String tenTL, String nhaXB, int gia, int sPT, String tPT) {
        super(tenTL, nhaXB, gia);
        this.soPhatHanh = sPT;
        this.thangPhatHanh = tPT;
    }
    public TapChi(){
        
    }
    public int getSoPhatThanh() {
        return soPhatHanh;
    }

    public void setSoPhatThanh(int soPhatThanh) {
        this.soPhatHanh = soPhatThanh;
    }

    public String getThangPhatThanh() {
        return thangPhatHanh;
    }

    public void setThangPhatThanh(String thangPhatThanh) {
        this.thangPhatHanh = thangPhatThanh;
    }
    public void nhapTL(Scanner sc){
        super.nhapTL(sc);
        System.out.println("Nhap so phat hanh: ");
        this.soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thang phat hanh: ");
        this.thangPhatHanh = sc.nextLine();
    }
    public String toString(){
        return super.toString() + "\nSo phat hanh: " + this.soPhatHanh + "\nThang phat hanh: " + this.thangPhatHanh;
    }
}
