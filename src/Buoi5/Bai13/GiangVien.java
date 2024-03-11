package Buoi5.Bai13;

class GiangVien implements CanBo {
    private double heSoLuong;
    private double phuCap;

    public GiangVien(double heSoLuong, double phuCap) {
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public double tinhLuong() {
        return (heSoLuong * 1350000) + (0.2 * heSoLuong * 1350000); // Tính lương của giảng viên
    }

    public String thongTin() {
        return "Giảng viên - Hệ số lương: " + heSoLuong + ", Phụ cấp: " + phuCap;
    }
}