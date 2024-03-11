package Buoi6.Bai17.Bai17;

import java.io.Serializable;

public class Tour implements Serializable {
    private int idTour;
    private String kieuTour;
    private String ttTour;
    private double donGia;

    public Tour(int idTour, String kieuTour, String ttTour, double donGia) {
        this.idTour = idTour;
        this.kieuTour = kieuTour;
        this.ttTour = ttTour;
        this.donGia = donGia;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getKieuTour() {
        return kieuTour;
    }

    public void setKieuTour(String kieuTour) {
        this.kieuTour = kieuTour;
    }

    public String getTtTour() {
        return ttTour;
    }

    public void setTtTour(String ttTour) {
        this.ttTour = ttTour;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "idTour=" + idTour +
                ", kieuTour='" + kieuTour + '\'' +
                ", ttTour='" + ttTour + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}
