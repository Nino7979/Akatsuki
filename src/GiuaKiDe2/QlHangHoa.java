/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiuaKiDe2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Latitude 7420
 */
public class QlHangHoa {

    private List<HangHoa> ds = new ArrayList<>();

    public QlHangHoa() {
    }

    public List<HangHoa> getDs() {
        return ds;
    }

    public void setDs(List<HangHoa> ds) {
        this.ds = ds;
    }

    public void themHangHoa(HangHoa hangHoa) {
        ds.add(hangHoa);
    }

    public void timHangHoaGiaCaoNhat() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách hàng hóa rỗng.");
            return;
        }

        HangHoa hangHoaGiaCaoNhat = ds.get(0);
        for (HangHoa hh : ds) {
            if (hh.getGia() > hangHoaGiaCaoNhat.getGia()) {
                hangHoaGiaCaoNhat = hh;
            }
        }
        System.out.println("Ten hang: " + hangHoaGiaCaoNhat.getTenHang());
        System.out.println("Hang san xuat: " + hangHoaGiaCaoNhat.getHangSX());
    }
}
