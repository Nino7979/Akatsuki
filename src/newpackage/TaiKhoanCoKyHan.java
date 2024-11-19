package newpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TaiKhoanCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private Date ngayDaoHan; 

    public TaiKhoanCoKyHan(String soTaiKhoan, String tenTaiKhoan, String diaChi, String email, double soTien, KyHan kh, Date ndh) {
        super(soTaiKhoan, tenTaiKhoan, diaChi, email, soTien);
        this.kyHan = kh;
        this.ngayDaoHan = ndh;
    }

    public TaiKhoanCoKyHan() {
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Date getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Date ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    enum KyHan {
        MOT_TUAN,
        MOT_THANG,
        MOT_NAM;

        public static KyHan fromInt(int loaiKyHan) {
            switch (loaiKyHan) {
                case 1:
                    return MOT_NAM;
                case 2:
                    return MOT_THANG;
                case 3:
                    return MOT_TUAN;
                default:
                    throw new IllegalArgumentException("Loai ky han khong hop le.");
            }
        }
    }

    public void nopTien(double soTien) {
        if (!ktDaoHan()) {
            System.out.println("Chưa đến ngày đáo hạn. Không thể nộp tiền.");
        } else {
            super.nopTien(soTien);  
        }
    }

    public void rutTien(double soTien) {
        if (!ktDaoHan()) {
            System.out.println("Chưa đến ngày đáo hạn. Không thể rút tiền.");
        } else {
            super.rutTien(soTien);  
        }
    }

    public boolean ktDaoHan() {
        Date today = new Date(); // Ngày hiện tại
        return !today.before(ngayDaoHan); 
    }

    public void capNhatDaoHan() {
        if (this.ktDaoHan()) {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(ngayDaoHan);
            calendar.add(Calendar.DAY_OF_YEAR, laySoNgay(calendar));
            this.ngayDaoHan = calendar.getTime(); 
        }
    }

    private int laySoNgay(GregorianCalendar d) {
        switch (this.kyHan) {
            case MOT_NAM:
                return d.getActualMaximum(Calendar.DAY_OF_YEAR);
            case MOT_THANG:
                return d.getActualMaximum(Calendar.DAY_OF_MONTH);
            case MOT_TUAN:
                return 7; 
            default:
                return 0;
        }
    }

    public void nhapTK(Scanner sc) {
        super.nhapTK(sc);
        System.out.println("Nhap thong tin KyHan:");
        System.out.println("1. Ky han 1 nam\n2. Ky han 1 thang\n3. Ky han 1 tuan");
        int loaiKyHan = sc.nextInt();
        sc.nextLine(); 
        this.kyHan = KyHan.fromInt(loaiKyHan);
        System.out.println("Nhap ngay dao han (format: yyyy mm dd):");
        String ngayDh = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayDaoHan = df.parse(ngayDh);
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ. Đặt ngày đáo hạn mặc định là hôm nay.");
            this.ngayDaoHan = new Date();
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + "\nKy han: " + this.kyHan + "\nNgay dao han: " + df.format(ngayDaoHan);
    }
}
