package Buoi5.Bai13;

class ChuyenVien implements CanBo {
    private double heSoLuong;

    public ChuyenVien(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return heSoLuong * 1350000;
    }

    public String thongTin() {
        return "Chuyên viên - Hệ số lương: " + heSoLuong;
    }
}
