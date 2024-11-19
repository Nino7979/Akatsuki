package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SanPham {

    private String maSP, tenSP, moTa;
    private Date ngaySanXuat;
    private double giaBan;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String moTa, Date ngaySanXuat, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void nhapSP(Scanner sc) {
        System.out.println("Nhap ma san pham: ");
        this.maSP = sc.nextLine();
        System.out.println("Nhap ten san pham");
        this.tenSP = sc.nextLine();
        System.out.println("Nhap mo ta san pham");
        this.moTa = sc.nextLine();
        System.out.println("Nhap ngay san xuat san pham");
        String ngaySX = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaySanXuat = df.parse(ngaySX);
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ! Đặt ngày sản xuất mặc định là hôm nay.");
            this.ngaySanXuat = new Date(); // Ngày hiện tại
        }
        System.out.println("Nhap gia ban");
        this.giaBan = sc.nextDouble();
    }

    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return "SanPham{"
                + "maSP='" + maSP + '\''
                + ", tenSP='" + tenSP + '\''
                + ", moTa='" + moTa + '\''
                + ", ngaySanXuat=" + df.format(ngaySanXuat)
                + ", giaBan=" + giaBan
                + '}';
    }
}


