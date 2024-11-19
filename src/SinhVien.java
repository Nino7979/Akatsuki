
public class SinhVien {

    private String id;
    private String hoTen;
    private int luongcoBan, ngayCong;
    private String chucVu;

    public SinhVien(String id, String hoTen, int luongcoBan, int ngayCong, String chucVu) {
        this.id = id;
        this.hoTen = hoTen;
        this.luongcoBan = luongcoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    public int getLuong(){
    return this.luongcoBan * this.ngayCong;
}
    public int getThuong(){
        int luong = this.getLuong();
        if(this.ngayCong >= 25){
            return (int)(0.2 * luong);
    }
        else if(this.ngayCong >= 22){
            return (int)(0.1 * luong);
        }
        return 0;
}
    public int getphuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        else if(this.chucVu.equals("PGD")) return 200000;
        else if(this.chucVu.equals("TP")) return 180000;
        return 150000;
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.getLuong() + " " + 
          this.getThuong() + " " + this.getphuCap() + " " + (this.getLuong() 
            + this.getThuong() + this.getphuCap());
    }
    

}
