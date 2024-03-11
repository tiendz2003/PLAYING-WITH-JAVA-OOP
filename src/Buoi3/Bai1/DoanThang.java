package Buoi3.Bai1;

import java.util.Scanner;

public class DoanThang extends Diem {
    private Diem diemD;
    private Diem diemC;

    public DoanThang() {
        diemD = new Diem();
        diemC = new Diem();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do diem dau: ");
        diemD.nhap();
        System.out.println("Nhap toa do diem cuoi: ");
        diemC.nhap();
    }

    public void xuat() {
        System.out.println("Doan thang tu diem dau (" + diemD.getX() + ", " + diemD.getY() + ") den diem cuoi ("
                + diemC.getX() + ", " + diemC.getY() + ")");
    }

    public double tinhChieuDai() {
        double l;
        l =Math.sqrt(Math.pow(diemC.getX() - diemD.getX(), 2) + Math.pow(diemC.getY() - diemD.getY(), 2));
        return l;
    }
}
