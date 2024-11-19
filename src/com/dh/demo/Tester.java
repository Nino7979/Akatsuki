package com.dh.demo;


public class Tester {
    public static void main(String[] args) {
        Hinh h1 = new HinhChuNhat(45, 30, "HCN1");
        Hinh h2 = new HinhVuong(25, "HV1");
        Hinh h3 = new TamGiac(36, 37, 38, "TG1");
        Hinh h4 = new TamGiacDeu(55, "TGD1");
        QLHinh ql = new QLHinh();
        ql.themHinh(h1);
        ql.themHinh(h2);
        ql.themHinh(h3);
        ql.themHinh(h4);
        ql.hienThi();
        System.out.println("=== SX GIAM CHU VI ===");
        ql.sxGiamCv();
        ql.hienThi();
        System.out.println("=== SX TANG DIEN TICH ===");
        ql.sxTangDt();
        ql.hienThi();
        System.out.println("=== LAY HINH TAM GIÁC ĐỀU ===");
        try {
            ql.LayHinhTheoLoai("com.dh.demo.TamGiacDeu").forEach(n -> System.out.println(n));
           
        } catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
