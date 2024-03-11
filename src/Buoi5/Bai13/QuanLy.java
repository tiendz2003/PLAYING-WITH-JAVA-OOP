package Buoi5.Bai13;

class QuanLy implements CanBo {
    private double heSoLuong;
    private double heSoPhuCap;

    public QuanLy(double heSoLuong, double heSoPhuCap) {
        this.heSoLuong = heSoLuong;
        this.heSoPhuCap = heSoPhuCap;
    }

    public double tinhLuong() {
        return (heSoLuong + heSoPhuCap) * 1350000; // Tính lương của quản lý
    }

    public String thongTin() {
        return "Quản lý - Hệ số lương: " + heSoLuong + ", Hệ số phụ cấp: " + heSoPhuCap;
    }
}