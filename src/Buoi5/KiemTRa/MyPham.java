package Buoi5.KiemTRa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyPham {
    private int idMyPham;
    private String tenMyPham;
    private String moTa;
    private int sl;
    private double donGia;
    private String loaiMyPham;
    private String ngayHetHan;

    public MyPham(int idMyPham, String tenMyPham, String moTa, int sl, double donGia, String loaiMyPham, String ngayHetHan) {
        this.idMyPham = idMyPham;
        this.tenMyPham = tenMyPham;
        this.moTa = moTa;
        this.sl = sl;
        this.donGia = donGia;
        this.loaiMyPham = loaiMyPham;
        this.ngayHetHan = ngayHetHan;
    }

    public int getIdMyPham() {
        return idMyPham;
    }

    public void setIdMyPham(int idMyPham) {
        this.idMyPham = idMyPham;
    }

    public String getTenMyPham() {
        return tenMyPham;
    }

    public void setTenMyPham(String tenMyPham) {
        this.tenMyPham = tenMyPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getLoaiMyPham() {
        return loaiMyPham;
    }

    public void setLoaiMyPham(String loaiMyPham) {
        this.loaiMyPham = loaiMyPham;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "MyPham{" +
                "idMyPham=" + idMyPham +
                ", tenMyPham='" + tenMyPham + '\'' +
                ", moTa='" + moTa + '\'' +
                ", sl=" + sl +
                ", donGia=" + donGia +
                ", loaiMyPham='" + loaiMyPham + '\'' +
                ", ngayHetHan='" + ngayHetHan + '\'' +
                '}';
    }
    public boolean daHetHan() {
        // Lấy ngày hiện tại
        LocalDate ngayHienTai = LocalDate.now();

        // Chuyển đổi ngày hết hạn từ chuỗi sang LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayHetHan = LocalDate.parse(this.ngayHetHan, formatter);

        // So sánh ngày hiện tại với ngày hết hạn
        return ngayHienTai.isAfter(ngayHetHan);
    }
}
