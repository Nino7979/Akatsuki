/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.*;

/**
 *
 * @author Latitude 7420
 */
public class QuanLyPhuongTien {

    private List<PhuongTien> ds = new ArrayList<>();

    public List<PhuongTien> getDs() {
        return ds;
    }

    public void setDs(List<PhuongTien> ds) {
        this.ds = ds;
    }

    public void themPT(PhuongTien pt) {
        this.ds.add(pt);
        System.out.println("Them phuong tien thanh cong");
    }

    public void hienThi() {
        for (PhuongTien pt : ds) {
            pt.xuatThongTin();
        }
    }

    public void timPT(String id) {
        boolean found = false;
        for (PhuongTien pt : ds) {
            if (pt.getId().equals(id)) {
                pt.xuatThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay phuong tien");
        }
    }
}
