public class Diem {
    // Thuộc tính hoành độ và tung độ
    private double x;
    private double y;

    // Phương thức khởi tạo với hai tham số hoành độ và tung độ
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho hoành độ
    public double getX() {
        return x;
    }

    // Getter cho tung độ
    public double getY() {
        return y;
    }

    // Setter cho hoành độ
    public void setX(double x) {
        this.x = x;
    }

    // Setter cho tung độ
    public void setY(double y) {
        this.y = y;
    }

    // Phương thức hiển thị thông tin điểm
    public void hienThi() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Phương thức tính khoảng cách giữa hai điểm
    public double tinhKhoangCach(Diem d2) {
        return Math.sqrt(Math.pow(this.x - d2.getX(), 2) + Math.pow(this.y - d2.getY(), 2));
    }  
}

