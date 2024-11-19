import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class HangHoa {
    protected String tenHang;
    protected String hangSX;
    protected double gia;

    public HangHoa(String tenHang, String hangSX, double gia) {
        this.tenHang = tenHang;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Tên hàng: " + tenHang + ", Hãng sản xuất: " + hangSX + ", Giá: " + gia;
    }
}

class HangDienMay extends HangHoa {
    private int thoiGianBH;

    public HangDienMay(String tenHang, String hangSX, double gia, int thoiGianBH) {
        super(tenHang, hangSX, gia);
        this.thoiGianBH = thoiGianBH;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thời gian bảo hành: " + thoiGianBH + " tháng";
    }
}

class HangMayMac extends HangHoa {
    private String nguyenLieu;
    private int kichCo;

    public HangMayMac(String tenHang, String hangSX, double gia, String nguyenLieu, int kichCo) {
        super(tenHang, hangSX, gia);
        this.nguyenLieu = nguyenLieu;
        this.kichCo = kichCo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nguyên liệu: " + nguyenLieu + ", Kích cỡ: " + kichCo;
    }
}

class HangThucPham extends HangHoa {
    private String ngaySX;
    private String hanSD;

    public HangThucPham(String tenHang, String hangSX, double gia, String ngaySX, String hanSD) {
        super(tenHang, hangSX, gia);
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngày sản xuất: " + ngaySX + ", Hạn sử dụng: " + hanSD;
    }
}

public class QuanLyHangHoa {
    private List<HangHoa> danhSachHangHoa = new ArrayList<>();

    public void nhapHangHoa(HangHoa hangHoa) {
        danhSachHangHoa.add(hangHoa);
    }

    public void xuatDanhSach() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            System.out.println(hangHoa);
        }
    }

    public void hienThiTheoHangSX(String hangSX) {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa.hangSX.equals(hangSX)) {
                System.out.println(hangHoa);
            }
        }
    }

    public void hienThiTheoGiaTangDan() {
        Collections.sort(danhSachHangHoa, Comparator.comparingDouble(h -> h.gia));
        xuatDanhSach();
    }

    public void hienThiMatHangGiaCaoNhat() {
        HangHoa maxGiaHangHoa = Collections.max(danhSachHangHoa, Comparator.comparingDouble(h -> h.gia));
        System.out.println("Mặt hàng có giá cao nhất: " + maxGiaHangHoa);
    }

    public static void main(String[] args) {
        QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa();
        Scanner scanner = new Scanner(System.in);

        // Thêm ví dụ hàng hóa vào danh sách
        quanLyHangHoa.nhapHangHoa(new HangDienMay("Tủ lạnh", "Samsung", 15000, 24));
        quanLyHangHoa.nhapHangHoa(new HangMayMac("Áo thun", "Nike", 500, "Cotton", 42));
        quanLyHangHoa.nhapHangHoa(new HangThucPham("Sữa tươi", "Vinamilk", 20, "2024-01-01", "2024-06-01"));

        // Hiển thị theo hãng sản xuất
        System.out.println("Nhập hãng sản xuất để tìm: ");
        String hangSX = scanner.nextLine();
        quanLyHangHoa.hienThiTheoHangSX(hangSX);

        // Hiển thị mặt hàng theo giá tăng dần
        System.out.println("Danh sách mặt hàng theo giá tăng dần:");
        quanLyHangHoa.hienThiTheoGiaTangDan();

        // Hiển thị mặt hàng có giá cao nhất
        System.out.println("Mặt hàng có giá cao nhất:");
        quanLyHangHoa.hienThiMatHangGiaCaoNhat();

        scanner.close();
    }
}
