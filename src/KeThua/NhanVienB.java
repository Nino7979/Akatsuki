/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

/**
 *
 * @author Latitude 7420
 */
public class NhanVienB extends NhanVien{

    public NhanVienB(String hoTen, String cmnd, String queQuan, String gioiTinh, String dienThoai) {
        super(hoTen, cmnd, queQuan, gioiTinh, dienThoai);
    }
    public double tinhLuong(int soNgayLam){
        return super.tinhLuong(soNgayLam) * 1.5;
    }
}
