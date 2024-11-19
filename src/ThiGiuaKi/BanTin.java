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
public class BanTin extends TapChi {
    private String tenCoQuan;

    public BanTin(String tenTL, String nhaXB, int gia, int sPT, String tPT, String tCQ) {
        super(tenTL, nhaXB, gia, sPT, tPT);
        this.tenCoQuan = tCQ;
    }
    public BanTin(){
        
    }

    public String getTenCoQuan() {
        return tenCoQuan;
    }

    public void setTenCoQuan(String tenCoQuan) {
        this.tenCoQuan = tenCoQuan;
    }
    
    public void nhapTL(Scanner sc){
        super.nhapTL(sc);
        System.out.println("Nhap ten co quan: ");
        this.tenCoQuan = sc.nextLine();
    }
    public String toString(){
        return super.toString() + "\nTen co quan: " + this.tenCoQuan;
    }
}
