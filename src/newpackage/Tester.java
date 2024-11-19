/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        while (true) {
            System.out.println("=== DANH SACH MENU ===");
            System.out.println("1. Nhap thong tin tai khoan");
            System.out.println("2. Xem thong tin tai khoan");
            System.out.println("3. Tra cuu tai khoan (theo so tk hoac ten tk)");
            System.out.println("4. Tinh tien lai");
            System.out.println("5. Nop tien vao tai khoan");
            System.out.println("6. Rut tien ra khoi tai khoan");
            System.out.println("7. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Chon loai tai khoan muon nhap");
                    System.out.println("1. Tai khoan\n2. Tai khoan co ky han");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    TaiKhoan tk = null;
                    switch (loai) {
                        case 1:
                            tk = new TaiKhoan();
                            break;
                        case 2:
                            tk = new TaiKhoanCoKyHan();
                    }
                    tk.nhapTK(sc);
                    ql.themTaiKhoan(tk);
                    break;

                case 2:
                    System.out.println("\n=== DANH SACH TAI KHOAN ===");
                    System.out.println(ql);
                    break;
                case 3:
                    System.out.println("Chọn phương thức tra cứu:");
                    System.out.println("1. Theo số tài khoản");
                    System.out.println("2. Theo tên tài khoản");
                    int traCuuLoai = sc.nextInt();
                    sc.nextLine();

                    if (traCuuLoai == 1) {
                        System.out.print("Nhập số tài khoản cần tra cứu: ");
                        String soTaiKhoan = sc.nextLine();
                        TaiKhoan tkTimDuoc = ql.traCuu1(soTaiKhoan);
                        if (tkTimDuoc != null) {
                            System.out.println("Thông tin tài khoản tìm được:");
                            System.out.println(tkTimDuoc);
                        }
                    } else if (traCuuLoai == 2) {
                        System.out.print("Nhập tên tài khoản cần tra cứu: ");
                        String tuKhoa = sc.nextLine();
                        List<TaiKhoan> danhSachTimDuoc = ql.traCuu2(tuKhoa);
                        if (!danhSachTimDuoc.isEmpty()) {
                            System.out.println("Danh sách tài khoản tìm được:");
                            for (TaiKhoan tk2 : danhSachTimDuoc) {
                                System.out.println(tk2);
                                System.out.println("-------------------");
                            }
                        } else {
                            System.out.println("Không tìm thấy tài khoản nào.");
                        }
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập số tài khoản cần tính lãi: ");
                    String soTaiKhoanTinhLai = sc.nextLine();
                    TaiKhoan tkTinhLai = ql.traCuu1(soTaiKhoanTinhLai);

                    if (tkTinhLai != null) {
                        System.out.println("Đang tính tiền lãi...");
                        double tienLai = tkTinhLai.tinhTienLai();
                        if (tienLai > 0) {
                            System.out.println("Tiền lãi được tính: " + tienLai);
                            System.out.println("Số dư mới: " + tkTinhLai.getSoTien());
                        } else {
                            System.out.println("Không đủ điều kiện để tính lãi.");
                        }
                    } else {
                        System.out.println("Không tìm thấy tài khoản với số tài khoản đã nhập.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập số tài khoản cần nộp tiền: ");
                    String soTaiKhoanNopTien = sc.nextLine();
                    TaiKhoan tkNopTien = ql.traCuu1(soTaiKhoanNopTien);

                    if (tkNopTien != null) {
                        if (tkNopTien instanceof TaiKhoanCoKyHan && !((TaiKhoanCoKyHan) tkNopTien).ktDaoHan()) {
                            System.out.println("Chưa đến ngày đáo hạn. Không thể nộp tiền.");
                        } else {
                            System.out.print("Nhập số tiền muốn nộp: ");
                            double soTienNop = sc.nextDouble();
                            sc.nextLine(); // Đọc dòng trống
                            tkNopTien.nopTien(soTienNop);
                            System.out.println("Đã nộp tiền thành công!");
                            System.out.println("Số dư hiện tại: " + tkNopTien.getSoTien());
                        }
                    } else {
                        System.out.println("Không tìm thấy tài khoản với số tài khoản đã nhập.");
                    }
                    break;

                case 6:
                    System.out.print("Nhập số tài khoản cần rút tiền: ");
                    String soTaiKhoanRutTien = sc.nextLine();
                    TaiKhoan tkRutTien = ql.traCuu1(soTaiKhoanRutTien);

                    if (tkRutTien != null) {
                        if (tkRutTien instanceof TaiKhoanCoKyHan && !((TaiKhoanCoKyHan) tkRutTien).ktDaoHan()) {
                            System.out.println("Chưa đến ngày đáo hạn. Không thể rút tiền.");
                        } else {
                            System.out.print("Nhập số tiền muốn rút: ");
                            double soTienRut = sc.nextDouble();
                            sc.nextLine(); // Đọc dòng trống
                            tkRutTien.rutTien(soTienRut);
                            System.out.println("Đã rút tiền thành công!");
                            System.out.println("Số dư hiện tại: " + tkRutTien.getSoTien());
                        }
                    } else {
                        System.out.println("Không tìm thấy tài khoản với số tài khoản đã nhập.");
                    }
                    break;

                case 7:
                    System.out.println("Thoat chuong trinh!!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Chọn lại");

            }
        }
    }
}
