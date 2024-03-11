package BTL;

public class NhanVienThoiVu extends NhanVien {
    private int idnvtv;
    private int gioLamViec;
    private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO = 100000;

    public NhanVienThoiVu() {
        super();
    }

    public NhanVienThoiVu(int idnvtv,int gioLamViec) {
        super();
        this.gioLamViec = gioLamViec;
        this.idnvtv=idnvtv;
    }

    public int getIdnvtv() {
        return idnvtv;
    }

    public void setIdnvtv(int idnvtv) {
        this.idnvtv = idnvtv;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap ma nhan vien: ");
        idnvtv = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập số giờ làm việc: ");
        gioLamViec = scanner.nextInt();
    }

    @Override
    public void tinhLuong() {
        luongNhanVien = LUONG_NHAN_VIEN_THOI_VU_MOT_GIO * this.gioLamViec;
    }

    @Override
    public String toString() {
        return super.toString() + ", giờ làm việc: " + this.gioLamViec;
    }

}