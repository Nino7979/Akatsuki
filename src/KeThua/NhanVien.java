package KeThua;

import java.util.Scanner;

public class NhanVien {
    protected final double LUONG = 100.000;
    private int maSo;
    private String cmnd, hoTen, queQuan, gioiTinh, dienThoai;
    private static int dem = 0;
    public NhanVien(){
       
    }
    {
    maSo = ++dem;
    }

    public NhanVien(String hoTen, String cmnd, String queQuan, String gioiTinh, String dienThoai) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        NhanVien.dem = dem;
    }
    public double tinhLuong(int soNgayLam){
        return LUONG * soNgayLam;
    }
    public void nhapNV(Scanner sc){
        System.out.println("Nhap ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap cmnd: ");
        this.cmnd = sc.nextLine();
        System.out.println("Nhap que quan: ");
        this.queQuan = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.dienThoai = sc.nextLine();
    }
    public String toString(){
        return "Ma so: " + this.maSo + "\nHo ten: " + this.hoTen + "\nCmnd: " + 
                this.cmnd + "\nQue quan: " + this.queQuan + "\nGioi tinh: " + 
                this.gioiTinh + "\nSo dien thoai: " + this.dienThoai;
    }
}
