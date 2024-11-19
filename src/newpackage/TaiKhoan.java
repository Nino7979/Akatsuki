/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class TaiKhoan {

    private static int dem = 0;
    protected String soTaiKhoan;
    protected String tenTaiKhoan;
    protected String diaChi;
    protected String email;
    protected double soTien;

    {
        dem++;
        this.soTaiKhoan = String.format("%06d", dem);
    }

    public TaiKhoan(String soTaiKhoan, String tenTaiKhoan, String diaChi, String email, double soTien) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.diaChi = diaChi;
        this.email = email;
        this.soTien = soTien;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public TaiKhoan() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public boolean ktDaoHan() {
        return true;
    }

    public void rutTien(double soTien) {
        
        this.soTien -= soTien;
    }

    public void nopTien(double soTien) {
        
        this.soTien += soTien;
    }

    public double tinhTienLai() {
        double laiSuat = 0.001;
        if (this.ktDaoHan()) {
            double tienLai = soTien * laiSuat;
            System.out.println("Tien lai duoc cong them: " + tienLai);
            this.soTien += tienLai;
            return tienLai;
        } else {
            System.out.println("Chưa đến ngày đáo hạn");
            return 0;
        }

    }
    public void nhapTK(Scanner sc){
        System.out.println("Ten tai khoan: ");
        this.tenTaiKhoan = sc.nextLine();
        System.out.println("So tien: ");
        this.soTien = sc.nextDouble();
        sc.nextLine();
    }
    public String toString() {
        return "So tai khoan: " + this.soTaiKhoan + "\nTen tai khoan: "
                + this.tenTaiKhoan + "\nSo tien: " + this.soTien;
    }
}
