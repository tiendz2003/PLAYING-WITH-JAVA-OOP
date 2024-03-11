package Buoi6.Bai17.Bai17;

import java.io.Serializable;

public class KhachHang implements Serializable {
    private int idKh;
    private String tenKh;
    private String kieuKh;

    public KhachHang(int idKh, String tenKh, String kieuKh) {
        this.idKh = idKh;
        this.tenKh = tenKh;
        this.kieuKh = kieuKh;
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

    public String getKieuKh() {
        return kieuKh;
    }

    public void setKieuKh(String kieuKh) {
        this.kieuKh = kieuKh;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "idKh=" + idKh +
                ", tenKh='" + tenKh + '\'' +
                ", kieuKh='" + kieuKh + '\'' +
                '}';
    }
}
