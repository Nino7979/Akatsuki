import java.util.Scanner;

public class MainDiem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập dữ liệu cho điểm 1
        System.out.print("Nhập hoành độ và tung độ của điểm 1: ");
        Diem d1 = new Diem(sc.nextDouble(), sc.nextDouble());  // Tạo đối tượng Diem thứ nhất
        
        // Nhập dữ liệu cho điểm 2
        System.out.print("Nhập hoành độ và tung độ của điểm 2: ");
        Diem d2 = new Diem(sc.nextDouble(), sc.nextDouble());  // Tạo đối tượng Diem thứ hai

        // Hiển thị thông tin các điểm
        System.out.print("Điểm 1: ");
        d1.hienThi();

        System.out.print("Điểm 2: ");
        d2.hienThi();

        // Tính và hiển thị khoảng cách giữa hai điểm
        double khoangCach = d1.tinhKhoangCach(d2);
        System.out.println("Khoảng cách giữa hai điểm: " + khoangCach);
    }
}
