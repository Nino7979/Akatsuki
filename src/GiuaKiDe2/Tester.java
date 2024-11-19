/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiuaKiDe2;

import java.util.*;

/**
 *
 * @author Latitude 7420
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QlHangHoa ql = new QlHangHoa();
        HangHoa hh = new HangMayMac();
        HangHoa hh1 = new HangThucPham();
        HangHoa hh2 = new HangDienMay();
        int choice;
        do {
            System.out.println("1. Nhap hang hoa");
            System.out.println("2. Xuat hang hoa");
            System.out.println("3. Hien thi thong tin hang hoa nhap tu ban phim");
            System.out.println("4. Hang hoa co gia cao nhat");
            System.out.println("5. Thoat");
            System.out.print("Lua chon so: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    hh.nhapHH(sc);
                    ql.themHangHoa(hh);
                    hh1.nhapHH(sc);
                    ql.themHangHoa(hh1);
                    hh2.nhapHH(sc);
                    ql.themHangHoa(hh2);
                    break;
                case 2:
                    System.out.println(hh);
                    System.out.println(hh1);
                    System.out.println(hh2);
                    break;
                case 3:
                    System.out.println("Nhap hang san xuat: ");
                    System.out.println("1. HangDienMay");
                    System.out.println("2. HangMayMac");
                    System.out.println("3. HangThucPham");
                    int hsx = sc.nextInt();
                    sc.nextLine();
                    if (hsx == 1) {
                        hh2.hienThi();
                    } else if (hsx == 2) {
                        hh.hienThi();
                    } else {
                        hh1.hienThi();
                    }
                    break;
                case 4:
                    System.out.println("=== HANG HOA GIA CAO NHAT ===");
                    ql.timHangHoaGiaCaoNhat();
                    break;
                case 5:
                    System.out.println("Thoat thanh cong!!!");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
