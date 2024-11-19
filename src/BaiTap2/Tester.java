/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
//public class Tester {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        QuanLyPhuongTien ql = new QuanLyPhuongTien();
//        PhuongTien pt = new XeMay();
//        PhuongTien pt1 = new XeOto();
//        PhuongTien pt2 = new XeTai();
//        while (true) {
//            System.out.println("=== DANH SACH ===");
//            System.out.println("1. Them phuong tien");
//            System.out.println("2. Hien thi danh sach phuong tien");
//            System.out.println("3. Tim kiem phuong tien");
//            System.out.println("4. Hien thi phuong tien theo loai");
//            System.out.println("5. Thoat");
//            System.out.print("Chon chuc nang: ");
//            int choice = sc.nextInt();
//            sc.nextLine();
//            switch (choice) {
//                case 1:
//                    pt.nhapThongTin(sc);
//                    ql.themPT(pt);
//                    pt1.nhapThongTin(sc);
//                    ql.themPT(pt1);
//                    pt2.nhapThongTin(sc);
//                    ql.themPT(pt2);
//                    break;
//                case 2:
//                    pt.xuatThongTin();
//                    pt1.xuatThongTin();
//                    pt2.xuatThongTin();
//                    break;
//                case 3:
//                    System.out.print("Nhap ma phuong tien ban muon tim: ");
//                    String ma = sc.nextLine();
//                    ql.timPT(ma);
//                    break;
//                case 4:
//                    System.out.println("Chon loai phuong tien muon hien thi: ");
//                    System.out.println("1. Xe May\n2. Xe Oto\n3. Xe Tai");
//                    int chon = sc.nextInt();
//                    if (chon == 1) {
//                        
//                        pt.xuatThongTin();
//                    }
//                    if(chon == 2){
//                        
//                        pt1.xuatThongTin();
//                    }
//                    if(chon == 3){
//                        
//                        pt2.xuatThongTin();
//                    }
//                    break;
//                case 5:
//                    System.out.println("Thoat thanh cong!!!");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("Lua chon khong hop le. Vui long nhap lai");
//            }
//        }
//    }
//}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhuongTien ql = new QuanLyPhuongTien();

        while (true) {
            System.out.println("\n=== DANH SACH ===");
            System.out.println("1. Them phuong tien");
            System.out.println("2. Hien thi danh sach phuong tien");
            System.out.println("3. Tim kiem phuong tien");
            System.out.println("4. Hien thi phuong tien theo loai");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chon loai phuong tien muon them:");
                    System.out.println("1. Xe May\n2. Xe Oto\n3. Xe Tai");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    PhuongTien pt = null;
                    switch (loai) {
                        case 1:
                            pt = new XeMay();
                            break;
                        case 2:
                            pt = new XeOto();
                            break;
                        case 3:
                            pt = new XeTai();
                            break;
                        default:
                            System.out.println("Loai phuong tien khong hop le!");
                            continue;
                    }
                    pt.nhapThongTin(sc);
                    ql.themPT(pt);
                    break;

                case 2:
                    System.out.println("\n=== DANH SACH PHUONG TIEN ===");
                    ql.hienThi();
                    break;

                case 3:
                    System.out.print("Nhap ma phuong tien ban muon tim: ");
                    String ma = sc.nextLine();
                    ql.timPT(ma);
                    break;

                case 4:
                    System.out.println("Chon loai phuong tien muon hien thi:");
                    System.out.println("1. Xe May\n2. Xe Oto\n3. Xe Tai");
                    int loaiHienThi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n=== PHUONG TIEN THEO LOAI ===");
                    for (PhuongTien p : ql.getDs()) {
                        if ((loaiHienThi == 1 && p instanceof XeMay) ||
                            (loaiHienThi == 2 && p instanceof XeOto) ||
                            (loaiHienThi == 3 && p instanceof XeTai)) {
                            p.xuatThongTin();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai!");
            }
        }
    }
}
