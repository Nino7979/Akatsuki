
package ThiGiuaKi;

import java.util.Scanner;

public class Tester {
    private String tenTL, nhaXB;
    private int gia;

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getGia() {
        return gia;
    }
    public TaiLieu(){
        
    }
    public void setGia(int gia) {
        this.gia = gia;
    }

    public TaiLieu(String tenTL, String nhaXB, int gia) {
        this.tenTL = tenTL;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }
    public void nhapTL(Scanner sc){
        System.out.println("Nhap ten tai lieu: ");
        this.tenTL = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        this.nhaXB = sc.nextLine();
        System.out.println("Nhap gia: ");
        this.gia = sc.nextInt();
        sc.nextLine();
    }
    public String toString(){
        return "Ten tai lieu: " + this.tenTL + "\nNha xuat ban: " + this.nhaXB + "\nGia: " + this.gia;
    }
}
