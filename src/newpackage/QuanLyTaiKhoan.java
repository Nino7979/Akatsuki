/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.*;

/**
 *
 * @author Latitude 7420
 */
public class QuanLyTaiKhoan {

    private List<TaiKhoan> ds = new ArrayList<>();

    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }

    public void themTaiKhoan(TaiKhoan tk) {
        this.ds.add(tk);
    }

    public TaiKhoan traCuu1(String soTk) {
        for (TaiKhoan tk : ds) {
            if (tk.getSoTaiKhoan().equals(soTk)) {
                return tk;
            }
        }
        System.out.println("Khong tim thay so tai khoan");
        return null;
    }
    public List<TaiKhoan> traCuu2(String tuKhoa){
        List<TaiKhoan> kq = new ArrayList<>();
        tuKhoa = tuKhoa.toLowerCase();
        for(TaiKhoan tk : ds){
            if(tk.getTenTaiKhoan().toLowerCase().contains(tuKhoa)){
                kq.add(tk);
            }
        }
        return kq;
    }
    public String toString(){
        String a = "";
        for(TaiKhoan tk : ds){
            a += tk + "\n===================\n";
        } return a;
    }
}
