package com.dh.demo;

import java.util.*;

public class QLHinh {

    private List<Hinh> ds = new ArrayList<>();

    public void themHinh(Hinh n) {
        this.ds.add(n);
    }

    public void xoaHinh(Hinh n) {
        this.ds.remove(n);
    }

    public void hienThi() {
        for (Hinh x : this.ds) {
            System.out.println(x);
        }
    }

    public void sxGiamCv() {
        this.ds.sort((h1, h2) -> {
            double cv1 = h1.tinhChuVi();
            double cv2 = h2.tinhChuVi();
            return -(cv1 > cv2 ? 1 : (cv1 < cv2 ? -1 : 0));
        });

    }

    public void sxTangDt() {
        this.ds.sort((h1, h2) -> {
            double dt1 = h1.tinhDienTich();
            double dt2 = h2.tinhDienTich();
//            return dt1 > dt2 ? 1 : (dt1 < dt2 ? -1 : 0); 
            return (int)dt1 - (int)dt2;
        });
    }

    //cach 1
//    public List<Hinh> layHinhTheoLoai1(){
//        List<Hinh> kq = new ArrayList<>();
//        for(Hinh x : ds)
//            if ( x instanceof HinhChuNhat)
//                kq.add(x);
//        return kq;
//    }.forEach(n -> System.out.println(n));
           
    //cach 2
    public List<Hinh> LayHinhTheoLoai(String duongDanLoaiHinh) throws ClassNotFoundException {
        Class c = Class.forName(duongDanLoaiHinh);
        List<Hinh> kq = new ArrayList<>();
        for (Hinh x : ds) {
            if (c.isInstance(x)) {
                kq.add(x);
            }
        }
        return kq;
    }

    public List<Hinh> getDs() {
        return ds;
    }

    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }

}
