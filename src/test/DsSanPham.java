package test;

import java.util.*;

public class DsSanPham {

    private List<SanPham> ds = new ArrayList<>();

    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

    public boolean themSanPham(SanPham s) {
        return this.ds.add(s);
    }

    public boolean isEmpty() {
        return ds.isEmpty(); // Trả về true nếu danh sách trống
    }

    public boolean xoaSanPham(SanPham s) {
        return this.ds.remove(s);
    }

    public boolean xoaSanPham(String maSp) {
        return this.ds.removeIf(s -> s.getMaSP().equals(maSp));
    }

    public boolean capNhatSanPham(String maSP, String ten, String moTa,
            double gia) {
        for (SanPham sp : ds) {
            if (sp.getMaSP().equals(maSP)) {
                if (ten != null && !ten.isEmpty()) {
                    sp.setTenSP(ten);
                }
                if (moTa != null && !moTa.isEmpty()) {
                    sp.setMoTa(moTa);
                }
                if (gia >= 0) {
                    sp.setGiaBan(gia);
                }
                return true;
            }
        }
        return false; // Không tìm thấy sản phẩm
    }

    public List<SanPham> timKiem(String tuKhoa) {
        List<SanPham> ketQua = new ArrayList<>();
        for (SanPham sp : ds) {
            if (sp.getMaSP().equals(tuKhoa)
                    || sp.getTenSP().equalsIgnoreCase(tuKhoa)) {
                ketQua.add(sp);
            }
        }
        return ketQua;
    }

    public void sxGiamDanSp() {
        this.ds.sort((s1, s2) -> {
            double gia1 = s1.getGiaBan();
            double gia2 = s2.getGiaBan();
            return -(gia1 > gia2 ? 1 : (gia1 < gia2 ? -1 : 0));
        });
    }

    public void hienThi() {
        for (SanPham s : ds) {
            System.out.println(s);
        }
    }

}
