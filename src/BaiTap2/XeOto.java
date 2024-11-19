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
public class XeOto extends PhuongTien {
    private int soChoNgoi;

    public XeOto(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public XeOto() {
    }

    public XeOto(int soChoNgoi, String id, String hangSX, double gia) {
        super(id, hangSX, gia);
        this.soChoNgoi = soChoNgoi;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("So cho ngoi: ");
        this.soChoNgoi = sc.nextInt();
        sc.nextLine();
    }
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("So cho ngoi: " + this.soChoNgoi);
    }
}
