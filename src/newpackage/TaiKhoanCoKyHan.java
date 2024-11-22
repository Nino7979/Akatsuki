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
        return today.compareTo(ngayDaoHan) >= 0; 
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
        System.out.println("Nhập thông tin KyHan (1. MOT_TUAN, 2. MOT_THANG, 3. MOT_NAM):");
        int kyHan = sc.nextInt();
        sc.nextLine();
        switch (kyHan) {
            case 1:
                this.kyHan = KyHan.MOT_TUAN;
                break;
            case 2:
                this.kyHan = KyHan.MOT_THANG;
                break;
            case 3:
                this.kyHan = KyHan.MOT_NAM;
                break;
            default:
                System.out.println("Kỳ hạn không hợp lệ. Mặc định là 'MOT_TUAN'.");
                this.kyHan = KyHan.MOT_TUAN;
        }
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
    public double tienLai() {
        if (ktDaoHan()) {
            double laiSuat = 0;
            switch (kyHan) {
                case MOT_TUAN:
                    laiSuat = 0.005;
                    break;
                case MOT_THANG:
                    laiSuat = 0.045;
                    break;
                case MOT_NAM:
                    laiSuat = 0.068;
                    break;
            }
            double tienLai = getSoTien() * laiSuat;
            this.soTien += tienLai;
            return tienLai;
        } else {
            System.out.println("Chưa đến ngày đáo hạn.");
            return 0;
        }
    }
    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + "\nKy han: " + this.kyHan + "\nNgay dao han: " + df.format(ngayDaoHan);
    }
}
