/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        while(true){
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Hien thi danh sach sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    Student sv = new Student();
                    sv.nhapSV(sc);
                    sm.themSV(sv);
                    break;
                case 2:
                    System.out.print("Nhap ma sinh vien ban muon xoa: ");
                    String maSV = sc.nextLine();
                    sm.xoaSV(maSV);
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien ban muon tim: ");
                    String ma = sc.nextLine();
                    sm.timSV(ma);
                    break;
                case 4:
                    System.out.println("=== DANH SACH SINH VIEN ===");
                    sm.hienThi();
                    break;
                case 5:
                    System.out.println("Thoat thanh cong!!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
