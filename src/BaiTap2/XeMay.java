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
public class XeMay extends PhuongTien {
    private int congSuat;

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay() {
    }

    public XeMay(int congSuat, String id, String hangSX, double gia) {
        super(id, hangSX, gia);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Cong suat: ");
        this.congSuat = sc.nextInt();
        sc.nextLine();
    }
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Cong suat: " + this.congSuat);
    }
}
