/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DsSanPham ds = new DsSanPham();
        int choice;
        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Them san pham");
            System.out.println("2. Xoa san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Sap xep san pham");
            System.out.println("6. Xem danh sach san pham");
            System.out.println("7. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Nhap san pham can them:");
                    System.out.println("1. Them Sach");
                    System.out.println("2. Them Bang Dia");
                    System.out.print("Chon loai san pham: ");
                    int loaiSP = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (loaiSP == 1) {
                        // Thêm sách
                        Sach sach = new Sach();
                        sach.nhapSP(sc);
                        ds.themSanPham(sach);
                        System.out.println("Them sach thanh cong!");
                    } else if (loaiSP == 2) {
                        // Thêm đĩa
                        BangDia bd = new BangDia();
                        bd.nhapSP(sc);
                        ds.themSanPham(bd);
                        System.out.println("Them bang dia thanh cong!");
                    } else {
                        System.out.println("Lua chon khong hop le.");
                    }
                    break;

                case 2:
                    System.out.print("Nhap ma hoac ten san pham de xoa: ");
                    String tenHoacMaSPToDelete = sc.nextLine();

                    // Thử xóa theo mã sản phẩm
                    if (ds.xoaSanPham(tenHoacMaSPToDelete)) {
                        System.out.println("Xoa san pham thanh cong (theo ma).");
                    } else {
                        // Nếu không xóa theo mã, thử xóa theo tên
                        boolean found = false;
                        for (SanPham sp : ds.getDs()) { // Giả sử bạn có phương thức getDs() để lấy danh sách sản phẩm
                            if (sp.getTenSP().equalsIgnoreCase(tenHoacMaSPToDelete)) {
                                ds.xoaSanPham(sp);
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            System.out.println("Xoa san pham thanh cong (theo ten).");
                        } else {
                            System.out.println("Khong tim thay san pham de xoa.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma san pham de cap nhat: ");
                    String maSPToUpdate = sc.nextLine();
                    System.out.print("Nhap ten san pham moi (hoac nhan Enter de bo qua): ");
                    String tenMoi = sc.nextLine();
                    System.out.print("Nhap mo ta moi (hoac nhan Enter de bo qua): ");
                    String moTaMoi = sc.nextLine();
                    System.out.print("Nhap gia ban moi (hoac nhan Enter de bo qua): ");
                    String giaBanInput = sc.nextLine();
                    double giaBanMoi = -1;
                    if (!giaBanInput.isEmpty()) {
                        giaBanMoi = Double.parseDouble(giaBanInput);
                    }
                    if (ds.capNhatSanPham(maSPToUpdate, tenMoi.isEmpty() ? null : tenMoi,
                            moTaMoi.isEmpty() ? null : moTaMoi, giaBanMoi < 0 ? -1 : giaBanMoi)) {
                        System.out.println("Cap nhat san pham thanh cong.");
                    } else {
                        System.out.println("Khong tim thay san pham de cap nhat.");
                    }
                    break;

                case 4:
                    System.out.println("Tim kiem san pham:");
                    System.out.print("Nhap tu khoa (maSP hoac tenSP): ");
                    String tuKhoa = sc.nextLine();
                    List<SanPham> ketQuaTimKiem = ds.timKiem(tuKhoa);
                    if (ketQuaTimKiem.isEmpty()) {
                        System.out.println("Khong tim thay san pham.");
                    } else {
                        for (SanPham sp : ketQuaTimKiem) {
                            System.out.println(sp);
                        }
                    }
                    break;

                case 5:
                    ds.sxGiamDanSp();
                    System.out.println("Da sap xep san pham giam dan theo gia.");
                    break;

                case 6:
                    System.out.println("Danh sach san pham:");
                    if (ds.isEmpty()) {
                        System.out.println("Khong co san pham nao trong danh sach.");
                    } else {
                        ds.hienThi(); // Gọi phương thức hiển thị danh sách sản phẩm
                    }
                    break;

                case 7:
                    System.out.println("Thoat.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }

        } while (choice != 7);

        sc.close();
    }
}
