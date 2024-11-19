
public class ThiSinh {
    private String ma, hoTen;
    private double toan, ly, hoa;

    public ThiSinh(String ma, String hoTen, double toan, double ly, double hoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double gettongDiem(){
        double tongDiem = this.toan + this.ly + this.hoa;
        String khuVuc = this.ma.substring(0, 3);
        if(khuVuc.equals("KV1")) return tongDiem + 0.5;
        else if(khuVuc.equals("KV2")) return tongDiem + 1;
        return tongDiem + 2.5;
    }
    public String toString(){
        String result = "";
        if(this.gettongDiem() >= 24) result = "TRUNG TUYEN";
        else result = "TRUOT";
         if(this.gettongDiem() == (int)this.gettongDiem()){
             return this.ma + " " + this.hoTen + " " + this.ma.charAt(2) + " " + (int)this.gettongDiem() + " " + result;
         }
         else return this.ma + " " + this.hoTen + " " + this.ma.charAt(2) + " " + String.format("%.1f", this.gettongDiem()) + " " + result;
    }
}
