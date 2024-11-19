/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Latitude 7420
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QlNhanVien ql = new QlNhanVien();
        NhanVien nv = new NhanVien("Nguyen Van A", "1234", "Ha Noi", "Nam", "012345");
        NhanVien nv2 = new NhanVienA("Nguyen Van B", "0495", "Ha Noi", "Nu", "182733");
        NhanVien nv3 = new NhanVienB("Nguyen Van C", "2034", "Ha Noi", "Nam", "19283");
        NhanVien nv4 = new NhanVienC("Nguyen Van D", "2732", "Ha Noi", "Nu", "405953", 500000);

        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. Tra cuu nhan vien");
            System.out.println("4. Hien thi danh sach nhan vien");
            System.out.println("5. Tinh luong nhan vien");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ql.themNV(nv);
                    ql.themNV(nv2);
                    ql.themNV(nv3);
                    ql.themNV(nv4);
                            
                    break;
                case 2:
                    ql.xoaNhanVien(nv);
                    break;
                case 3:
                    System.out.println("Nhap tu khoa can tra cuu (ten hoac cmnd): ");
                    String tuKhoa = sc.nextLine();
                    System.out.println(ql.traCuu(tuKhoa));
                    break;
                case 4:
                    System.out.println(ql);
                    break;
                case 5:
                    ql.tinhLuong(sc);
                    break;
                case 6:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong khop le");
            }
        } while (choice != 6);
        sc.close();
    }
}
