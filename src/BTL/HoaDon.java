package BTL;

import java.util.List;

public class HoaDon {
    private int maHoaDon;
    private String ngayLap;
    private List<NhanVien> dsnv;

    public HoaDon(int maHoaDon, String ngayLap,List<NhanVien> dsnv) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.dsnv = dsnv;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public List<NhanVien> getDsnv() {
        return dsnv;
    }

    public void setDsnv(List<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }
    public void xuatThongTinHoaDon() {
        System.out.println("Thông tin hóa đơn");
        System.out.println("Mã hóa đơn: " + maHoaDon);
        System.out.println("Ngày lập hóa đơn: " + ngayLap);
        System.out.println("Danh sách nhân viên:");

        long tongLuong = 0;
        int maxNameLength = 0;

        // Tìm độ dài lớn nhất của tên nhân viên
        for (NhanVien nv : dsnv) {
            nv.tinhLuong(); // Tính lương cho từng nhân viên trước khi xuất thông tin
            if (nv.toString().length() > maxNameLength) {
                maxNameLength = nv.toString().length();
            }
            tongLuong += nv.luongNhanVien;
        }

        // Xuất thông tin của từng nhân viên
        for (NhanVien nv : dsnv) {
            String formattedName = String.format("%-" + maxNameLength + "s", nv);
            System.out.print("- " + formattedName);
            // Thêm khoảng trắng để các hàng có độ dài như nhau
            for (int i = 0; i < maxNameLength - nv.toString().length(); i++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Tổng lương của các nhân viên: " + tongLuong + " VND");
    }

}

