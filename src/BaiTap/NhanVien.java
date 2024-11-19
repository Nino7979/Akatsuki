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
public class NhanVien implements Cloneable {
    private static int count = 1;
    private String id;
    private String name;
    private BoPhan bophan;

    public NhanVien(String name, BoPhan bophan) {
        this.id = "NV" + String.format("%05d", count++);
        this.name = name;
        this.bophan = bophan;
    }

    public BoPhan getBophan() {
        return bophan;
    }

    public void setBophan(BoPhan bophan) {
        this.bophan = bophan;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void hienThi(){
        System.out.println(id + "-" + name + "-" + bophan);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        NhanVien cloned = (NhanVien) super.clone();
        cloned.id = "NV" + String.format("%05d", count++); // Tạo id mới cho đối tượng clone
        cloned.bophan = new BoPhan(this.bophan.getName()); // Tạo đối tượng BoPhan mới cho clone
        return cloned;
    }
}
