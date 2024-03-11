package Buoi6.Bai17.Bai17;

import java.io.Serializable;

public class DatTour implements Serializable {
    private int idTour;
    private int idKh;
    private int soLuong;
    private String ngayDat;

    public DatTour(int idTour, int idKh, int soLuong, String ngayDat) {
        this.idTour = idTour;
        this.idKh = idKh;
        this.soLuong = soLuong;
        this.ngayDat = ngayDat;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    @Override
    public String toString() {
        return "DatTour{" +
                "idTour=" + idTour +
                ", idKh=" + idKh +
                ", soLuong=" + soLuong +
                ", ngayDat='" + ngayDat + '\'' +
                '}';
    }
}
