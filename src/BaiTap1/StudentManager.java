/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.*;

/**
 *
 * @author Latitude 7420
 */
public class StudentManager {

    private List<Student> ds = new ArrayList<>();

    public List<Student> getDs() {
        return ds;
    }

    public void setDs(List<Student> ds) {
        this.ds = ds;
    }

    public void themSV(Student sv) {
        this.ds.add(sv);
        System.out.println("Đã thêm sinh viên thành công");
    }

    public void xoaSV(String id) {
        boolean xoa = ds.removeIf(s -> s.getId().equals(id));
        if(xoa){
            System.out.println("Đã xóa sinh viên thành công");
        }
        else { 
        System.out.println("Khong tim thay sinh vien");
        }
    }

    public void timSV(String id) {
        boolean found = true;
        for (Student sv : ds) {
            if (sv.getId().equals(id)) {
                sv.display_info();
                found = true;
                break;
            }
        }
        if(!found)
        System.out.println("Khong tim thay sinh vien");
    }

    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng");
        } else {
            for (Student sv : ds) {
                sv.display_info();
            }
        }
    }
}
