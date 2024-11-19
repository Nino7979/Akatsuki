/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author Latitude 7420
 */
public class Tester {

    public static void main(String[] args) {
        try {
            BoPhan b1 = new BoPhan("Ban hang");
            NhanVien n1 = new NhanVien("A", b1);
            NhanVien n2 = (NhanVien) n1.clone();
            n2.getBophan().setName("Marketing");
            n1.hienThi();
            n2.hienThi();
        } catch(CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
