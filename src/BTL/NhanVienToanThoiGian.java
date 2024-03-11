package BTL;

public class NhanVienToanThoiGian extends NhanVien {
    private int idnv;
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static long LUONG_NHAN_VIEN_LA_SEP = 20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static long LUONG_LAM_THEM = 800000;

    public NhanVienToanThoiGian() {
        super();
    }

    public NhanVienToanThoiGian(int idnv,int soNgayLamThem, String loaiNhanVien) {
        super();
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
        this.idnv = idnv;
    }

    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }

    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public void nhapThongTin() {
        super.nhapThongTin();

        System.out.print("Nhập số ngày làm thêm: ");
        soNgayLamThem = scanner.nextInt();
        System.out.print("Nhập loại nhân viên (1 - bình thường, 2 - sếp): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                loaiNhanVien = "Nhân viên bình thường";
                System.out.println("Nhap ma nhan vien : ");
                idnv = scanner.nextInt();
                scanner.nextLine();
                break;
            case 2:
                loaiNhanVien = "Sếp";
                break;
            default:
                System.out.println("Nhập loại nhân viên không đúng!");
                break;
        }
    }

    @Override
    public void tinhLuong() {
        if (loaiNhanVien.equals("Nhân viên bình thường")) {
            luongNhanVien = LUONG_NHAN_VIEN_BINH_THUONG + this.soNgayLamThem * LUONG_LAM_THEM;
        } else if (loaiNhanVien.equals("Sếp")) {
            luongNhanVien = LUONG_NHAN_VIEN_LA_SEP + this.soNgayLamThem * LUONG_LAM_THEM;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", loại nhân viên: " + this.loaiNhanVien +
                ", số ngày làm thêm: " + this.soNgayLamThem;
    }
}