
public class NhanVat {
    private String ma, ten;
    private int daDau, hieu, diem;

    public NhanVat() {
    }

    public NhanVat(String ma, String ten, int daDau, int hieu, int diem) {
        this.ma = ma;
        this.ten = ten;
        this.daDau = daDau;
        this.hieu = hieu;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDaDau() {
        return daDau;
    }

    public void setDaDau(int daDau) {
        this.daDau = daDau;
    }

    public int getHieu() {
        return hieu;
    }

    public void setHieu(int hieu) {
        this.hieu = hieu;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
}
