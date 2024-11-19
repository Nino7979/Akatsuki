
package KeThua;

public class NhanVienA extends NhanVien {
    
    public NhanVienA(String hoTen, String cmnd, String queQuan, String gioiTinh, String dienThoai) {
        super(hoTen, cmnd, queQuan, gioiTinh, dienThoai);
    }
    public NhanVienA(){
        
    }
    public double tinhLuong(int soNgayLam){
        return super.tinhLuong(soNgayLam) * 1.2;
    }
    
}
