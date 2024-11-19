
package test;

import java.util.*;

public class BangDia extends SanPham {
    private float thoiGianPhat;

    public BangDia() {
    }

    public BangDia(String maSP, String tenSP, String moTa, Date ngaySanXuat, double giaBan, float thoiGianPhat) {
        super(maSP, tenSP, moTa, ngaySanXuat, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }
    public void nhapSP(Scanner sc){
        super.nhapSP(sc);
        System.out.println("Nhap thoi gian phat");
        this.thoiGianPhat = sc.nextFloat();
        sc.nextLine();
    }
      @Override
    public String toString() {
        return super.toString() + ", BangDia{thoiGianPhat=" + thoiGianPhat + " phut}";
    }
   
}
