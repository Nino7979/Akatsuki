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
public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(double trongTai, String id, String hangSX, double gia) {
        super(id, hangSX, gia);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public XeTai() {
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Trong tai: ");
        this.trongTai = sc.nextDouble();
        sc.nextLine();
    }
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Trong tai: " + this.trongTai);
    }
}
