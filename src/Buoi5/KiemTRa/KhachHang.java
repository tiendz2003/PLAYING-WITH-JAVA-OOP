package Buoi5.KiemTRa;

import java.util.ArrayList;

public class KhachHang {
    private int idKh;
    private String tenKh;
    private int sdt;
    private  String diaChi;
    private ArrayList<MyPham> dsMyPham;

    public KhachHang(int idKh, String tenKh, int sdt, String diaChi) {
        this.idKh = idKh;
        this.tenKh = tenKh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        dsMyPham = new ArrayList<>();
    }
    public void themMyPham(MyPham myPham){
        dsMyPham.add(myPham);
    }
    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
