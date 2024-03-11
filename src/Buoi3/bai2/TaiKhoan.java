package Buoi3.bai2;

import java.util.Scanner;

public class TaiKhoan {
    public int stk;
    public String tentk;
    public float sotientk;
    public static float phi=500;
    public static float ls = 0.05F;



    public TaiKhoan(int stk, String tentk) {
        this.stk = stk;
        this.tentk = tentk;
        this.sotientk = 100;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public float getSotientk() {
        return sotientk;
    }

    public void setSotientk(float sotientk) {
        this.sotientk = sotientk;
    }

    public static TaiKhoan timKiemTaiKhoanTheoTen(TaiKhoan[] danhSachTaiKhoan, String ten) {
        for (TaiKhoan taiKhoan : danhSachTaiKhoan) {
            if (taiKhoan.getTentk().equals(ten)) {
                return taiKhoan;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Thong tin Tai Khoan:" +
                "stk: " + stk + ", Tentk='" + tentk + '\'' +
                ", Sotientk=" + sotientk;
    }


    public double guiTien(double soTienNap) {
        return sotientk+soTienNap;
    }



    public double rutTien(double soTien,double tienRut) {
        return soTien = soTien- (tienRut + phi) ;
    }


    public double daoHan() {
        return sotientk+sotientk*ls;
    }
}
