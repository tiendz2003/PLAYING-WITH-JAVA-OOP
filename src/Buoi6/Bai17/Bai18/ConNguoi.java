package Buoi6.Bai17.Bai18;

import java.util.Scanner;

public abstract class ConNguoi {
    public String hoTen;
    public  int soNam;
    public static double luongCoBan = 450000;

    public ConNguoi(String hoTen, int soNam) {
        this.hoTen = hoTen;
        this.soNam = soNam;
    }

    public abstract double tinhLuong();
    public abstract double phuCap();

}
