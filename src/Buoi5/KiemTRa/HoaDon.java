package Buoi5.KiemTRa;

import java.util.List;

public class HoaDon {
    private int idHd;
    private String ngayLap;
    private KhachHang khachHang;
    private List<MyPham> dsMyPham;
    private double tongTien;

    public HoaDon(int idHd, String ngayLap, KhachHang khachHang, List<MyPham> dsMyPham) {
        this.idHd = idHd;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.dsMyPham = dsMyPham;
        this.tongTien = tinhTongTien();
    }
    private double tinhTongTien(){
        double tong = 0;
        for (MyPham myPham :dsMyPham){
            tong += myPham.getDonGia();
        }
        return tong;
    }

    public int getIdHd() {
        return idHd;
    }

    public void setIdHd(int idHd) {
        this.idHd = idHd;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public List<MyPham> getDsMyPham() {
        return dsMyPham;
    }

    public void setDsMyPham(List<MyPham> dsMyPham) {
        this.dsMyPham = dsMyPham;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
