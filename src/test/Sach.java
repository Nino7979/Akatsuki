
package test;

import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham {
    private int soTrang;
    public Sach() {
    }

    public Sach(String maSP, String tenSP, String moTa, Date ngaySanXuat, double giaBan, int soT) {
        super(maSP, tenSP, moTa, ngaySanXuat, giaBan);
        this.soTrang = soT;
    }
    public void nhapSP(Scanner sc){
        super.nhapSP(sc);
        System.out.println("Nhap so trang");
        this.soTrang = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + ", Sach{soTrang=" + this.soTrang + '}';
    }
    
}
