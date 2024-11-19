package KeThua;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QlNhanVien {

    private List<NhanVien> ds = new ArrayList<>();

    public List<NhanVien> getDs() {
        return ds;
    }

    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

    public void themNV(NhanVien nv) {
        this.ds.add(nv);
    }

    public void xoaNhanVien(NhanVien nv) {
        this.ds.remove(nv);
    }

//    public void hienThi() {
//        for (NhanVien x : ds) {
//            System.out.println(x);
//        }
//    }
    public String toString(){
        String s = "";
        for(NhanVien nv : ds){
            s += nv + "\n===============\n";
        }
        return s;
        
    }

    public QlNhanVien traCuu(String tuKhoa) {
        QlNhanVien kq = new QlNhanVien();
        tuKhoa = tuKhoa.toLowerCase();
        for (NhanVien nv : ds) {
            if (nv.getHoTen().toLowerCase().contains(tuKhoa) || nv.getCmnd().toLowerCase().equals(tuKhoa)) {
                kq.themNV(nv);
            }
        }
        return kq;
    }

    public void tinhLuong(Scanner sc) {
        for (NhanVien nv : ds) {
            System.out.println("Nhap so ngay cong cua " + nv.getHoTen().toUpperCase() + ": ");
            int soNgay = sc.nextInt();
            System.out.println("Tien luong cua " + nv.getHoTen().toUpperCase() + " la: " + nv.tinhLuong(soNgay));
        }
    }
}
