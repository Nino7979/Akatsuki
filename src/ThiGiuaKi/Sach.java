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
public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenTacGia, int soTrang, String tenTL, String nhaXB, int gia) {
        super(tenTL, nhaXB, gia);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    public Sach(){
        
    }
    

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public void nhapTL(Scanner sc){
        super.nhapTL(sc);
        System.out.println("Nhap ten tac gia: ");
        this.tenTacGia = sc.nextLine();
        System.out.println("Nhap so trang: ");
        this.soTrang = sc.nextInt();
        sc.nextLine();
    }
    public String toString(){
        return super.toString() + "\nTen tac gia: " + this.tenTacGia + "\nSo trang: " + this.soTrang;
    }
}
